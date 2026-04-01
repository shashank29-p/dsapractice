package org.example.dsa;

public class DoublyLinkedList {

  class Node {

    int data;
    Node prev;

    Node next;

    public Node(int val) {
      data = val;
      prev = null;
      next = null;
    }
  }

  Node head;

  Node tail;

  public void insert(int element) {
    Node node = new Node(element);
    if (head == null) {
      head = tail = node;
      return;
    }
    tail.next = node; // [30].next → [40]
    node.prev = tail; //[40].prev → [30]
    tail = node; //tail ->[40]
  }

  public void printForward() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + "<-->");
      current = current.next;
    }
    System.out.println("null");
  }

  public void printBackward() {
    Node current = tail;
    while (current != null) {
      System.out.print(current.data + "<-->");
      current = current.prev;
    }
    System.out.println("null");
  }

  public void delete(int element) {
    if (head == null) {
      return;
    }
    //10<->20<->30
    if (head.data == element) { // 10==10
      head = head.next;  // head ->20
      if (head != null) {
        head.prev = null; //20.prev =null
      } else {
        tail = null;
      }
      return;
    }

    Node current = head;

    while (current != null && current.data != element) {
      current = current.next; //the moment it fails there is match
    }

    if (current == null) {
      System.out.println("Not Found: " + element);
      return;
    }

    if (current.next != null) { //20
      current.next.prev = current.prev; //10-30 link
    } else {
      tail = current.prev; //update the tail if no next element
    }

    if (current.prev != null) {
      current.prev.next = current.next;
    }

  }

  public void search(int element){
    Node current=head;
    while(head!=null && current.next!=null){
      if(current.data==element){
        System.out.println("Found: "+ element);
        return;
      }
      current=current.next;
    }
    System.out.println("Not Found: "+ element);
  }

  public static void main(String[] args) {
    DoublyLinkedList db = new DoublyLinkedList();
    db.insert(10);
    db.insert(20);
    db.insert(30);
    db.insert(40);

    db.printForward();
    System.out.println("----");
    db.printBackward();
    System.out.println("----");
    db.delete(30);

    db.printForward();
    System.out.println("----");
    db.printBackward();

    db.search(30);
    db.search(20);
  }
}
