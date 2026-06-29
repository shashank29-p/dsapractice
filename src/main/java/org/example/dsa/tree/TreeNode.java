package org.example.dsa.tree;

public class TreeNode {

  int data;

  TreeNode left;

  TreeNode right;

  public TreeNode(int x){
    this.data=x;
    this.left=null;
    this.right=null;
  }

  public static TreeNode getTreeNode(){
    TreeNode treeNode = new TreeNode(1);
    treeNode.left = new TreeNode(2);
    treeNode.right = new TreeNode(3);
    treeNode.left.left = new TreeNode(4);
    treeNode.left.right = new TreeNode(5);
    treeNode.right.left = new TreeNode(5);
    treeNode.right.right = new TreeNode(4);
    return treeNode;
  }

}
