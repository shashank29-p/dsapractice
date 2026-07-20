package org.example.dsa.custom;

public class CustomLinkedList {

    public static class CustomNode{
        int data;
        CustomNode next;
        CustomNode(int data){
            this.data=data;
        }
    }

    static CustomNode head;

    static int size;

    public static void insert(int data){
        CustomNode newNode=new CustomNode(data);
        if(head==null){
            head=newNode;
        }else{
            CustomNode temp=newNode;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=head;
        }
        size++;
    }

    public static int get(int index){
        CustomNode temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    public static void remove(){
        while(head!=null){
            head=head.next;
            size--;
        }
    }
}
