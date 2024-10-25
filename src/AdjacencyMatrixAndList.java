public class AdjacencyMatrixAndList {
    public static void main(String[] args) {
        // 2D array to store 1/0 to represent edges
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println("--- Depth first Search ---");
        graph.depthFirstSearch(4);
        System.out.println("--- Breadth first Search ---");
        graph.breadthFirstSearch(4);
    }
}
