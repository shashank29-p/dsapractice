package org.example.dsa;

public class ReverseLinkedList {

  class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head;

  public void insert(int element) {
    Node newNode = new Node(element);
    if (head == null) {
      head = newNode;
      return;
    }
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
  }

  public void reverseList() {
    //head->1->2->3->4->null
    Node prev = null;
    Node current = head;

    while (current != null) {
      Node next = current.next;  // Step 1: remember next
      current.next = prev;           // Step 2: reverse pointer
      prev = current;                // Step 3: move prev
      current = next;                // Step 4: move current
    }
    System.out.println(prev);
  }

  public static void main(String[] args) {
    ReverseLinkedList rl = new ReverseLinkedList();
    rl.insert(1);
    rl.insert(2);
    rl.insert(3);
    rl.insert(4);
    rl.reverseList();
  }

}
