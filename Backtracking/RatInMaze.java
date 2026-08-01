package Backtracking;

public class RatInMaze {

    static int N = 4;

    static boolean solveMaze(int[][] maze, int x, int y) {

        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            return true;
        }

      
        if (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1) {


            maze[x][y] = 2;

            
            if (solveMaze(maze, x + 1, y))
                return true;

            if (solveMaze(maze, x, y + 1))
                return true;

            maze[x][y] = 1;
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        if (solveMaze(maze, 0, 0))
            System.out.println("Path Found");
        else
            System.out.println("No Path Exists");
    }
}