package org.example.dsa.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LruCache {

  private Map<Integer,Node> map;
  private int capacity;
  private Node head;
  private Node tail;

  public static void main(String[] args) {
    LruCache cache = new LruCache(3); // capacity = 3

    cache.put(1, 10);
    cache.put(2, 20);
    cache.put(3, 30);

    System.out.println(cache.get(1)); // 10   → moves 1 to front

    cache.put(4, 40);                 // capacity full → evicts LRU (key 2)

    System.out.println(cache.get(2)); // -1   → was evicted
    System.out.println(cache.get(3)); // 30
    System.out.println(cache.get(4)); // 40
  }

  public LruCache(int capacity){
    this.capacity= capacity;
    map=new HashMap<>();
    head=new Node(0,0);
    tail=new Node(0,0);

    head.next=tail;
    tail.prev=head;
  }

  private void addNode(Node node){
     node.next=head.next;
     node.prev=head;
     head.next.prev=node;
     head.next=node;
     //node.next=head.next, node.prev=head head.next.prev=node head.next=node
  }

  private void deleteNode(Node node){
    node.prev.next=node.next;
    node.next.prev=node.prev;
  }

  public int get(int key){
    if(!map.containsKey(key)){
      return -1;
    }
    Node node=map.get(key);
    deleteNode(node);
    addNode(node);
    return node.getValue();
  }

  public void put(int k,int v){
    if(map.containsKey(k)){
      Node node=map.get(k);
      node.setValue(v);
      deleteNode(node);
      addNode(node);
    }else {

      Node node=new Node(k,v);
      map.put(k,node);
      addNode(node);
      if(map.size()>capacity){
          Node lru=tail.prev;
          deleteNode(lru);
          map.remove(lru.getKey());
      }
    }

  }


  /*
  map<int,Node> map
  int capacity, Node head,tail;
  public lru(int capacity){
  this.capacity=capacity;
  map=new, head,tail=new node(0,0);
  head.next=tail
  tail.prev=head


  getNode - if(!map.contains) return -1 Node=map,get(key)
  delete,add, return node.getvalue

  put(int k,v) ->
*/
}
