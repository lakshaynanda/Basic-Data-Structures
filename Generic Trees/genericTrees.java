import java.util.*;
public class genericTrees {
    private class Node
    {
        int data;
        ArrayList<Node> children=new ArrayList<>();
    }
    private int size;
    private Node root;
    public genericTrees()
    {
        this.root=construct(new Scanner(System.in), null, 0);
    }
    public int size()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        if(this.size==0)
            return true;
        else
            return false;
    }
    public void display()
    {
        display(root);
    }
    private void display(Node node)
    {
        String str=node.data+" -> ";
        for(Node child:node.children)
        {
            str+=child.data+", ";
        }
        str+=".";
        System.out.println(str);
        for(Node child:node.children)
        {
            display(child);
        }
    }
    public int size2()
    {
        return size2(root);
    }
    public int size2(Node node)
    {
        int size=0;
        for(Node child:node.children)
        {
            int csize=size2(child);
            size += csize;
        }
        size += 1;
        return size;
    }

    private Node construct(Scanner sc,Node parent,int i)
    {
        if(parent==null)
        {
            System.out.println("Enter the data for Parent");
        }
        else
        {
            System.out.println("Enter the data for the"+i+"th child of "+parent.data);
        }
        int cdata=sc.nextInt();
        Node child=new Node();
        this.size++;
        child.data=cdata;

        System.out.println("Enter the number of children for "+child.data);
        int numGrandChil=sc.nextInt();
        for(int j=0;j<numGrandChil;j++)
        {
            Node granChil = construct(sc, child, j);
            child.children.add(granChil);
        }
        return child;
    }
    public static void main(String args[])
    {
        genericTrees tree=new genericTrees();
        tree.display();
        System.out.println(tree.size2());
    }
}