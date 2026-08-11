package Graph;

import java.util.Arrays;

public class BellmanFordAlgorithm {

    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void bellmanFord(
            Edge[] edges,
            int vertices,
            int source) {

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        for (int i = 1; i <= vertices - 1; i++) {

            for (Edge edge : edges) {

                if (distance[edge.source] != Integer.MAX_VALUE
                        && distance[edge.source] + edge.weight
                        < distance[edge.destination]) {

                    distance[edge.destination] =
                            distance[edge.source] + edge.weight;
                }
            }
        }

        for (Edge edge : edges) {

            if (distance[edge.source] != Integer.MAX_VALUE
                    && distance[edge.source] + edge.weight
                    < distance[edge.destination]) {

                System.out.println(
                        "Negative Weight Cycle Detected"
                );
                return;
            }
        }

        System.out.println("Shortest Distances:");

        for (int i = 0; i < vertices; i++) {

            System.out.println(
                    source + " → " + i + " = " + distance[i]
            );
        }
    }

    public static void main(String[] args) {

        int vertices = 4;

        Edge[] edges = {
                new Edge(0, 1, 4),
                new Edge(0, 2, 5),
                new Edge(1, 2, -3),
                new Edge(2, 3, 4)
        };

        bellmanFord(edges, vertices, 0);
    }
}