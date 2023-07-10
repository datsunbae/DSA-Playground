package Algorithms.DFS;

import java.util.*;

public class Graph {
    private LinkedList<Integer> listNodes[];
    private boolean[] visited;

    public Graph(int size) {
        listNodes = new LinkedList[size];
        visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            listNodes[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dst) {
        listNodes[src].add(dst);
    }

    public void DFS(int src) {
        if (visited[src]) {
            return;
        } else {
            visited[src] = true;
            System.out.println(src + " = visited");
        }

        Iterator<Integer> iterator = listNodes[src].listIterator();

        while (iterator.hasNext()) {
            int node = iterator.next();
            if (!visited[node]) {
                DFS(node);
            }
        }
    }

}
