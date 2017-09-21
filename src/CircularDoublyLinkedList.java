public class CircularDoublyLinkedList {
    int size;
    DNode next;
    DNode prev;
    DNode head;

    public void append(int data) {
        DNode newNode = new DNode(data);
        if (isEmpty()) {
            head = newNode;
            head.setNext(head);
            head.setPrev(head);
        } else {

            DNode temp = head;
            while (temp.getNext() != head) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setPrev(temp);
            newNode.setNext(head);
            head.setPrev(newNode);
        }
        size++;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBegin(int data) {
        DNode newNode = new DNode(data);
        DNode temp = head;
        if (temp == null) {
            append(data);
        } else {
            newNode.setNext(temp);
            newNode.setPrev(temp.getPrev());

            head = newNode;
            head.getPrev().setNext(head);
            size++;
        }
    }

    public void insertAtPos(int data, int pos) {
        if (size + 1 <pos || pos<1) {
            System.out.println("Cannot insert at this position");
        } else {
            int currentPos = 1;
            DNode temp = head;
            if (pos == 1) {
                insertAtBegin(data);
            } else {

                while (currentPos != pos) {
//                    if(temp.getNext()==head){
//                        break;
//                    }

                    currentPos = currentPos + 1;
                    temp = temp.getNext();
                }

                DNode newNode= new DNode(data);

                newNode.setNext(temp);
                newNode.setPrev(temp.getPrev());
                temp.setPrev(newNode);
                newNode.getPrev().setNext(newNode);
                size++;
            }
        }}

    public void reverse() {
    }

    public void insertAsc(int data) {
        if(isEmpty()){append(data);}
        else{
            DNode temp=head;

        }
    }

    public void getMiddle() {
    }

    public void delete() {
    }

    public void traverse() {
        DNode temp = head;
        if (isEmpty()) System.out.println("Empty list");
        else if (size == 1) {
            System.out.print(temp.getData() + "----->");
        } else {

            while (temp.getNext() != head) {
                System.out.print(temp.getData() + "----->");
                temp = temp.getNext();
            }
            System.out.print(temp.getData() + "----->");
        }
        System.out.println();
    }
}

