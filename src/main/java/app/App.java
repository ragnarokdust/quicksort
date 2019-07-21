package app;

import linkedlist.LinkedListImpl;
import linkedlist.ListNode;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        LinkedListImpl linkedListImpl = new LinkedListImpl();

        for (int i = 1; i <= 20; i++) {
            linkedListImpl.insertLastNode(String.format("%d", i));
        }
        linkedListImpl.printList();

        ListNode listNode = linkedListImpl.searchNode(String.format("%d", 10));
        System.out.println(listNode.getData());

        linkedListImpl.insertMiddleNode(listNode, String.format("%s", "중간 삽입"));
        linkedListImpl.printList();


        System.out.println("20 삭제");
        linkedListImpl.deleteLastNode();
        linkedListImpl.printList();

        System.out.println("마지막 삽입");
        linkedListImpl.insertLastNode(String.format("%s", "마지막 삽입"));
        linkedListImpl.printList();

        System.out.println("역으로 재배열");
        linkedListImpl.reverseList();
        linkedListImpl.printList();

        
    }
}
