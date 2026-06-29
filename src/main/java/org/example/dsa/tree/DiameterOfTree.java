package org.example.dsa.tree;

public class DiameterOfTree {

  static int max = 0;

  public static void main(String[] args) {
    height(TreeNode.getTreeNode());
     System.out.println(max);
  }

  public static int height(TreeNode treeNode) {
    //key idea: diameter=left height+right height
    if (treeNode == null) {
      return 0;
    }

    int left = height(treeNode.left);
    int right = height(treeNode.right);
    max = Math.max(max, left + right);

    return  1 + Math.max(left, right);
  }

}
