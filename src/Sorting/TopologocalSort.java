package Sorting;

import java.util.*;

public class TopologocalSort {
    static class Graph {
        private List<Vertex> adjacencyList;

        public Graph() {
            this.adjacencyList = new ArrayList<>();
        }

        public Graph(List<Vertex> adjacencyList) {
            this.adjacencyList = adjacencyList;
        }

        public void addNode(Vertex e) {
            this.adjacencyList.add(e);
        }

        public List<Vertex> getAdjacencyList() {
            return adjacencyList;
        }

        public Vertex getNode(int searchId) {
            for (Vertex vertex : this.getAdjacencyList()) {
                if (vertex.getId() == searchId) {
                    return vertex;
                }
            }
            return null;
        }

        public int getSize() {
            return this.adjacencyList.size();
        }

        @Override
        public String toString() {
            return "Graph{" +
                    "nodes=" + adjacencyList +
                    "}";
        }
    }

    static class Vertex {
        private int id;
        private List<Integer> neighbors;

        public Vertex(int id) {
            this.id = id;
            this.neighbors = new ArrayList<>();
        }

        public void addNeighbor(int e) {
            this.neighbors.add(e);
        }

        public int getId() {
            return id;
        }

        public List<Integer> getNeighbors() {
            return neighbors;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "id=" + id +
                    ", neighbors=" + neighbors +
                    "}" + "\n";
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        vertex1.addNeighbor(2);
        vertex2.addNeighbor(3);
        vertex4.addNeighbor(3);
        g.addNode(vertex1);
        g.addNode(vertex2);
        g.addNode(vertex3);
        g.addNode(vertex4);
        System.out.println(g);
    }

    private static void topoSort(Graph g) {

        // Fetching the number of nodes in the graph
        int V = g.getSize();

        // List where we'll be storing the topological order
        List<Integer> order = new ArrayList<>();

        // Map which indicates if a node is visited (has been processed by the algorithm)
        Map<Integer, Boolean> visited = new HashMap<>();
        for (Vertex tmp : g.getAdjacencyList())
            visited.put(tmp.getId(), false);

        // We go through the nodes using black magic
        for (Vertex tmp : g.getAdjacencyList()) {
            if (!visited.get(tmp.getId()))
                blackMagic(g, tmp.getId(), visited, order);
        }

        // We reverse the order we constructed to get the
        // proper toposorting
        Collections.reverse(order);
        System.out.println(order);
    }

    private static void blackMagic(Graph g, int v, Map<Integer, Boolean> visited, List<Integer> order) {
        // Mark the current node as visited
        visited.replace(v, true);
        Integer i;

        // We reuse the algorithm on all adjacent nodes to the current node
        for (Integer neighborId : g.getNode(v).getNeighbors()) {
            if (!visited.get(neighborId))
                blackMagic(g, neighborId, visited, order);
        }

        // Put the current node in the array
        order.add(v);
    }
}
