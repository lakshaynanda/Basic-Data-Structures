import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class linkedList {
    public class Node {
        int data;
        Node next;
    }

    public Node head;
    public Node tail;
    public int size;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void addLast(int data) {
        Node node = new Node();

        if (this.size == 0) {
            node.data = data;
            node.next = null;

            this.size++;
            this.head = this.tail = node;

            return;
        }
        node.data = data;
        node.next = null;
        tail.next = node;
        tail = node;
        this.size++;
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(".");

    }

    public void addFirst(int data) {
        Node node = new Node();
        if (this.size == 0) {
            node.data = data;
            node.next = null;
            this.head = this.tail = node;
            this.size++;
            return;
        }
        node.data = data;
        node.next = head;
        head = node;

        this.size++;
    }

    public void addAtAny(int data, int i) throws Exception {
        if (i < 0 || i > this.size) {
            throw new Exception("Invalid");
        } else if (i == 0) {
            this.addFirst(data);
        } else if (i == this.size) {
            this.addLast(data);
        } else {
            Node node = this.getNodeAt(i - 1);
            Node nodep1 = node.next;
            Node newNode = new Node();
            newNode.data = data;
            node.next = newNode;
            newNode.next = nodep1;

            this.size++;
        }
    }

    public int getLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("Emtpy Bro");
        }
        return tail.data;
    }

    public int getFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty Bro");
        }
        return head.data;
    }

    public int getAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty Bro");
        } else if (idx < 0 || idx >= this.size) {
            throw new Exception("Out of Bounds");
        }
        Node node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node.data;
    }

    public Node getNodeAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty Bro");
        } else if (idx < 0 || idx >= this.size) {
            throw new Exception("Out of Bounds");
        }
        Node node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    public int removeFirst() throws Exception {
        int temp = head.data;
        if (this.size == 0) {
            throw new Exception("Invalid");
        } else if (this.size == 1) {

            head = tail = null;
            this.size--;
            return temp;
        } else {
            Node second = head.next;
            head = second;

            this.size--;
        }
        return temp;
    }

    public int removeLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("Invalid");
        } else if (this.size == 1) {
            int temp = head.data;
            head = tail = null;
            this.size--;
            return temp;
        } else {
            int temp = tail.data;
            Node secondLast = this.getNodeAt(this.size - 2);
            tail = secondLast;
            tail.next = null;
            this.size--;
            return temp;
        }
    }

    public int removeAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty Bro");
        } else if (idx < 0 || idx >= this.size) {
            throw new Exception("Out of Bounds");
        } else if (idx == 0) {
            return this.removeFirst();
        } else if (idx == this.size - 1) {
            return this.removeLast();
        } else {
            Node nodem1 = this.getNodeAt(idx - 1);
            Node n = nodem1.next;
            Node nodep1 = n.next;
            nodem1.next = nodep1;

            this.size--;
            return n.data;
        }
    }

    public void displayReverse() {
        displayReverseHelper(head);
        System.out.println(".");
    }

    public void displayReverseHelper(Node node) {
        if (node == null) {
            return;
        }
        displayReverseHelper(node.next);
        System.out.print(node.data + " -> ");
    }

    public void reverseDataIterator() throws Exception {
        int left = 0;
        int right = this.size - 1;

        while (left < right) {
            Node leftNode = getNodeAt(left);
            Node rightNode = getNodeAt(right);

            int temp = leftNode.data;
            leftNode.data = rightNode.data;
            rightNode.data = temp;

            left++;
            right--;
        }
    }

    public void reversePointerIterator() {
        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            Node next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node temp = tail;
        tail = head;
        head = temp;

        tail.next = null;
    }

    public void reverseRecursively() {
        reverseRecursiveHelper(head);
        Node temp = head;
        head = tail;
        tail = temp;
        tail.next = null;
    }

    public void reverseRecursiveHelper(Node node) {
        if (node == tail) {
            return;
        }
        reverseRecursiveHelper(node.next);
        node.next.next = node;
    }

    public class HeapMover {
        Node node;
    }

    public void reversedataRecursive() {
        HeapMover left = new HeapMover();
        left.node = head;
        reversedataRecursive(left, head, 0);
    }

    private void reversedataRecursive(HeapMover left, Node right, int floor) {
        if (right == null) {
            return;
        }
        reversedataRecursive(left, right.next, floor + 1);
        if (floor >= size / 2) {

            int data = left.node.data;
            left.node.data = right.data;
            right.data = data;
            left.node = left.node.next;
        }
    }

    public boolean isPalindrome() {
        HeapMover left = new HeapMover();
        left.node = head;
        return this.isPalindrome(left, head);
    }

    private boolean isPalindrome(HeapMover left, Node right) {
        if (right == null) {
            return true;
        }
        boolean isPalin = isPalindrome(left, right.next);
        if (isPalin == false) {
            return false;
        } else {
            if (left.node.data == right.data) {
                left.node = left.node.next;
                return true;
            } else {
                return false;
            }
        }
    }

    public void fold() {
        HeapMover left = new HeapMover();
        left.node = head;
        this.fold(left, head, 0);
    }

    public void fold(HeapMover left, Node right, int floor) {
        if (right == null) {
            return;
        }

        fold(left, right.next, floor + 1);
        if (floor > this.size / 2) {
            Node oln = left.node.next;
            left.node.next = right;
            right.next = oln;
            left.node = oln;
        }
        else if(floor==this.size/2)
        {
            this.tail=right;
            this.tail.next=null;
        }
        
    }

    public static void main(String[] args) throws Exception {
        linkedList list = new linkedList();

        list.addFirst(5);
        list.addLast(10);
        list.addLast(20);
        list.addLast(20);
        list.addLast(10);
        list.addLast(5);
        list.display();
        list.fold();
        list.display();
        // list.reversedataRecursive();
        // list.display();
        
        // System.out.println(list.isPalindrome());
        // list.displayReverse();

        // list.addAtAny(100, 2);
        // list.removeAt(3);
        // list.display();
    }
}