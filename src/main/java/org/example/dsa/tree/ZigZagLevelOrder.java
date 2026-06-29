package org.example.dsa.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrder {

  public static void main(String[] args) {

  }

  public static List<List<Integer>> zigZagTree(TreeNode root){
    //trick same as level order but new bool flag isLeftToright true default
    List<List<Integer>> result=new ArrayList<>();
    if(root==null) return result;

    Queue<TreeNode> q=new LinkedList<>();
    q.offer(root);
    boolean isLeftToRight=true;
    while (!q.isEmpty()){
      int size=q.size();
      LinkedList<Integer> intMedResult=new LinkedList<>();
      for(int i=0;i<size;i++){
        TreeNode node=q.poll();
        if(isLeftToRight){
          intMedResult.addLast(node.data);
        }else {
          intMedResult.addFirst(node.data);
        }

        if(node.left!=null) q.add(node.left);
        if(node.right!=null) q.add(node.right);
      }
      result.add(intMedResult);
      isLeftToRight=!isLeftToRight;
    }
    return result;
  }
}
