package Graph;

import java.util.ArrayList;

public class GraphLogic {
    ArrayList<Edges> edges = new ArrayList<Edges>();
    int vertices;

    public GraphLogic(int vertices) {
        this.vertices = vertices;
    }
    public void addEdge(int source, int destination){
        Edges edge = new Edges(source, destination);
        edges.add(edge);
    }
    public void display(){
        System.out.println("Graph Edges:");
        edges.forEach(edge -> {
            System.out.println(edge.getSource() + " -> " + edge.getDestination());
        });
    }
}
