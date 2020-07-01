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
    public void posto()
    {
        posto(root);
    }
    public void posto(Node node)
    {
        for(Node child:node.children)
        {
            posto(child);
        }
        System.out.print(node.data+"->");
    }
    public void levelOrder()
    {
        LinkedList<Node> queue=new LinkedList<>();
        queue.addLast(root);
        while(queue.isEmpty()==false)
        {
            Node rem=queue.removeFirst();
            System.out.print(rem.data+" ");
            for(Node child:rem.children)
            {
                queue.addLast(child);
            }
        }
        System.out.println(".");
    }
    // public class Pair()
    // {
    //     Node node;
    //     int level;
    // }
    // public void levelolw()
    // {
    //     LinkedList<Pair> queue=new LinkedList<>();

    //     Pair rootpair=new Pair();
    //     rootpair.node=root;
    //     rootpair.level=0;

    //     queue.addLast(rootpair);
    //     Pair prev=null;

    //     while(queue.size()>0)
    //     {
    //         Pair curr=queue.removeFirst();
    //         if(prev!=null && prev.level!=curr.level)
    //         {
    //             System.out.println();
    //         }
    //         System.out.print(curr.node.data+" ");
    //         for(Node child:curr.node.children)
    //         {
    //             Pair cpair=new Pair();
    //             cpair.node=child;
    //             cpair.level=curr.level+1;
    //             queue.addLast(cpair);
    //         }
    //         prev=curr;
    //     }
    // }
    public void levelorderDelim()
    {
        LinkedList<Node> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(queue.size()>0)
        {
            Node rem=queue.removeFirst();
            if(rem!=null)
            {
                System.out.print(rem.data+" ");
                for(Node child:rem.children)
                {
                    queue.addLast(child);
                }
            }else{
                System.out.println();
                if(queue.size()>0)
                {
                    queue.add(null);
                }
            }

        }
    }
    public void levelorderZigZag()
    {
        LinkedList<Node> clq=new LinkedList<>();
        LinkedList<Node> nls=new LinkedList<>();

        boolean l2r=true;
        clq.add(root);
        while(clq.size()!=0)
        {
            Node rem=clq.removeFirst();
            System.out.print(rem.data+" ");
            if(l2r)
            {
                for(int i=0;i<rem.children.size();i++)
                {
                    Node child=rem.children.get(i);
                    nls.addFirst(child);
                }
            }else
            {
                for(int i=rem.children.size()-1;i>=0;i--)
                {
                    Node child=rem.children.get(i);
                    nls.addFirst(child);
                }
            }
            if(clq.size()==0)
            {
                clq=nls;
                nls=new LinkedList<>();
                System.out.println();
                l2r=!l2r;
            }
        }
    }
    public void mirror()
    {
        mirror(root);
    }
    public void mirror(Node node)
    {
        for(Node child:node.children)
        {
            mirror(child);
        }
        Collections.reverse(node.children);
    }
    public void removeLeaves()
    {
        removeLeaves(root);
    }
    public void removeLeaves(Node node)
    {
        for(int i=node.children.size()-1;i>=0;i--)
        {
            Node child=node.children.get(i);

            if(child.children.size()==0)
            {
                node.children.remove(child);
            }
            else
            {
                removeLeaves(child);
            }
        }
    }
    public void linearize()
    {
        linearize(root);
    }
    public void linearize(Node node)
    {
        for(Node child:node.children)
        {
            linearize(child);
        }
        while(node.children.size() > 1)
        {
            Node sl=node.children.get(node.children.size()-2);
            Node l=node.children.remove(node.children.size()-1);

            Node slTail=getTail(sl);
            slTail.children.add(l);
        }
    }
    public Node getTail(Node node)
    {
        Node tail=node;
        while(tail.children.size()==1)
        {
            tail=tail.children.get(0);
        }
        return tail;
    }
    public void linearizeEff()
    {
        linearize(root);
    }
    private Node linearizeEff(Node node)
    {
        Node oltail=node.children.get(node.children.size()-1);
        while(node.children.size()>1)
        {
            Node sl=node.children.get(node.children.size()-2);
            Node l=node.children.remove(node.children.size()-1);

            Node slkitail=linearizeEff(sl);
            node.children.add(l);
        }
        return oltail;
    }
    public boolean isIsomorphic(genericTrees other)
    {
        return isIsomorphic(this.root,other.root);
    }
    private boolean isIsomorphic(Node tnode,Node onode)
    {
        if(tnode.children.size()==onode.children.size())
        {
            for(int i=0;i<tnode.children.size();i++)
            {
                Node tchild=tnode.children.get(i);
                Node ochild=onode.children.get(i);
                boolean isIsoChild=isIsomorphic(tchild, ochild);
                if(isIsoChild==false)
                {
                    return false;
                }
            }
            return true;
        }else
        {
            return false;
        }
    }
    public boolean isMirror(genericTrees other)
    {
        return isMirror(this.root,other.root);
    }
    public boolean isMirror(Node tnode,Node onode)
    {
        if(tnode.children.size()!=onode.children.size())
        {
            return false;
        }
        int left=0;
        int right=tnode.children.size()-1;
        while(left<tnode.children.size())
        {
            Node tchild=tnode.children.get(left);
            Node ochild=onode.children.get(right);

            boolean ismirror=isMirror(tchild, ochild);
            if(ismirror==false)
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isSymmetric()
    {
        return isMirror(this.root, this.root);
    }
    // public class Heapmover()
    // {
    //     int size=0;
    //     int min=Integer.MAX_VALUE;
    //     int max=Integer.MIN_VALUE;
    //     int height=0;
    //     boolean find=false;

    //     Node prev=null;
    //     Node curr=null;
    //     Node pred=null;
    //     Node succ=null;

    //     Node jl=null;
    // }

    // public void predSucc(int data)
    // {
    //     Heapmover mover=new Heapmover();
    //     predSucc(root,mover,data);

    //     System.out.print("Predecessor : "+ mover.pred==null?null:mover.pred.data);
    //     System.out.print("Successor : "+ mover.succ==null?null:mover.succ.data);
    // }
    // public void predSucc(Node node,Heapmover mover,int data)
    // {
    //     mover.curr=node;
    //     if(mover.curr.data==data)
    //     {
    //         mover.pred=mover.prev;
    //     }
    //     else if(mover.prev!= null && mover.prev.data==data)
    //     {
    //         mover.succ=mover.curr;
    //     }
    //     mover.prev=node;
    // }
    // public void multitask(int data)
    // {
    //     Heapmover mover=new Heapmover();
    //     multitask(root,mover,data,0);
    //     System.out.println("Max + :" + mover.max);
    //     System.out.println("Min + :" + mover.min);
    //     System.out.println("Height + :" + mover.height);
    //     System.out.println("find + :" + mover.find);
    //     System.out.println("size + :" + mover.size);
    // }
    // public void multitask(Node node, Heapmover mover,int data,int depth)
    // {
    //     mover.size++;
    //     mover.min=Math.min(node.data, mover.min);
    //     mover.max=Math.min(node.data, mover.min);
    //     mover.height=Math.max(depth, mover.height);
    //     mover.find=mover.find || node.data==data;

    // }
    // public void justLarger(int data)
    // {
    //     Heapmover mover=new Heapmover();
    //     justLarger(root,mover,data);
    //     System.out.println("Just Larger :" +mover.jl==null?"null":mover.jl.data);
    // }
    // public void justLarger(Node node,Heapmover mover,int data){
    //     if(node.data>data)
    //     {
    //         if(mover.jl==null || node.data<mover.jl.data)
    //         {
    //             mover.hl=node;
    //         }
    //     }
    //     for(Node child:children)
    //     {
    //         justLarger(root, mover, data);
    //     }
    // }

    public static void main(String args[])
    {
        genericTrees tree=new genericTrees();
        // tree.display();
        // System.out.println(tree.size2());
        // tree.max();
        // System.out.println("Max Value is: ");
        // System.out.println(tree.max());
        // System.out.println(find(120));
        //10 3 20 2 50 0 60 0 30 3 70 0 80 2 110 0 120 0 90 0 40 1 100 0
        //10 3 20 2 50 0 60 0 30 0 40 1 70 0
        // tree.posto();
        // System.out.println();
        // tree.levelorderDelim();
        // tree.levelorderZigZag();
        // tree.mirror();
        System.out.println(tree.isSymmetric());
        
        tree.display();

    }
}

