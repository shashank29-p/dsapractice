package org.example;

public class Boolcheck {

  public static void main(String[] args) {
    js j=new js();
   j.setFalse(true);
   j.setTrue(false);
    System.out.println( j.isFalse || j.isTrue);
  }

}
class js{
   boolean isTrue;
   boolean isFalse;

  public boolean isTrue() {
    return isTrue;
  }

  public void setTrue(boolean aTrue) {
    isTrue = aTrue;
  }

  public boolean isFalse() {
    return isFalse;
  }

  public void setFalse(boolean aFalse) {
    isFalse = aFalse;
  }
}