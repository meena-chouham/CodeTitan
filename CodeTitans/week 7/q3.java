import java.util.*;
public class q3 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
    for (int[] pre : prerequisites) graph.get(pre[1]).add(pre[0]);
    int[] visited = new int[numCourses];
    for (int i = 0; i < numCourses; i++) {
        if (!dfs(graph, visited, i)) return false;
    }
    return true;
}

private boolean dfs(List<List<Integer>> graph, int[] visited, int course) {
    if (visited[course] == 1) return false;
    if (visited[course] == 2) return true;
    visited[course] = 1;
    for (int next : graph.get(course)) {
        if (!dfs(graph, visited, next)) return false;
    }
    visited[course] = 2;
    return true;
}

}
