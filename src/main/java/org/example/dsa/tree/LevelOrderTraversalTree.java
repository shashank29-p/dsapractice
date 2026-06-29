package org.example.dsa.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalTree {


  public static void main(String[] args) {

  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    while (!q.isEmpty()) {
      List<Integer> values = new ArrayList<>();
      int size = q.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = q.poll();
        values.add(node.data);

        if(node.left!=null) q.add(node.left);
        if(node.right!=null) q.add(node.right);
      }
      result.add(values);
    }
    return result;
  }

}
