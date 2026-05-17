class Solution 
{
    public boolean hasPathSum(TreeNode r, int s) 
    {
        // using Recursive 
        if (r == null) return false;

        if (r.left == null && r.right == null && s == r.val)// If leaf node and sum matches
            return true;

        return hasPathSum(r.left, s - r.val) || hasPathSum(r.right, s - r.val);// Recur for left or right
    }
}
