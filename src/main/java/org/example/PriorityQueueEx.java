package org.example;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
/*
red black self balancing tree
 */
public class PriorityQueueEx {

    public static void main(String[] args) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        // Adding elements to the PriorityQueue
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(30);
        priorityQueue.add(10);

        System.out.println("PriorityQueue elements: " + priorityQueue);

        Iterator<Integer> it = priorityQueue.iterator();

        // Priority queues are based on priority heaps
        while (it.hasNext()) {
            System.out.println("Polling element: " + priorityQueue.poll());
        }


    }

}
