package org.example.dsa.linkedList;

public class FindInterSection {

    public static void main(String[] args) {
        Node shared = new Node(7);
        shared.next = new Node(8);

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = shared;

        Node node2 = new Node(4);
        node2.next = new Node(5);
        node2.next.next = shared;
        System.out.println(getIntersection(node,node2).data);
    }

    public static Node getIntersection(Node headA, Node headB){
      Node p1=headA;
      Node p2=headB;
      while(p1!=p2){
          p1= (p1==null) ? headB : p1.next;
          p2=(p2==null) ? headA : p2.next;
      }
      return p1;
    }

   /* Time

    O(m+n)

    Space

    O(1)*/
}
