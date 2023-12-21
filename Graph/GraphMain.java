package Graph;

public class GraphMain {
    public static void main(String[] args) {
        GraphLogic elements = new GraphLogic(10);
        elements.addEdge(7, 2);
        elements.addEdge(7, 8);
        elements.addEdge(2, 9);
        elements.addEdge(2, 6);
        elements.addEdge(9, 4);
        // elements.addEdge(3, 2);
        // elements.addEdge(5, 4);
        // elements.addEdge(5, 3);
        // elements.addEdge(4, 1);
        elements.addEdge(4, 6);
        elements.addEdge(8, 6);
        elements.addEdge(6, 2);

        elements.display();
        elements.bfs(2);
        elements.dfs(2);
    }
}
