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
        Node node=new Node();~

        if(this.size==0)
        {
            node.data=data;
            node.next=null;

            this.size++;
            this.head=this.tail=node;
        }
        node.data=data;
        node.next=null;
        tail.next=node;
        tail=node;
        this.size++;


    }
    public static void main(String[] args) {
        
    }
}