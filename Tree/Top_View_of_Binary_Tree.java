
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Pair {
    TreeNode node;
    int vt;

    public Pair(TreeNode node, int vt) {
        this.node = node;
        this.vt = vt;
    }
}

public class Top_View_of_Binary_Tree {
    
    public List<Integer> TopView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        if (root == null) {
            return ll;
        }

        Queue<Pair> q = new ArrayDeque<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        q.add(new Pair(root, 0));
        
        while (!q.isEmpty()) {
            Pair rp = q.poll();
            
            if (!map.containsKey(rp.vt)) {
                map.put(rp.vt, rp.node.val);
            }
            
            if (rp.node.left != null) {
                q.add(new Pair(rp.node.left, rp.vt - 1));
            }
            if (rp.node.right != null) {
                q.add(new Pair(rp.node.right, rp.vt + 1));
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ll.add(entry.getValue());
        }
        
        return ll;
    }
}
