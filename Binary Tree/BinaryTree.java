// package binarytree;
import java.util.*;
public class BinaryTree {
    private class Node
    {
        int data;
        Node left;
        Node right;
    }
    private Node root;
    private int size;
    public BinaryTree()
    {
        this.root=this.construct(new Scanner(System.in),null,false);
    }
    private Node construct(Scanner scn,Node parent,boolean ilc)
    {   
        if(parent==null)
        {
            System.out.println("Enter the data for root");
        }
        else{
            if(ilc)
            {
                System.out.println("Enter the data for left child of "+parent.data);
            }else
            {
                System.out.println("Enter the data for right child of "+parent.data);
            }
       }
        int cdata=scn.nextInt();

        Node child=new Node();
        child.data=cdata;
        this.size++;

        System.out.println("Do you have a left child "+child.data);
        boolean hlc=scn.nextBoolean();
        if(hlc)
        {
            child.left=construct(scn,child,true);
        }
        System.out.println("Do you have a right child "+child.data);
        boolean hrc=scn.nextBoolean();
        if(hrc)
        {
            child.right=construct(scn,child,false);
        }
        return child;
    }
    public int size()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        return this.size()==0;
    }
    public void display()
    {
        display(root);
    }
    public void display(Node node)
    {
        if(node==null)
        {
            return;
        }
        String str="";
        str+=node.left!=null?node.left.data:".";
        str+=" -> " + node.data + " <- ";
        str+=node.right!=null?node.right.data:".";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    public int size2()
    {
        return size2(root);
    }
    private int size2(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int lsize=size2(node.left);
        int rsize=size2(node.right);

        return lsize+rsize+1;
    }

    public static void main(String args[])
    {
        BinaryTree tree=new BinaryTree();
        // System.out.println(tree.size());
        tree.display();
        System.out.println(tree.size());
        
        //50 true 25 true 12 false true 20 false false true 37 true 30 false false false true 75 true 62 false false true 87 false false
    }

}