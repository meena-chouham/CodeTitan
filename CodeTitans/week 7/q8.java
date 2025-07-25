import java.util.PriorityQueue;

public class q8 {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int d = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                pq.add(new int[] { i, j, d });
            }
        }
        int[] parent = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = i;
        int cost = 0, edges = 0;
        while (edges < n - 1) {
            int[] cur = pq.poll();
            int x = find(parent, cur[0]);
            int y = find(parent, cur[1]);
            if (x != y) {
                parent[x] = y;
                cost += cur[2];
                edges++;
            }
        }
        return cost;
    }

    int find(int[] parent, int i) {
        if (parent[i] != i)
            parent[i] = find(parent, parent[i]);
        return parent[i];
    }
}
