package org.example.dsa.linkedList;

public class ReverseLinkedList {

  public static void main(String[] args) {
    Node node=new Node(10);
    node.next=new Node(20);
    node.next.next=new Node(30);
    node.next.next.next=new Node(40);
    reverseList(node);
  }

  public static void reverseList(Node head){
    Node current = head;
    Node prev = null;
    Node next;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    while (prev != null) {
      System.out.print(prev.data);
      if (prev.next != null) {
        System.out.print(" -> ");
      }
      prev = prev.next;
    }
  }

  public static void findCycle(Node head){
    if(head==null||head.next==null) return;
    Node slow=head;
    Node fast=head;

    while (fast!=null){
      slow= slow.next;
      fast=fast.next.next;

      if(slow==fast){
        System.out.println("cycle");
      }
    }
    System.out.println("not cycle");
  }

}
