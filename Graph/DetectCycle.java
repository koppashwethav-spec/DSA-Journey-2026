package Graph;

import java.util.ArrayList;

public class DetectCycle {

    static boolean dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited, int parent) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                if (dfs(graph, neighbor, visited, node))
                    return true;

            } else if (neighbor != parent) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Graph with Cycle
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(0);
        graph.get(0).add(2);

        graph.get(2).add(3);
        graph.get(3).add(2);

        boolean[] visited = new boolean[vertices];

        if (dfs(graph, 0, visited, -1))
            System.out.println("Cycle Detected");
        else
            System.out.println("No Cycle");
    }
}