package org.example.dsa.tree;

public class SameTreeStructure {


  public static void main(String[] args) {
    TreeNode p=TreeNode.getTreeNode();
    TreeNode q=TreeNode.getTreeNode();
    boolean isSame=isSameTree(p,q);
    System.out.println("IS BOTH THE TREE SAME? -"+isSame);
  }


  public static boolean isSameTree(TreeNode p, TreeNode q){

    if(p==null && q==null) return true;
    if(p==null || q==null) return false;

    if(p.data!=q.data) return false;

    return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

  }

}
