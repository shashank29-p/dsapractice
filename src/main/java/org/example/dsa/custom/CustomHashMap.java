package org.example.dsa.custom;

public class CustomHashMap {

    static class MyHashMapNode {
        int key;
        String value;
        MyHashMapNode next;

        MyHashMapNode(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    MyHashMapNode[] buckets;

    public CustomHashMap() {
        buckets = new MyHashMapNode[16];
    }

    private int getIndex(int key) {
        return key % buckets.length;

    }

    public void put(int key, String value) {

        int index=getIndex(key);
        MyHashMapNode head=buckets[index];
        //bucket empty case
        if(head==null){
            buckets[index]=new MyHashMapNode(key,value);
            return;
        }

        MyHashMapNode temp=head;
        //key already present
        while (temp!=null){
            if(temp.key==key){
                temp.value=value;
                return;
            }
            if(temp.next==null) break;
            temp=temp.next;
        }
        temp.next=new MyHashMapNode(key,value);
    }

}

