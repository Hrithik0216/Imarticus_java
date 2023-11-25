package Trees;

public class Example {
    public class TreeNode {
        int data;

        public TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
        }

    }

    TreeNode ob;

    public TreeNode insertAll() {
        // ob = new TreeNode(19);
        // ob.left = new TreeNode(11);
        // ob.right = new TreeNode(22);
        // ob.left.left = new TreeNode(7);
        // ob.left.right = new TreeNode(2);
        // ob.left.left.left = new TreeNode(33);
        // ob.left.left.right = new TreeNode(31);
        // ob.left.left.left.left=new TreeNode(5);
        // ob.left.left.left.right=new TreeNode(29);

        // ob.left.left.right=new TreeNode(31);
        // ob.left.left.right.left=new TreeNode(9);

        // ob.left.right.left = new TreeNode(39);
        // ob.left.right.right = new TreeNode(32);

        // ob.right.left = new TreeNode(8);
        // ob.right.right = new TreeNode(6);

        // ob.right.right.left = new TreeNode(16);
        // ob.right.right.right = new TreeNode(12);

        // ob.right.right.left.left = new TreeNode(13);
        // ob.right.right.left.right = new TreeNode(14);

        // ob.right.right.left.right.right = new TreeNode(1);
        // ob.right.right.left.right.right.right = new TreeNode(3);
        ob = new TreeNode(3);
        ob.left = new TreeNode(8);
        ob.right = new TreeNode(7);
        ob.right.left = new TreeNode(9);
        ob.right.right = new TreeNode(1);
        ob.right.left.left = new TreeNode(2);

        return ob;
    }

    public void inOrder(Example.TreeNode currRoot) {

        if (currRoot != null) {
            inOrder(currRoot.left);
            System.out.println(currRoot.data);
            inOrder(currRoot.right);
        }
    }

    public void PreOrder(Example.TreeNode currRoot) {

        if (currRoot != null) {
            System.out.print(currRoot.data + " ");
            PreOrder(currRoot.left);
            PreOrder(currRoot.right);
        }
    }

    public void PostOrder(Example.TreeNode currRoot) {

        if (currRoot != null) {
            PostOrder(currRoot.left);
            PostOrder(currRoot.right);
            System.out.println(currRoot.data);
        }
    }

    public int height(Example.TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public TreeNode mirror(Example.TreeNode root) {
        if (root == null) {
            return root;
        }

        // Mirror the left and right subtrees and get their heights
        TreeNode leftHeight = mirror(root.left);
        TreeNode rightHeight = mirror(root.right);

        Example.TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

}
