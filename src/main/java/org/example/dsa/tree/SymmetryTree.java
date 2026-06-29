package org.example.dsa.tree;

public class SymmetryTree {

  public static void main(String[] args) {
    boolean isSymmetric= isSymmetry(TreeNode.getTreeNode().left,TreeNode.getTreeNode().right);

    System.out.println("Is it symmetric? -" + isSymmetric);
  }

  public static boolean isSymmetry(TreeNode p,TreeNode q){

    if(p==null && q==null) return true;
    if(p==null || q==null) return false;

    if(p.data!=q.data) return false;

    return isSymmetry(p.left,q.right) && isSymmetry(p.right,q.left);

  }

}
