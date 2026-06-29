package org.example.dsa.lrucache;

public class Node {

  private int key;

  private int value;

  //DL
  Node next;

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  Node prev;

  public Node(int key,int value){
    this.key=key;
    this.value=value;
  }

}
