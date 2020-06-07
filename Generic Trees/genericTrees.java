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

    
    private Node construct(Scanner sc,Node parent,int i)
    {
        if(parent==null)
        {
            System.out.println("Enter the data for Parent");
        }
        else
        {
            System.out.println("Enter the data for the"+i+"th child of"+parent);
        }
        int cdata=sc.nextInt();
        Node child=new Node();
        this.size++;
        child.data=cdata;

        System.out.println("Enter the number of children for"+child.data);
        int numGrandChil=sc.nextInt();
        for(int j=0;j<numGrandChil;j++)
        {
            Node granChil = construct(sc, child, j);
            child.children.add(granChil);
        }
        return child;
    }
}