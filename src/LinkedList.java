public class LinkedList {
Node head;
int size;
    public class Node{
        int data;
        Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data){
            this.data=data;
        }
    }

    public boolean append(int data){
        Node node = new Node (data);
        if(isEmpty()){
            head= node;
            size++;
            return true;
        }else{
            Node temp =head;
            while(temp.getNext()!=null){

                temp=temp.getNext();
            }
            temp.setNext(node);
            size++;
            return true;
        }}


        public void traverse(){
            Node temp= head;
            while (temp!=null){
                System.out.println(temp.getData());
                temp=temp.getNext();
            }
        }

    public boolean isEmpty(){
    return head==null;
    }

    public boolean delete(int data){
        if(isEmpty()==false){
            if(head.getData()==data){
                head=head.getNext();
                size--;
                return true;

            }else{

        Node temp= head;
        Node prev= head;
        while (temp!=null && temp.getData()!=data){
            prev=temp;
            temp = temp.getNext();
        }
        if(temp==null){
            System.out.println("Data not exist");
            return false;
        }else{
            prev.setNext(temp.getNext());size--;
            return true;
        }}
    }else{    System.out.println("Data not exist"); return false;}}
}
