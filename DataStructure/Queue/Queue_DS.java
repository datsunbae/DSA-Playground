package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_DS {
    public static void main(String[] args){
        Queue<String> queueBooks = new LinkedList<String>();

        //Enqueue
        queueBooks.offer("Toi thay hoa vang tren co xanh");
        queueBooks.offer("De men phieu luu ky");
        queueBooks.offer("Bi kiep tan gai nha ho Nguyen");

        System.out.println("My queue: " + queueBooks);

        //Retrieves, but doesn't remove, the head of the queue, return null if the queue is empty.
        System.out.println("Peek: " + queueBooks.peek());

        //Retrieves, but doesn't remove, the head of the queue, throw an exception if the queue is empty.
        System.out.println("Element: " + queueBooks.element());

        //Dequeue
        String poolQueue = queueBooks.poll();
        System.out.println("Pool queue: " + poolQueue);
        System.out.println("My queue after dequeue: " + queueBooks);
        
        //Check queue empty
        System.out.println("Queue empty: " + queueBooks.isEmpty());
    }
}
