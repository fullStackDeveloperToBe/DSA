package com.linkedlist;

public class LinkList {

    private Node head;
    private Node tail;
    private int size;

    public LinkList() {
        this.size = 0;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int value, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    private void insertLast(int data) {

        if(tail == null) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;

    }

    private void insertMiddle(int data) {

    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
        //System.out.println(size);
    }

    public static void main(String[] args) {
        System.out.println("This is custom linked list");
        LinkList linkedlist = new LinkList();
        linkedlist.insertFirst(1);
        linkedlist.insertFirst(3);
        //linkedlist.insertLast(6);
        linkedlist.display();
    }
}
