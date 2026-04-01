package org.example.dsa;

public class LinkedList {

  //NOTE: SINGLY LINKED LIST
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
        current= current.next;
    }
    current.next=newNode;
  }

  public void delete(int element) {
    if(head==null) return;
    if(head.data==element){
      head= head.next;
      return;
    }
    Node current=head;
    while (current.next!=null && current.next.data!=element){
      current=current.next;
    }
    if(current.next!=null){
        current.next = current.next.next;
    }
  }

  public void search(int element) {
    Node current =head;
    while( current !=null){
      if(current.data== element){
        System.out.println("Element found: "+element);
        return;
      }
      current= current.next;
    }
    System.out.println("Element not found: " + element);
  }


  public void printList(){
    Node current=head;
    while(current!=null){
      System.out.print(current.data+"-->");
      current=current.next;
    }
    System.out.println("%null");
  }

  public void deleteAll(int element){
    if(head==null) return;
    while (head!=null && head.data==element){
      head=head.next;
    }
    Node current=head;
    while (current!=null && current.next!=null){
      if(current.next.data==element){
        current.next=current.next.next;
      }else {
        current=current.next;
      }
    }
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.printList(); // 10 -> 20 -> 30 -> null

    list.search(20); // Element found: 20
    list.delete(10);
    list.printList(); // 20 -> 30 -> null
    list.search(10); // Element not found: 10
  }
}
