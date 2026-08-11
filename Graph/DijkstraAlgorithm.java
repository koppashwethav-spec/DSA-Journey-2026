package Graph;

import java.util.*;

public class DijkstraAlgorithm {

    static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void dijkstra(
            List<List<Edge>> graph,
            int source) {

        int n = graph.size();

        int[] distance = new int[n];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(
                        Comparator.comparingInt(a -> a[1])
                );

        pq.add(new int[]{source, 0});

        while (!pq.isEmpty()) {

            int[] current = pq.poll();

            int node = current[0];
            int dist = current[1];

            if (dist > distance[node]) {
                continue;
            }

            for (Edge edge : graph.get(node)) {

                int newDistance =
                        dist + edge.weight;

                if (newDistance < distance[edge.destination]) {

                    distance[edge.destination] = newDistance;

                    pq.add(new int[]{
                            edge.destination,
                            newDistance
                    });
                }
            }
        }

        System.out.println("Shortest Distances:");

        for (int i = 0; i < n; i++) {
            System.out.println(
                    "0 → " + i + " = " + distance[i]
            );
        }
    }

    public static void main(String[] args) {

        int vertices = 4;

        List<List<Edge>> graph =
                new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 1));

        graph.get(1).add(new Edge(3, 2));

        graph.get(2).add(new Edge(3, 5));

        dijkstra(graph, 0);
    }
}