package Graph;

public class GraphMain {
    public static void main(String[] args) {
        GraphLogic elements = new GraphLogic(6);
        elements.addEdge(3,7);
        elements.addEdge(3,6);
        elements.addEdge(3,2);
        elements.addEdge(7,4);
        elements.addEdge(7,2);
        elements.addEdge(6,2);
        elements.addEdge(4,9);
        elements.addEdge(2,9);
        elements.display();
    }
}
