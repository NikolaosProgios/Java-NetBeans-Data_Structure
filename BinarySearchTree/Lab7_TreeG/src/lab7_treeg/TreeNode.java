package lab7_treeg;

public class TreeNode{
    
    private TreeNode left;
    private int item;
    private TreeNode right;

    TreeNode(int data) {
        item = data;
        left = right = null;
    }

    public int getNodeData()    {
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
    
//όλος ο πηγαίος κωδικας της insert
    public void insert(int data)    {
        if(data < item)
        {
            if(left == null)//aristera
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
            if(right == null)//deksia
            {
                right = new TreeNode(data);
            }
            else
            {
                right.insert(data);
            }
        }
    }
}

