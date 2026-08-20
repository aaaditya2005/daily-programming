/* Structure of binary tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    int max = Integer.MIN_VALUE;
    public int ans(Node root, int maxAnc) {
        if (root == null) return Integer.MIN_VALUE;
        max = Math.max(max, maxAnc - root.data);
        int currMax = Math.max(maxAnc, root.data);
        ans(root.left, currMax);
        ans(root.right, currMax);

        return max;
    }
    int maxDiff(Node root) {
        if (root == null) return 0;
        max = Integer.MIN_VALUE;
        ans(root.left, root.data);
        ans(root.right, root.data);
        return max;
    }
}