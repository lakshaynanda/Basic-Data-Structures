import java.util.*;
public class linkedList
{
    public class Node
    {
        int data;
        Node next;
    }

    public Node head;
    public Node tail;
    public int size;

    public int size()
    {
        return this.size;
    }

    public boolean isEmpty()
    {
        return this.size==0;
    }

    public void addLast(int data)
    {
        Node node=new Node();

        if(this.size==0)
        {
            node.data=data;
            node.next=null;

            this.size++;
            this.head=this.tail=node;

            return;
        }
        node.data=data;
        node.next=null;
        tail.next=node;
        tail=node;
        this.size++;
    }
    public void display()
    {
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }System.out.println(".");

    }
    public void addFirst(int data)
    {
        Node node=new Node();
        if(this.size==0)
        {
            node.data=data;
            node.next=null;
            this.head=this.tail=node;
            this.size++;
            return;
        }
        node.data=data;
        node.next=head;
        head=node;

        this.size++;
    }
    public void addAtAny(int data,int i) throws Exception
    {
        if(i<0 || i>this.size)
        {
            throw new Exception("Invalid");
        }
        else if(i==0)
        {
            this.addFirst(data);
        }
        else if(i==this.size)
        {
            this.addLast(data);
        }
        else{
            Node node=this.getNodeAt(i-1);
            Node nodep1=node.next;
            Node newNode=new Node();
            newNode.data=data;
            node.next=newNode;
            newNode.next=nodep1;

            this.size++;
        }
    }

    public int getLast() throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Emtpy Bro");
        }
        return tail.data;
    }
    public int getFirst() throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Empty Bro");
        }
        return head.data;
    }
    public int getAt(int idx) throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Empty Bro");
        }
        else if(idx<0 || idx>=this.size)
        {
            throw new Exception("Out of Bounds");
        }
        Node node=head;
        for(int i=0;i<idx;i++)
        {
            node=node.next;
        }
        return node.data;
    }

    public Node getNodeAt(int idx) throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Empty Bro");
        }
        else if(idx<0 || idx>=this.size)
        {
            throw new Exception("Out of Bounds");
        }
        Node node=head;
        for(int i=0;i<idx;i++)
        {
            node=node.next;
        }
        return node;
    }
    public static void main(String[] args) throws Exception{
        linkedList list=new linkedList();
        
        list.addFirst(5);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.display();
        list.addAtAny(100,2);
        list.display();
    }
}