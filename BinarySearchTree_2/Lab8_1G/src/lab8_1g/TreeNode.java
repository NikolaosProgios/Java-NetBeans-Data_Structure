package lab8_1g;

public class TreeNode{
    private Object item;
     private TreeNode left;
    private TreeNode right;

    TreeNode(Object data)    {
        item = data;
        left = right = null;
    }

    public Object getNodeData()    {
        return item;
    }

    public TreeNode getLeftNode()    {
        return left;
    }

    public TreeNode getRightNode()    {
        return right;
    }

    public boolean isLeaf()    {
        return right == null && left == null;
    }

    public void setLeftNode(TreeNode node)    {
        left = node;
    }

    public void setRightNode(TreeNode node)    {
        right = node;
    }

    public void insert(Object data)    {
        //(Comparable)5.compareTo(((Comparable)6)) = -1
        //(Comparable)5.compareTo(((Comparable)5)) = 0
        //(Comparable)5.compareTo(((Comparable)4)) = 1
        //Comparable για να συγκρίνουμε object 
        if (((Comparable) item).compareTo(((Comparable) data)) < 0)// item<data
        {
            if(left == null)
            {
                left = new TreeNode(data);
            }
            else
            {
                left.insert(data);
            }
        }
        else
        {
            if(right == null)
            {
                right = new TreeNode(data);
            }
            else
            {
                right.insert(data);
            }
        }
    }
    
    /*public int compareTo (Object S) throws ClassCastException {
        if (!(S instanceof Comparable))
            throw new ClassCastException("A compare object expected");
            return ((Comparable)item).compareTo(S);
    }*/
}