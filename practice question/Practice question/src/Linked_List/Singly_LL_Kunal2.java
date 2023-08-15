package Linked_List;

public class Singly_LL_Kunal2 {
    public static void main(String[] args) {
        Singly_LL_Kunal list = new Singly_LL_Kunal();
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertFirst(15);

        list.printLL();

        list.insertLast(16);
        list.insertLast(17);
        list.insertLast(18);
        list.insertLast(19);

        list.printLL();

        System.out.println(list.deleteFirst());
        list.printLL();

        System.out.println(list.deleteLast());
        list.printLL();

        System.out.println(list.delprevious(2));
        list.printLL();

        System.out.println(list.findNode(13));
        list.printLL();
    }
}
