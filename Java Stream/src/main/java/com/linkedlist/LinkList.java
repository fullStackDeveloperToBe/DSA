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

        public Node(int data, Node next) {
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

    private void insertMiddle(int data, int index) {
        if(index == 0) {
            insertFirst(data);
            return;
        }
        if(index == size) {
            insertLast(data);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++) {
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
       // System.out.println(val);
        return val;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for(int i=0;i<index;i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteMiddle(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size) {
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.data;
        System.out.println(val);
        prev.next = prev.next.next;
        size--;
        return val;
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
//        linkedlist.insertFirst(1);
//        linkedlist.insertFirst(3);
//        linkedlist.insertLast(5);
//        linkedlist.insertMiddle(10, 2);
//        linkedlist.insertMiddle(100, 1);
//        linkedlist.display();
//        linkedlist.deleteFirst();
//        linkedlist.deleteLast();
//        linkedlist.display();
        System.out.println("-------------");
        linkedlist.insertFirst(21);
        linkedlist.insertLast(31);
        linkedlist.insertMiddle(25, 1);
        linkedlist.display();
        linkedlist.deleteMiddle(1);
        linkedlist.display();
    }
}
