package org.example.dsa.linkedList;

import javax.swing.tree.TreeNode;

public class SinglyLinkedList {

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    //insertAtBeg(head);
   // insertAtEnd(head);
   // insertAtLocation(head,25,3);

    deleteAtEnd(head);
  }

  public static Node reverseList(Node head) {
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
    return prev;
  }


  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data + "->");
      temp = temp.next;
    }
  }

  public static Node insertAtBeg(Node head) {
    Node newNode = new Node(1);
    if (head == null) {
      return newNode;
    }
    //1 10->20->null
    newNode.next = head;
    while (newNode != null) {
      System.out.print(newNode.data + "->");
      newNode = newNode.next;
    }
    return newNode;
  }

  public static Node insertAtEnd(Node head){
    Node newNode = new Node(50);
    if (head == null) {
      return newNode;
    }
    Node cur=head;
    //10->20->30->40
    while(cur.next!=null){
      cur=cur.next;
    }
    cur.next=newNode;
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    return head;
  }

  public static Node insertAtLocation(Node head, int val, int pos){
    Node newNode = new Node(val);
    if(head==null){
      return newNode;
    }
    if(pos==1){
      newNode.next=head;
      return newNode;
    }
    Node current=head;
    //10-20-30 3 25
    for(int i=1; i<pos-1 && current.next!=null; i++){
        current=current.next;
    }
    newNode.next=current.next;
    current.next=newNode;

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    return head;
  }


  public static Node deleteAtBeg(Node head){
    if(head==null) return null;
    Node temp=head;
    head=head.next;
    temp=null;
    return head;
  }

  public static Node deleteAtEnd(Node head){
    Node temp=head;
    if(head==null) return null;
    if(temp.next==null) return null;
    //10->20->30
    while(temp.next.next!=null){
      temp=temp.next;
    }
    temp.next=null;
    Node current=head;
    while (current != null) {
      System.out.print(current.data + "->");
      current = current.next;
    }
    return temp;
  }

 /* public static Node deleteAtLocation(){

  }

  public static Node updateVal(){

  }*/
}
