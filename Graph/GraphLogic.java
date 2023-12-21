package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphLogic {
    ArrayList<Edges> list = new ArrayList<Edges>();
    int vertices;

    public GraphLogic(int vertices) {
        this.vertices = vertices;
    }

    public void addEdge(int source, int destination) {
        Edges edge = new Edges(source, destination);
        list.add(edge);
    }

    // DFS
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        visited[startVertex] = true;
        stack.add(startVertex);
        System.out.println();
        System.out.println("DFS Traversal:");

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            System.out.print(currentVertex + " ");

            for (Edges edge : list) {
                if (edge.getSource() == currentVertex && !visited[edge.getDestination()]) {
                    visited[edge.getDestination()] = true;
                    stack.add(edge.getDestination());
                }
            }
        }
        System.out.println();
    }

    // bfs
    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];

        visited[start] = true;
        queue.add(start);

        System.out.println("The BFS is ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (Edges edge : list) {
                if (edge.getSource() == current && !visited[edge.getDestination()]) {
                    visited[edge.getDestination()] = true;
                    queue.add(edge.getDestination());
                }
            }
        }
    }

    public void display() {
        System.out.println("Graph Edges:");
        list.forEach(edg -> {
            System.out.println(edg.getSource() + " -> " + edg.getDestination());
        });
    }
}
