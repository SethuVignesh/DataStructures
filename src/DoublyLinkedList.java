public class DoublyLinkedList {
    DNode next;
    DNode prev;
    DNode head;
    int size;

    public void append(int data) {
        DNode inputNode = new DNode(data);
        if (isEmpty() == false) {
            DNode temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(inputNode);
            inputNode.setPrev(temp);
            size++;
        } else {
            head = inputNode;
            size++;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBegin(int data) {
        DNode temp = new DNode(data);
        if (isEmpty() == false) {
            temp.setNext(head);
            head.setPrev(temp);
            head = temp;

        } else {
            head = temp;
        }
        size++;
    }

    public void insertAtPos(int data, int pos) {
        DNode insertNode = head;
        if (pos > size + 1) {
            System.out.println("Cannot insert at this position");
        } else {

            if (isEmpty() == false) {
                int currentPos = 1;
                DNode temp = head;
                while (currentPos != pos || currentPos > pos) {
                    currentPos = currentPos + 1;
                    temp = temp.getNext();
                }

                insertNode.setNext(temp);
                insertNode.setPrev(temp.getPrev());
                temp.setPrev(insertNode);
                insertNode.getPrev().setNext(insertNode);


            } else {
                if (pos == 1) {
                    head = insertNode;
                } else {
                    System.out.println("Cannot be inserted at this position");
                }
            }


        }
    }

    public void reverse() {

    }

    public void insertAsc(int data) {
        DNode newNode= new DNode(data);
        if(isEmpty()){
            head= newNode;
        }else {

            DNode temp= head;
            while (temp!=null && temp.getData()<data){
                temp=temp.getNext();
            }

            if(temp!=null){
                newNode.setNext(temp.getNext());
                newNode.setPrev(temp);
                temp.setNext(newNode);
                if(newNode.getNext()!=null){
                    newNode.getNext().setPrev(newNode);
                }
            }else{
                temp.setNext(newNode);
                newNode.setPrev(temp);
            }


        }
        size++;
    }

    public void getMiddle() {
        DNode temp= head;

        if(size>2){
            int middle= size/2;
            if(size%2!=0){
                middle=size/2+1;
            }
            int pos=1;
            while(pos!=middle || pos>middle){
                temp= temp.getNext();
            }
            System.out.println("Middle item is "+temp.getData());
        }else{
            if(isEmpty()){
                System.out.println("Empty structure");
            }else{
                System.out.println("Middle item is "+head.getData());
            }
        }
    }

    public void delete(int data) {
        if(isEmpty()){
            System.out.println("Item not found");
        }else{
            DNode temp= head;
            while (temp!=null && temp.getData()!=data){
                temp=temp.getNext();
            }

            if(temp!=null){
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                temp.setPrev(null);
                temp.setNext(null);


            }else{
                System.out.println("Item not found");
            }

        }

    }
}
