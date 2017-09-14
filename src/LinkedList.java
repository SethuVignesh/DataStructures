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
            System.out.println(temp.next.getData(temp));
            temp = temp.getNext();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean delete(int data) {
        if (isEmpty() == false) {
            if (head.next.getData(head) == data) {
                head = head.getNext();
                size--;
                return true;

            } else {

                Node temp = head;
                Node prev = head;
                while (temp != null && temp.next.getData(temp) != data) {
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
            System.out.println(temp.next.getData(temp));


        } else {
            System.out.println("No data exist");
        }

    }
}
