package Queues;

import ElementaryDS.Node;

public class QueueWithLinkedList {
//    Node
    Node front;
    Node rear;
    int size;

    public void enque(int data){
        Node newNode= new Node(data);
        if(isEmpty()){
            front=rear=newNode;
            size++;
        }else {
            rear.setNext(newNode);
            rear=rear.getNext();
            size++;
        }
    }
    public void deque(){
        if(isEmpty()){System.out.println("Queue is empty");}
        else {
            Node temp= front;
            System.out.println(temp.getData());
            front=front.getNext();
            temp.setNext(null);
            size--;
            if(front==null){
                rear=null;
            }
        }
    }
    public void traverse(){
       if(isEmpty()){System.out.println("Queue is empty");}
        else {
            Node temp=front;
           while (temp!=null){
               System.out.print(temp.getData());
               System.out.print("--->");
               temp=temp.getNext();
           }
        }
    }
    public boolean isEmpty(){
        return front==null && rear==null;
    }


}
