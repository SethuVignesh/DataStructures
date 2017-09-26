package Stacks;

import ElementaryDS.Node;
import ElementaryDS.SinglyLinkedList;

//LIFO
public class StackWithLinkedList {

    Node top;
    int size;


    public void push(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            top = node;
            size++;
        } else {
            node.setNext(top);
            top = node;
            size++;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            Node node = top;
            top = top.getNext();
            node.setNext(null);
           System.out.println( node.getData());
        }
    }

    public int peek() {
        if (isEmpty() == false)
            return top.getData();
        return -1;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void traverse(){
        if(isEmpty()){System.out.println("Stack is Empty");}else {
            Node temp=top;
            while (temp!=null){

                System.out.println(temp.getData());
                System.out.println("---");
                temp=temp.getNext();
            }

        }

    }

}
