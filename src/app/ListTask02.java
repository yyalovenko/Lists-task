package app;

import java.util.ArrayList;
import java.util.List;

public class ListTask02 extends ListTask {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("mango");
        list.add("banana");
        list.add("apple");
        list.add("kiwi");
        list.add("cherry");

        System.out.println("Initial list:");
        printList(list);
        System.out.println();
        List<String> sublist = list.subList(1,3);
        System.out.println("List part:");
        printList(sublist);
    }

}
