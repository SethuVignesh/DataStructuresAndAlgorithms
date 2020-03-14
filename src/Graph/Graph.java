package Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

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

        vertex.list.add(edge1);
        vertex2.list.add(edge2);
        vertex3.list.add(edge3);
        traverse(vertex);

    }

    private static void traverse(Vertex vertex) {

        if (vertex==null) return;
        System.out.println(vertex.data);
        vertex.visited=true;
        for(int i=0;i<vertex.list.size();i++){
            if(vertex.list.get(i).end.visited==false)
             traverse(vertex.list.get(i).end);
        }


    }
}
