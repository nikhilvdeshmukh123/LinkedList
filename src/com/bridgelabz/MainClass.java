package com.bridgelabz;

public class MainClass {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(56);
        linkedList.addLast(70);
        linkedList.insertBetween(56,70,30);
        linkedList.show();
    }
}