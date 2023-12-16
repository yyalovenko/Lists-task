package app;

import java.util.LinkedList;

public class ListTask03 extends ListTask {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("orange");
        list.add("grape");
        list.add("apple");
        list.add("lemon");

        System.out.println("Initial list: ");
        printList(list);
        list.addFirst("plum");
        list.addLast("mango");
        System.out.println();
        System.out.println("Edited list: ");
        printList(list);
    }
}
