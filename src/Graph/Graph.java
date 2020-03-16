package Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private static List<Vertex> adjacencyList = new ArrayList<>();

    static class Vertex {
        int data;
        List<Edge> list = new ArrayList<>();
        boolean visited = false;

        public Vertex(int i) {
            this.data = i;
        }
    }

    static class Edge {
        Vertex start;
        Vertex end;
        int weight;
    }

    public static void main(String[] args) {
        createGraph();
    }

    private static void createGraph() {
        Vertex vertex = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);

        Edge edge1 = new Edge();
        edge1.start = vertex;
        edge1.end = vertex2;

        Edge edge2 = new Edge();
        edge2.start = vertex2;
        edge2.end = vertex3;

        Edge edge3 = new Edge();
        edge3.start = vertex3;
        edge3.end = vertex;

        Edge edge4 = new Edge();
        edge4.start = vertex;
        edge4.end = vertex3;

        Edge edge5 = new Edge();
        edge5.start = vertex2;
        edge5.end = vertex;

        Edge edge6 = new Edge();
        edge6.start = vertex3;
        edge6.end = vertex2;

        vertex.list.add(edge1);
        vertex2.list.add(edge2);
        vertex3.list.add(edge3);

        vertex.list.add(edge4);
        vertex2.list.add(edge5);
        vertex3.list.add(edge6);

        adjacencyList.add(vertex);
        adjacencyList.add(vertex2);
        adjacencyList.add(vertex3);
//        DFS(vertex)
        BFS();

    }

    private static void DFS(Vertex vertex) {

        if (vertex == null) return;
        System.out.println(vertex.data);
        vertex.visited = true;
        for (int i = 0; i < vertex.list.size(); i++) {

            Edge edge = vertex.list.get(i);
            Vertex vertex1 = edge.end;
            if (vertex1.visited == false)
                DFS(vertex1);
        }


    }

    private static void BFS() {
        for (int i = 0; i < adjacencyList.size(); i++) {

            Vertex vertex = adjacencyList.get(i);
            if (vertex.visited == false) {
                System.out.println(vertex.data);
                for (Edge edge : vertex.list) {
                    if (vertex.visited == false) {
                        System.out.println(edge.end.data);
                        edge.end.visited = true;
                    }
                }
            }
        }
    }
}
