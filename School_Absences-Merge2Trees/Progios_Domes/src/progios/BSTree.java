package progios;

public class BSTree{

   private TreeNode root;
   

   public BSTree(){
      root = null;
   }
   
   public boolean isEmpty(){
      return (root == null); 
   }

   public TreeNode getRoot(){
      return root;
   }   

   public void insertElement(int data){
      if (isEmpty()){
         root = new TreeNode(data);
	  }
      else{
         insertNode(data,root); 
      }
   }

   public void inOrderTraversal(){
      System.out.println("INORDER TRAVERSAL");
      inOrder(root);
      System.out.println( ); 
   }

   public void preOrderTraversal(){
      System.out.println("PREORDER TRAVERSAL");
      preOrder(root);
      
      System.out.println( ); 
   }

   public void postOrderTraversal(){
      System.out.println("POSTORDER TRAVERSAL");
      postOrder(root);
      System.out.println( ); 
   }
    
   private void insertNode(int data, TreeNode node){
	  if (data==node.getNodeData()){ 
	     return;
	  }
	  if (data<node.getNodeData()){
	     if (node.getLeftNode() == null){
		    node.setLeftNode(new TreeNode(data));
		 }
		 else{
		    insertNode(data, node.getLeftNode());
		 }
	  }
	  else{
		 if (node.getRightNode() == null){
		    node.setRightNode(new TreeNode(data));
		 }
		 else{
		    insertNode(data, node.getRightNode());
		 }
	  }
   }
   
   private void inOrder(TreeNode node){
		if (node == null){
			return;
		}
		inOrder(node.getLeftNode());
		System.out.print(node.getNodeData() + ", ");
		inOrder(node.getRightNode());	   
   }
   int[] TableB= new int[10];int i=0;
   //TreeNode[] TableB= new TreeNode[10];int i=0;
   private void preOrder(TreeNode node){		
		if (node == null){
			return;
		}
                if (i<10){
                    TableB[i]=node.getNodeData();i++;
                }
		System.out.print(node.getNodeData() + ", ");
		preOrder(node.getLeftNode());
		preOrder(node.getRightNode());   
   }
   
   private void postOrder(TreeNode node){
		if (node == null){
			return;
		}
		postOrder(node.getLeftNode());
		postOrder(node.getRightNode());
		System.out.print(node.getNodeData() + ", ");	      
   }

   private int size(TreeNode node) {
      if (node==null) 
         return 0;
      return size(node.getLeftNode()) + size(node.getRightNode()) + 1;
   }    

   public BSTree mergeTrees(BSTree A){
       BSTree B=new BSTree();
       for (int i=0;i<10;i++){
           B.insertElement(TableB[i]);
       }
       return B;
       
   }
    
   /*
      public BSTree mergeTrees(BSTree A){
       BSTree B=new BSTree();
       int[] newTable = new int[10];
       for (int i=0;i<10;i++){
           newTable = A.sort();         
       }
       
       for (int i=0;i<10;i++){
           B.insertElement(newTable[i]);
       }
       return B;
       
   }  
    private void inOrderSort(TreeNode node, int[] table)    {
        if(node == null)        {
            return;
        }
        inOrderSort(node.getLeftNode(), table);
        table[counter++] = node.getNodeData();
        inOrderSort(node.getRightNode(), table);
    }
    private int counter = 0;
    private int[] sort()    {
        int[] newTable = new int[10];

        //System.out.println("SORT ");

        counter = 0;

        inOrderSort(root, newTable);

        return newTable;
    }
     
    */
     
}


