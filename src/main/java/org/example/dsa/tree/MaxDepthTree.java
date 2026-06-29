package org.example.dsa.tree;

public class MaxDepthTree {


  public static int mxdept(TreeNode node){
    if(node==null) return 0;
    int left=mxdept(node.left);
    int right=mxdept(node.right);
     return 1+Math.max(left,right);
     // int left=mxdept(node.left) int right=mxdept(node.right)
    // 1+Math.max(left,right);
  }

  public static void main(String[] args) {
    int totalDepth = mxdept(TreeNode.getTreeNode());
    System.out.println("Total depth is: "+ totalDepth);
  }
}
