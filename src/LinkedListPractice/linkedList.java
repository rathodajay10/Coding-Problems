package LinkedListPractice;

public class linkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        linkedList ls = new linkedList();
        ls.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        ls.head.next = second;
        second.next = third;

        ls.printLinkedList();
    }

    private  void printLinkedList() {
        Node n = head ;
        while (n !=null){
            System.out.println(n.data);
            n = n.next;
        }
    }


}
