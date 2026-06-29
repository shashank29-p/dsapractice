package org.example.dsa.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightMostNodeOfTree {

  public static void main(String[] args) {
    List<Integer> list=rightMostNodes(TreeNode.getTreeNode());
    list.forEach(System.out::println);
  }


  public static List<Integer> rightMostNodes(TreeNode root){

    //TRICK if(i==size-1)
    List<Integer> rightNode=new ArrayList<>();
    if(root==null) return rightNode;

    Queue<TreeNode> q=new LinkedList<>();
    q.offer(root);

    while(!q.isEmpty()){
      int size= q.size();
      for(int i=0;i<size;i++){
        TreeNode node= q.poll();
        if(i==size-1){
          rightNode.add(node.data);
        }
        if(node.left!=null) q.add(node.left);
        if(node.right!=null) q.add(node.right);
      }
    }
    return rightNode;
  }

}
