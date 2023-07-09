package Graph.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> arrayListNode;

    public Graph() {
        this.arrayListNode = new ArrayList<LinkedList<Node>>();
    }

    public void addNode(Node node) {
        LinkedList<Node> listNode = new LinkedList<Node>();
        listNode.add(node);
        arrayListNode.add(listNode);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node> currentList = arrayListNode.get(src);
        Node dstNode = arrayListNode.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = arrayListNode.get(src);
        Node dstNode = arrayListNode.get(dst).get(0);

        for (Node node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (LinkedList<Node> listNodes : arrayListNode) {
            for (Node node : listNodes) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }

}
