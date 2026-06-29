package org.example.dsa;
class Payment {

  private int val;

  public Payment(int val) {
    this.val = val;
  }

  public void doPay() {
    System.out.println(val);
    System.out.println("done");
  }
}

class UPI extends Payment {

  private int id;

  public UPI(int id) {
    super(id);
    this.id = id;
  }

  @Override
  public void doPay() {
    System.out.println(id);
    System.out.println("upi done");
    super.doPay();
  }
}
public class PeakElement {

  public static void main(String[] args) {
  Payment u= new UPI(100);
  u.doPay();
  }

}
