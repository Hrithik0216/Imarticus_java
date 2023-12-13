package Graph;

public class GraphMain {
    public static void main(String[] args) {
        GraphLogic elements = new GraphLogic(6);
        elements.addEdge(1, 2);
        elements.addEdge(1, 4);
        elements.addEdge(2, 3);
        elements.addEdge(2, 1);
        elements.addEdge(3, 5);
        elements.addEdge(3, 2);
        elements.addEdge(5, 4);
        elements.addEdge(5, 3);
        elements.addEdge(4, 1);
        elements.addEdge(4, 5);

        elements.display();
        // elements.bfs(1);
        elements.dfs(1);
    }
}
