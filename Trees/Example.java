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


    public TreeNode insertAll(){
         ob = new TreeNode(8);
        ob.left = new TreeNode(6);
        ob.right = new TreeNode(5);
        ob.left.left =new TreeNode(9);
        ob.left.right = new TreeNode(2);
        ob.left.left.left = new TreeNode(21);
        ob.left.left.right = new TreeNode(19);

        ob.left.right.left = new TreeNode(3);
        ob.left.right.right = new TreeNode(16);

        ob.right.left = new TreeNode(7);
        ob.right.right = new TreeNode(1);

        ob.right.left.left = new TreeNode(12);
        ob.right.left.right = new TreeNode(13);



        return ob;
    }

    public void inOrder(){
        inOrder(ob);
     }
    

    public void inOrder(Example.TreeNode currRoot){

        if(currRoot!= null) {
            inOrder(currRoot.left);
            System.out.println(currRoot.data);
            inOrder(currRoot.right);
         }
     }
     public void PreOrder(Example.TreeNode currRoot){

        if(currRoot!= null) {
            System.out.println(currRoot.data);
            PreOrder(currRoot.left);
            PreOrder(currRoot.right);
         }
     }
     public void PostOrder(Example.TreeNode currRoot){

        if(currRoot!= null) {
            PreOrder(currRoot.left);
            PreOrder(currRoot.right);
            System.out.println(currRoot.data);
         }
     }

}
