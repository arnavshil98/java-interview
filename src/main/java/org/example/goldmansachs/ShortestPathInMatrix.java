package org.example.goldmansachs;

import java.util.*;

public class ShortestPathInMatrix {

    static class Pair {
        int x, y, dist;
        Pair(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static int shortestPath(char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int sx = -1, sy = -1;

        // Find source 's'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 's') {
                    sx = i;
                    sy = j;
                    break;
                }
            }
        }

        // Directions: up, down, left, right
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        boolean[][] visited = new boolean[n][m];

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(sx, sy, 0));
        visited[sx][sy] = true;

        while (!queue.isEmpty()) {
            Pair p = queue.poll();

            // Destination found
            if (mat[p.x][p.y] == 'd') {
                return p.dist;
            }

            for (int[] d : dir) {
                int nx = p.x + d[0];
                int ny = p.y + d[1];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m &&
                        mat[nx][ny] != '0' && !visited[nx][ny]) {

                    visited[nx][ny] = true;
                    queue.add(new Pair(nx, ny, p.dist + 1));
                }
            }
        }

        return -1; // Not reachable
    }

    public static void main(String[] args) {
        char[][] mat = {
                {'0', '*', '0', 's'},
                {'*', '0', '*', '*'},
                {'0', '*', '0', '*'},
                {'*', 'd', '*', '*'}
        };

        System.out.println(shortestPath(mat));
    }
}

