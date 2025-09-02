import java.util.*;

public class TreeDfs {
    static List<List<Integer>> adj; // adjacency list
    static int removableEdges = 0;  // counter

    // DFS function
    public static int dfs(int node, int parent) {
        int subtreeSize = 1; // count current node
        for (int child : adj.get(node)) {
            if (child != parent) {
                int childSize = dfs(child, node);
                if (childSize % 2 == 0) {
                    removableEdges++; // edge can be removed
                } else {
                    subtreeSize += childSize;
                }
            }
        }
        return subtreeSize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of nodes
        adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Read edges
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        dfs(1, -1); // root DFS from node 1
        System.out.println(removableEdges);
    }
}
