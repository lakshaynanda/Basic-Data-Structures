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
    public int max()
    {
        return max(root);
    }
    private int max(Node node)
    {
        if(node==null)
        {
            return Integer.MIN_VALUE;
        }
        int maxl=max(node.left);
        int maxr=max(node.right);

        return Math.max(node.data,Math.max(maxl,maxr));
    }
    public int height()
    {
        return height(root);
    }
    private int height(Node node)
    {
        if(node==null)
        {
            return -1;
        }
        int lh=height(node.left);
        int rh=height(node.right);
        return Math.max(lh,rh)+1;
    }
    public boolean find(int data)
    {
        return find(root,data);
    }
    private boolean find(Node node,int data)
    {
        if(node==null)
        {
            return false;
        }
        if(data==node.data)
        {
            return true;
        }
        boolean findleft=find(node.left,data);
        if(findleft)
        {
            return true;
        }
        boolean findright=find(node.right,data);
        if(findright)
        {
            return true;
        }
        return false;
    }
    public void preo()
    {
        preo(root);
        System.out.println(".");
    }
    //NLR while going deep into recursion,euler left
    private void preo(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.print(node.data+" ");
        preo(node.left);
        preo(node.right);
    }
    public void postorder()
    {
        postorder(root);
        System.out.println(".");
    }
    //LRN while going deep,euler right
    private void postorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
    public void inorder()
    {
        inorder(root);
        System.out.println(".");
    }
    //LNR while going deep, euler middle (after left)
    private void inorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    public static void main(String args[])
    {
        BinaryTree tree=new BinaryTree();
        // System.out.println(tree.size());
        tree.display();
        // System.out.println(tree.size());
        // System.out.println(tree.max());
        // System.out.println(tree.height());
        // System.out.println(tree.find(35));
        tree.preo();
        tree.postorder();
        tree.inorder();
        //50 true 25 true 12 false true 20 false false true 37 true 30 false false false true 75 true 62 false false true 87 false false
    }

}