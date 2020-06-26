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
    public int max()
    {
        return this.max(root);
    }
    private int max(Node node)
    {
        int rv=node.data;
        for(Node child:node.children)
        {
            int cmax=max(child);
            rv=Math.max(rv,cmax);
        }
        return rv;
    }
    public boolean find(int data)
    {
        return find(root,data);
    }
    public boolean find(Node node,int data)
    {
        if(node.data==data)
        {
            return true;
        }
        for(Node child:node.children)
        {
            boolean fic=find(child, data);
            if(fic)
            {
                return true;
            }
        }
        return false;
    }
    public int height()
    {
        return height(root);
    }
    public int height(Node node)
    {
        int cmaxHt=0;
        for(Node child:node.children)
        {
            int cHt=height(child);
            cmaxHt=Math.max(cmaxHt,cHt);
        }
        return cmaxHt+1;
    }
    //preorder rule N>C
    public void preo()
    {
        preo(root);
    }
    public void preo(Node node)
    {
        System.out.print(node.data+"->");
        for(Node child:node.children)
        {
            preo(child);//faith 
        }
    } 
    public static void main(String args[])
    {
        genericTrees tree=new genericTrees();
        tree.display();
        System.out.println(tree.size2());
        // tree.max();
        // System.out.println("Max Value is: ");
        // System.out.println(tree.max());
        // System.out.println(find(120));
        //10 3 20 2 50 0 60 0 30 3 70 0 80 2 110 0 120 0 90 0 40 1 100 0
        tree.preo();
        System.out.println();
    }
}

