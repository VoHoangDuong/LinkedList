public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("************");
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(3,20);

        ll.printList();
    }
}
