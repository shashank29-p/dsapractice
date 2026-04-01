package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {

  public static void main(String[] args) {
    String sample = "resourceId=/subscriptions/subscription_id/resourceGroups/rg_name/providers/Microsoft.Compute/virtualMachines/resource_name/i=xxxxxxxxx/y=2021/m=03/d=13/h=15/m=00/PT1H.json";
    StringBuilder ac = new StringBuilder(sample.substring(11, sample.indexOf("/i=xxxxxxxxx")));
    String bc = sample.substring(sample.indexOf("/i=xxxxxxxxx"));
    int abc=ac.lastIndexOf("/");
    StringBuilder sc= new StringBuilder(ac.replace(abc,ac.length(),"/vm_name").append(bc));
    System.out.println(sc);
    int[] abx={1,2,3};
    int[] cbx={2,4,5};
    // boxed is used to convert wrapper class
    List<Integer> streamInt= Arrays.stream(abx).filter(num-> Arrays.stream(cbx).anyMatch(num2->num2==num)).boxed().collect(
        Collectors.toList());
    System.out.println(streamInt);
  }

}
