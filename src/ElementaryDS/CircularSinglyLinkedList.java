package ElementaryDS;

public class CircularSinglyLinkedList {
    int size;
    Node head;

    public void append(int data) {
        Node newNode= new Node(data);
        if (isEmpty()) {
            head = newNode;
            head.setNext(head);
            size++;
        } else {
            Node temp=head;
            while (temp!=null && temp.getNext()!=head){
                temp=temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setNext(head);
            size++;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBegin(int data) {
        Node newNode= new Node(data);
        if(isEmpty()){
            append(data);
        }else{
            newNode.setNext(head);
            Node temp= head;
            while(temp.getNext()!= head){
                temp=temp.getNext();
            }
            temp.setNext(newNode);
            head=newNode;
            size++;
        }

    }

    public void insertAtPos(int data, int pos) {
        Node newNode= new Node(data);
        if(pos> size+1 || pos<1){
            System.out.println("Cannot insert at this position");
        }else{
            if(isEmpty() && pos==1){
                append(data);
            }else {
                if(pos==1) insertAtBegin(data);
                else {
                    int currentPos = 1;
                    Node temp = head;
                    Node prev = head;
                    while (currentPos != pos) {
                        if (temp.getNext() == head) {
                            System.out.println("Cannot insert at this position");
                        }
                        currentPos = currentPos + 1;
                        prev = temp;
                        temp = temp.getNext();
                    }

                    prev.setNext(newNode);
                    newNode.setNext(temp);
                    size++;

                }
            }

        }
    }

    public void reverse() {
    }

    public void insertAsc(int data) {
        if(isEmpty()){append(data);}
        else{
            Node newData= new Node(data);
            Node temp= head;
            Node prev=null;
            while(temp.getData()< newData.getData()){
                prev =temp;
                temp=temp.getNext();
                if(temp==head){
                    break;
                }
            }
            if(temp==head && prev !=null){
                prev.setNext(newData);
                newData.setNext(head);
                size++;
            }else if (prev==null){insertAtBegin(data);}else{
                prev.setNext(newData);
                newData.setNext(temp);
                size++;
            }

        }
    }

    public void getMiddle() {
        if(isEmpty()) System.out.println("Empty list");
        else {
            int middle = size / 2;
            if (size % 2 != 0) {
                middle = middle + 1;
            }
            int currentPos = 1;
            Node temp = head;
            while (currentPos != middle) {
                currentPos = currentPos + 1;
                temp = temp.getNext();
            }
            System.out.println("Middle:" + temp.getData());
        }
    }

    public void delete() {
    }

    public void traverse(){
        if(isEmpty()){

            System.out.println("List is empty");
        }else{
        System.out.print(head.getData()+"--->");
        Node temp=head.getNext();
        while (temp!=null && temp!=head){
            System.out.print(temp.getData()+"--->");
            temp= temp.getNext();
        }
        System.out.println("");

    }}

}
