import java.util.*;
public class q7 {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
    List<List<int[]>> graph = new ArrayList<>();
    for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
    for (int i = 0; i < edges.length; i++) {
        int u = edges[i][0], v = edges[i][1];
        graph.get(u).add(new int[]{v, i});
        graph.get(v).add(new int[]{u, i});
    }

    double[] prob = new double[n];
    prob[start] = 1.0;

    PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a, b) -> Double.compare(prob[b[0]], prob[a[0]])
    );
    pq.offer(new int[]{start});

    while (!pq.isEmpty()) {
        int u = pq.poll()[0];
        if (u == end) return prob[u];
        for (int[] neighbor : graph.get(u)) {
            int v = neighbor[0], idx = neighbor[1];
            double newProb = prob[u] * succProb[idx];
            if (newProb > prob[v]) {
                prob[v] = newProb;
                pq.offer(new int[]{v});
            }
        }
    }

    return 0.0;
}

}
