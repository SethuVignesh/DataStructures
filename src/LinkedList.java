public class LinkedList {
    Node head;
    int size;


    public boolean append(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            size++;
            return true;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {

                temp = temp.getNext();
            }
            temp.setNext(node);
            size++;
            return true;
        }
    }


    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean delete(int data) {
        if (isEmpty() == false) {
            if (head.getNext().getData() == data) {
                head = head.getNext();
                size--;
                return true;

            } else {

                Node temp = head;
                Node prev = head;
                while (temp != null && temp.getNext().getData() != data) {
                    prev = temp;
                    temp = temp.getNext();
                }
                if (temp == null) {
                    System.out.println("Data not exist");
                    return false;
                } else {
                    prev.setNext(temp.getNext());
                    size--;
                    return true;
                }
            }
        } else {
            System.out.println("Data not exist");
            return false;
        }
    }


    public void getMiddle() {
        int middle = size / 2;
        if (size % 2 != 0) middle = middle + 1;
        if (isEmpty() == false) {
            Node temp = head;
            int i = 1;
            while (i != middle) {
                temp = temp.getNext();
                i = i + 1;
            }
            System.out.println(temp.getNext().getData());


        } else {
            System.out.println("No data exist");
        }

    }

    public void insertAtBegin(int data) {
        if (isEmpty()) {
            head = new Node(data);
            size++;
        } else {
            Node temp = head;
            head = new Node(data);
            head.setNext(temp);
            size++;


        }
    }

    public void insertAtPos(int data, int pos) {
        if (pos<=0 || pos > size + 1) {
            System.out.println("Cannot be inserted at this position");
            return;
        }
        if (pos == 1) {
            insertAtBegin(data);
        } else {
            Node prev = head;
            Node current = head;
            int currentPos=1;

            while (current!=null && currentPos!=pos){
                prev=current;
                current=current.getNext();
            }
            Node temp= new Node(data);

            prev.setNext(temp);
            temp.setNext(current);


        }
    }
}
