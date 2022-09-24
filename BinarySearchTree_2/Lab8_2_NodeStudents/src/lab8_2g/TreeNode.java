package lab8_2g;

public class TreeNode
{
    private TreeNode left;
    private Object item;
    private TreeNode right;

    TreeNode(Object data)
    {
        item = data;
        left = right = null;
    }

    public Object getNodeData()
    {
        return item;
    }

    public TreeNode getLeftNode()
    {
        return left;
    }

    public TreeNode getRightNode()
    {
        return right;
    }

    public boolean isLeaf()
    {
        return right == null && left == null;
    }

    public void setLeftNode(TreeNode node)
    {
        left = node;
    }

    public void setRightNode(TreeNode node)
    {
        right = node;
    }

    public void insert(Object d)    {
         //(Comparable)5.compareTo(((Comparable)6)) = -1
        //(Comparable)5.compareTo(((Comparable)5)) = 0
        //(Comparable)5.compareTo(((Comparable)4)) = 1
        //Comparable για να συγκρίνουμε object 
        if(((Comparable) item).compareTo(((Comparable) d)) > 0)// item<data
        {
            if(left == null)
            {
                left = new TreeNode(d);
            }
            else//Comparable για να συγκρίνουμε object 
            {
                left.insert(d);
            }
        }
        else
        {
            if(right == null)
            {
                right = new TreeNode(d);
            }
            else
            {
                right.insert(d);
            }
        }
    }
    
}