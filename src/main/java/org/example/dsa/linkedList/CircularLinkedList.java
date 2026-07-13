package org.example.dsa.linkedList;

public class CircularLinkedList {

  //Singly CLL

  class Node {

    int data;
    Node next;

    Node prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev=null;
    }
  }

  Node head;
  Node tail;

  public void insert(int data){
    Node newNode=new Node(data);
    if(head==null){
      head=newNode;
      tail=newNode;
      newNode.next=head;
    }else {
      tail.next=newNode;
      tail=newNode;
      tail.next=head;
    }
  }

  public void delete(int data) {
    // 10->20->30->40 ->10
    if (head == null)
      return;

    if (head.data == data) {
      if (head == tail) {
        head = tail = null;
        return;
      }
      head = head.next;
      tail.next = head;
    }

    Node current = head;
    Node prev = null;

    do {
     prev=current; //10
     current= current.next; //20
      if(current.data==data) {
        prev.next = current.next;
        if (current == tail) {
          tail = prev;
        }
        return;
      }
    } while (current != head);
  }

  public void print() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    Node current = head;

    do {
      System.out.print(current.data + " → ");
      current=current.next;
    } while (current!=head);
    System.out.println(head.data);
  }

  public static void main(String[] args) {
    CircularLinkedList cl=new CircularLinkedList();

    cl.insert(10);
    cl.insert(20);
    cl.insert(30);
    cl.insert(40);

    cl.print();


    cl.delete(30);

    cl.print();
  }

}

