package org.example.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

  public static void main(String[] args) {
   TreeNode dfs=invertDFS(TreeNode.getTreeNode());
   printInorder(dfs);
  }

  public static TreeNode invertDFS(TreeNode node){

    if(node==null) return null;

    //SWAP

    TreeNode temp=node.left;
    node.left=node.right;
    node.right=temp;

    invertBFS(node.left);
    invertBFS(node.right);

    //Treenode tmp=node.left, node.left=node.right, node.right=tmp invert(node.left ) invert(node.rigjt

    return node;
  }

  static void printInorder(TreeNode node) {
    if (node == null) return;
    System.out.println(node.data);// Root
    printInorder(node.left);// Left
    printInorder(node.right);   // Right
  }
  public static TreeNode invertBFS(TreeNode node){
    if(node==null) return null;

    Queue<TreeNode> q=new LinkedList<>();
    q.add(node);

    while (!q.isEmpty()){
     TreeNode tree=q.poll();
     TreeNode temp= tree.left;
      tree.left=tree.right;
      tree.right=temp;
      if(tree.left!=null) q.add(tree.left);
      if(tree.right!=null) q.add(tree.right);

    }
    return node;
  }

}
