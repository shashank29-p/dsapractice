package org.example.dsa.tree;

public class PathSum {

  public static void main(String[] args) {
    boolean isMet=sum(TreeNode.getTreeNode(),7);
    System.out.println("Is found:" + isMet);
  }

  public static boolean sum(TreeNode treeNode, int target){
    //key idea= keep subtracting target= target-node.data

    if(treeNode==null) return false;
    if(treeNode.left==null &&treeNode.right==null){
      return target== treeNode.data;
    }

    int remaining= target-treeNode.data;
    return sum(treeNode.left,remaining) || sum(treeNode.right,remaining);

    // if(treeNode.left===null && treeNode.right==null){ return target==treenode.data
    //int remain=target-treenode.data
    //sum(treeNode.left,remaining)|| sum(treeNode.right,remaining)
  }
}
