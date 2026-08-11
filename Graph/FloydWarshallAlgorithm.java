package Graph;

public class FloydWarshallAlgorithm {

    static final int INF = 99999;

    static void floydWarshall(int[][] graph) {

        int n = graph.length;

        int[][] distance = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = graph[i][j];
            }
        }

        for (int k = 0; k < n; k++) {

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    if (distance[i][k] != INF
                            && distance[k][j] != INF) {

                        distance[i][j] = Math.min(
                                distance[i][j],
                                distance[i][k] + distance[k][j]
                        );
                    }
                }
            }
        }

        System.out.println("Shortest Distance Matrix:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (distance[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(distance[i][j] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
                {0, 4, 11, INF},
                {INF, 0, 2, INF},
                {INF, INF, 0, 3},
                {INF, INF, INF, 0}
        };

        floydWarshall(graph);
    }
}