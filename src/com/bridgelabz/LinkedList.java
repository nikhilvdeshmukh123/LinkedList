package com.bridgelabz;

public class LinkedList {
    Node head;

    public void show(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}