package org.example.dsa.graph;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphDfs {

  public static void main(String[] args) {
    Map<Integer, List<Integer>> graph=new HashMap<>();
    Set<Integer> visited=new HashSet<>();

    graph.put(0, Arrays.asList(1,2));
    graph.put(1, Arrays.asList(0,3));
    graph.put(2, Arrays.asList(1,2));
    graph.put(3, Arrays.asList(1));
    dfs(0,visited,graph);
  }

  private static void dfs(int node,Set<Integer> visited, Map<Integer, List<Integer>> graph){
    if(visited.contains(node)) return;

    visited.add(node);

    System.out.print(node+"-->");

    for(int num: graph.get(node)){
      dfs(num,visited,graph);
    }
  }

}
