package Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_DS {
    public static void main(String[] args){
        Queue<String> priorityQueue = new PriorityQueue<String>();

        priorityQueue.offer("C");
        priorityQueue.offer("A");
        priorityQueue.offer("B");
        priorityQueue.offer("D");
        priorityQueue.offer("F");
        priorityQueue.offer("E");

        System.out.println("Priority Queue");
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

        Queue<String> priorityQueueReverse = new PriorityQueue<String>(Collections.reverseOrder());

        priorityQueueReverse.offer("C");
        priorityQueueReverse.offer("A");
        priorityQueueReverse.offer("B");
        priorityQueueReverse.offer("D");
        priorityQueueReverse.offer("F");
        priorityQueueReverse.offer("E");

        System.out.println("Priority Queue Reverse");
        while(!priorityQueueReverse.isEmpty()){
            System.out.println(priorityQueueReverse.poll());
        }
    }
    
}
