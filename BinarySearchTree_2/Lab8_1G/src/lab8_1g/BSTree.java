package lab8_1g;

public class BSTree{
    private TreeNode root;
    private int size;

    BSTree()    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public int numberOfNodes()    {
        return size;
    }//Εναλλακτικα
    //Εναλλακτικα
    /* Υπολογίζει και επιστρέφει το πλήθος των κόμβων του δένδρου 
    //numberOfNodes πακετο με την  numberOfNodes2
    public int numberOfNodes(){
        if (isEmpty()){            return 0 ;         }
        return numberOfNodes2(root,0);
    }    
    private int numberOfNodes2( TreeNode node, int n) {
        if (node == null){            return n;        }
        n=numberOfNodes2(node.getLeftNode(),n);
        n++;
        n=numberOfNodes2(node.getRightNode( ),n);
        return n;
    }
    */
    
    // Υπολογίζει και επιστρέφει το ύψος του δένδρου 
    //public int height(TreeNode node) βοηθιτικη μεθοδος 
    public int treeHeight()    {
        return Height(root);
    }
    private int Height(Object data)    {
        if(data == null)        {
            return 0;
        }
        int left = Height(((TreeNode) data).getLeftNode());
        int right = Height(((TreeNode) data).getRightNode());

        if(left > right)        {
            return left + 1;
        }
        else{
            return right + 1;
        }
    }

    public void insertElement(Object data)    {
        if(isEmpty())        {
            root = new TreeNode(data);
        }
        else        {
            insertNode(data, root);
        }
        size++;
    }

    public void inOrderTraversal()    {
        System.out.println("INORDER TRAVERSAL");
        inOrder(root);
        System.out.println();
    }

    public void preOrderTraversal()    {
        System.out.println("PREORDER TRAVERSAL");
        preOrder(root);
        System.out.println();
    }

    public void postOrderTraversal()    {
        System.out.println("POSTORDER TRAVERSAL");
        postOrder(root);
        System.out.println();
    }
    //Private βοηθητικα
    private void insertNode(Object data, TreeNode node)    {
        if(root == null)
        {
            root = new TreeNode(data);
        }
        else
        {
            root.insert(data);
        }
    }

    private void inOrder(TreeNode node)    {
        if(node == null)
        {
            return;
        }

        inOrder(node.getLeftNode());

        System.out.print(node.getNodeData() + " ");

        inOrder(node.getRightNode());
    }

    private void preOrder(TreeNode node)    {
        if(node == null)
        {
            return;
        }

        System.out.print(node.getNodeData() + " ");

        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }

    private void postOrder(TreeNode node)    {
        if(node == null)
        {
            return;
        }

        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());

        System.out.print(node.getNodeData() + " ");
    }
    
    // Υπολογίζει και επιστρέφει το ύψος του δένδρου για τον συγκεκριμένο κόμβο 
    // (με δημιουργία και χρήση equals ή compareTo)
    public int treeHeight(Object data){
        TreeNode h =searchNode(data,root);
        if (h!=null){
            return Height(h);            
        }
        else{
            return -1;
        }
    }    
       
    private TreeNode searchNode(Object data,TreeNode node){
        if (((Comparable)data).compareTo(((Comparable)node.getNodeData()))==0){
            return node;
        }
        else if  (((Comparable)data).compareTo(((Comparable)node.getNodeData()))==-1){
            if (node.getLeftNode()==null){
                return null;
            }
            else {
                return searchNode(data,node.getLeftNode());                
            }
        }
        else {
            if (node.getRightNode()==null){
                return null;                
            }
            else {
                return searchNode(data,node.getRightNode());
            }
        }
    }
     
    /*private TreeNode searchNode2(Object data , TreeNode node){
        TreeNode found =null;
        if (((Comparable)data).compareTo(((Comparable)node.getNodeData()))==0){
            return node; 
        }
        if (node.getLeftNode()!=null){
            found =searchNode2(data,node.getLeftNode());            
        }
        if (node.getRightNode()!=null){
            if (found==null){
                found=searchNode2(data,node.getRightNode());                
            }
        }
        return found;        
    }*/
}