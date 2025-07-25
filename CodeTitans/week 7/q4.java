import java.util.*;

public class q4 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
    int[] inDegree = new int[numCourses];
    for (int[] pre : prerequisites) {
        graph.get(pre[1]).add(pre[0]);
        inDegree[pre[0]]++;
    }
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < numCourses; i++) {
        if (inDegree[i] == 0) queue.offer(i);
    }
    int[] order = new int[numCourses];
    int idx = 0;
    while (!queue.isEmpty()) {
        int course = queue.poll();
        order[idx++] = course;
        for (int next : graph.get(course)) {
            inDegree[next]--;
            if (inDegree[next] == 0) queue.offer(next);
        }
    }
    return idx == numCourses ? order : new int[0];
}

}
