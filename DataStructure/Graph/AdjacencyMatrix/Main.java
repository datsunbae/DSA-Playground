package Graph.AdjacencyMatrix;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 2);

        System.out.println(graph.checkEdge(0, 1));

        graph.print();

    }
}