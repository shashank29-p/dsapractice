package org.example.dsa;

import java.util.HashMap;
import java.util.Map;
import org.example.dsa.LinkedList.Node;

public class LinkedListCycle {

  class Node {

    int val;
    Node next;

    public Node(int x) {
      val = x;
      next = null;
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

  public boolean findCycle() {
    if (head == null || head.next == null) {
      return false;
    }
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

}
