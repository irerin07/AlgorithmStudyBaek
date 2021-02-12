package leetcode_week_1_chal;

public class leetcode3634 {

    public class Solution {

        int sum = 0;

        public TreeNode convertBST(TreeNode root) {
            convert(root);
            return root;
        }

        public void convert(TreeNode cur) {
            if (cur == null) return;
            convert(cur.right);
            cur.val += sum;
            sum = cur.val;
            convert(cur.left);
        }

    }
}
