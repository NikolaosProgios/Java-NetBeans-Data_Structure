package lab7_treeg;

public class BSTree{
    private TreeNode root;
    private int size;
    public TreeNode getNode(){
        return root;
    }
    
    BSTree()    { root = null;    }

    public int size()    {        return size;    }

    public boolean isEmpty()    {        return root == null;    }

    public void insertElement(int data)    {
        if(isEmpty())        {
            root = new TreeNode(data);
        }
        else    {
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

   //???
    private int counter = 0;

    public int[] sort()    {
        int[] newTable = new int[size];

        System.out.println("SORT ");

        counter = 0;

        inOrderSort(root, newTable);

        return newTable;
    }

    /*public void BSTreesort2(int matrix[]){
        BSTree tree = new BSTree();
        for (int i=0; i<matrix.length;i++){
            tree.insertElement(matrix[i]);            
        }
        sorting2(tree.getNode(), 0 , matrix );
    }*/
        
    /*private  int sorting2(TreeNode node, int i , int matrix[]){
        if (node==null ){            return i ;         }
         i  = sorting2(node.getLeftNode(),i,matrix);
         matrix[i]= node.getNodeData();
         i++;
         i = sorting2(node.getRightNode() , i , matrix);
         return i ;
    }
    */
    private void inOrderSort(TreeNode node, int[] table)    {
        if(node == null)        {
            return;
        }
        inOrderSort(node.getLeftNode(), table);
        table[counter++] = node.getNodeData();
        inOrderSort(node.getRightNode(), table);
    }

    private void insertNode(int data, TreeNode node)    {
        if(root == null)
        {
            root = new TreeNode(data);
        }
        else
        {
            root.insert(data);
        }
    }
    
    /*public void insertNode2(int data,TreeNode node) { 
        if (data==node.getNodeData()){
            return ; 
        }
        if (data<node.getNodeData()){
            if (node.getLeftNode()==null){
                node.setLeftNode(new TreeNode(data));
            }
            else {
                insertNode(data,node.getLeftNode());
            }
        }
        else{
            if (node.getRightNode() == null){
                node.setRightNode(new TreeNode(data));
            }
            else{
                insertNode(data,node.getRightNode());
            }
        }
    } */
    
    private void inOrder(TreeNode node)    {
        if(node == null)        {
            return;
        }
        inOrder(node.getLeftNode());
        System.out.print(node.getNodeData() + " ");
        inOrder(node.getRightNode());
    }

    private void preOrder(TreeNode node)    {
        if(node == null)        {
            return;
        }
        System.out.print(node.getNodeData() + " ");
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }

    private void postOrder(TreeNode node)    {
        if(node == null)        {
            return;
        }
        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        System.out.print(node.getNodeData() + " ");
        
    }
}