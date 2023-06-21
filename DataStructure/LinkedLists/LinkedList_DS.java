package LinkedLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedList_DS {
    public static void main(String[] args){

        //Implement stack with linked list
        System.out.println("\n---------IMPLEMENT STACK WITH LINKED LIST---------");
        LinkedList<String> linkedListStack = new LinkedList<String>();
        linkedListStack.push("A");
        linkedListStack.push("C");
        linkedListStack.push("D");
        linkedListStack.push("F");
        linkedListStack.push("E");
        System.out.println(linkedListStack);
        System.out.println(linkedListStack.pop());

        //Implement queue with linked list 
        System.out.println("\n---------IMPLEMENT QUEUE WITH LINKED LIST---------");
        LinkedList<String> linkedListQueue = new LinkedList<String>();
        linkedListQueue.offer("A");
        linkedListQueue.offer("C");
        linkedListQueue.offer("D");
        linkedListQueue.offer("F");
        linkedListQueue.offer("E");
        System.out.println(linkedListQueue);
        System.out.println(linkedListQueue.poll());

        //LinkedList
        System.out.println("\n---------LINKED LIST---------");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("F");
        linkedList.add("E");
        System.out.println(linkedList);

        System.out.println("Index of: " + linkedList.indexOf("A"));
        System.out.println("Remove element: " + linkedList.remove(2));
        System.out.println(linkedList);  
        linkedList.addFirst("0");
        linkedList.addLast("9");   
        System.out.println(linkedList);
        
        LinkedList<String> copyLinkedList = new LinkedList<String>();
        copyLinkedList = (LinkedList<String>) linkedList.clone();
        System.out.println("Copy linked list");
        System.out.println(copyLinkedList);

        //Add all linked lists
        Collection<String> collection = new ArrayList<String>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        linkedList.addAll(collection);
        System.out.println("Linked list after add all: " + linkedList);
        linkedList.addAll(2, collection);
        System.out.println("Linked list after add all: " + linkedList);

        //Clear the linked list
        linkedList.clear();
        System.out.println(linkedList);

    }
}
