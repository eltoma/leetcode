public class HouseRobberII {
    public static void main(String[] args) {

    }


      public class TreeNode {
          int val;
         TreeNode left;
         TreeNode right;
          TreeNode(int x) { val = x; }
     }


    public static int rob(TreeNode root, boolean hasRoot) {
        if(root == null) {
            return 0;
        }

        if(hasRoot) {
            return root.val + rob(root.left, false) + rob(root.right, false);
        } else {
            return rob(root.left, true) + rob(root.right, true) ;
        }
    }

    public static int rob(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return Math.max(rob(root, true) , rob(root, false));
    }

}
