package org.example.dailyporblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class ContainsSpecifiedString {

  private static final double EARTH_RADIUS_KM = 6371.0; // Earth's radius in kilometers

  public static void main(String[] args) {
    try {
      // Fetch coordinates for the first location
      double[] coords1 = getCoordinates("Bangalore");
      if (coords1 == null) {
        System.out.println("Failed to fetch coordinates for Bangalore");
        return;
      }

      // Fetch coordinates for the second location
      double[] coords2 = getCoordinates("Delhi");
      if (coords2 == null) {
        System.out.println("Failed to fetch coordinates for Delhi");
        return;
      }

      // Calculate distance
      double distance = calculateDistance(coords1[0], coords1[1], coords2[0], coords2[1]);
      System.out.println("Distance: " + distance + " km");

      // Calculate price
      double price = (distance * 30) + 100;
      System.out.println("Price: " + price);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static double[] getCoordinates(String location) {
    try {
      String urlString = "https://nominatim.openstreetmap.org/search?q=LOCATION&format=json&limit=1";
      URL url = new URL(urlString.replace("LOCATION", location.trim().replace(" ", "%20")));
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET");
      connection.setRequestProperty("User-Agent", "Mozilla/5.0"); // Set user-agent to avoid 403 errors

      BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      StringBuilder response = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null) {
        response.append(line);
      }
      reader.close();

      // Parse JSON response
      JSONArray jsonArray = new JSONArray(response.toString());
      if (jsonArray.length() > 0) {
        JSONObject locationData = jsonArray.getJSONObject(0);
        double lat = locationData.getDouble("lat");
        double lon = locationData.getDouble("lon");
        return new double[]{lat, lon};
      } else {
        System.out.println("No results found for location: " + location);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null; // Return null if unable to fetch coordinates
  }

  public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
    // Convert degrees to radians
    double lat1Rad = Math.toRadians(lat1);
    double lon1Rad = Math.toRadians(lon1);
    double lat2Rad = Math.toRadians(lat2);
    double lon2Rad = Math.toRadians(lon2);

    // Differences in coordinates
    double deltaLat = lat2Rad - lat1Rad;
    double deltaLon = lon2Rad - lon1Rad;

    // Haversine formula
    double a = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2) +
        Math.cos(lat1Rad) * Math.cos(lat2Rad) *
            Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2);

    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

    // Distance in kilometers
    return EARTH_RADIUS_KM * c;
  }
}
