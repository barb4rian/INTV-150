public class day69_173 {

    private TreeNode visit;
    private Stack<TreeNode> stack;
    
    public day69_173(TreeNode root) {
        visit = root;
        stack = new Stack();
    }

    public boolean hasNext() {
        return visit != null || !stack.empty();
    }

    public int next() {
        while (visit != null) {
            stack.push(visit);
            visit = visit.left;
        }
        TreeNode next = stack.pop();
        visit = next.right;
        return next.val;
    }
}