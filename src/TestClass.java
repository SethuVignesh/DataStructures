public class TestClass {
    public static void main(String[] args) {
//        SinglyLinkedList linkedList= new SinglyLinkedList();
//        linkedList.delete(1);
//        linkedList.append(1);
////        linkedList.traverse();
//        linkedList.append(2);
//        linkedList.append(3);
//        linkedList.append(4);
//        linkedList.append(5);
//        linkedList.append(6);
//        linkedList.append(7);
//        linkedList.traverse();
//        linkedList.delete(1);
//        linkedList.traverse();

//        linkedList.getMiddle();
//        linkedList.insertAtBegin(0);
//        linkedList.insertAtPos(2,1);
//        linkedList.insertAtPos(1,1);
//        linkedList.insertAtPos(3,3);

//        linkedList.insertAsc(5);linkedList.traverse();
//        linkedList.insertAsc(6);linkedList.traverse();
//        linkedList.insertAsc(2);linkedList.traverse();
//        linkedList.insertAsc(1);linkedList.traverse();
//        linkedList.insertAsc(3);
//        linkedList.traverse();

        //DLL TEST

        //CREATE
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
//        doublyLinkedList.append(1);
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.traverse();
//
        doublyLinkedList.delete(1);
////        doublyLinkedList.traverse();
////
        doublyLinkedList.insertAtBegin(1);
//        doublyLinkedList.delete(1);
////        doublyLinkedList.traverse();
////
        doublyLinkedList.insertAtBegin(1);
        doublyLinkedList.traverse();

        doublyLinkedList.insertAtPos(5,7);
        doublyLinkedList.traverse();
    }

    //READ

    // UPDATE

    //DELETE
//    }
}
