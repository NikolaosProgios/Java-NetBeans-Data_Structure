package lab7_treeg;

public class Lab7_TreeG {
    public static void main(String[] args)    {
        
        int matrix[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5};

        BSTree tree = new BSTree();

        for(int i = 0; i < matrix.length; i++)        {
            tree.insertElement(matrix[i]);
        }
        tree.inOrderTraversal(); // απο τον μικροτερο στο μεγαλυτερο 
        tree.preOrderTraversal();// Εμφανίζει το δεντρο μετα τις εισαγωγη όλων των στοιχείων
        tree.postOrderTraversal();//εμαφνιζει τον μικροτερο , τον μεγαλυτερο , τον ροοτ του καθε κομβου

        int[] table = tree.sort();

        for(int i : table)        {
            System.out.print(i + " ");
        }
        System.out.println();       
        
        /*
        BSTree Tree2=new BSTree();
        for (int i=0; i<matrix.length; i++) {
            Tree2.insertElement(matrix[i]); 
        }
        
        matrix=Tree2.inOrderSort();
        //inOrderSort(); void // not return table
        for (int i=0; i<matrix.length; i++) {
            System.out.println(matrix[i]);
        }
        */
    }
}