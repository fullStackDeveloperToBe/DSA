package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.add(7);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

    }
}
