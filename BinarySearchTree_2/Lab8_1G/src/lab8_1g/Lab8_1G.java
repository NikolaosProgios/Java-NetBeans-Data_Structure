package lab8_1g;


public class Lab8_1G {
    
    public static void main(String[] args)
    {
        int matrix[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5};

        BSTree tree = new BSTree();

        for(int i = 0; i < matrix.length; i++)
        {
            tree.insertElement(matrix[i]);
        }

        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();
        
        System.out.println("NUMBER OF NODES \n"+ 
                           tree.numberOfNodes());
        
        System.out.println("Height " + tree.treeHeight());

        //(Comparable)5.compareTo(((Comparable)6)) = -1
        //(Comparable)5.compareTo(((Comparable)5)) = 0
        //(Comparable)5.compareTo(((Comparable)4)) = 1
    }
}