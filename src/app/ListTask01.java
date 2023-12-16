package app;

import java.util.ArrayList;
import java.util.List;

public class ListTask01 extends ListTask {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Alice");
        list.add("Robert");
        list.add("Lisa");
        list.add("David");
        list.add("Amanda");

        System.out.println("Initial list: ");
        printList(list);
        list.sort(String::compareTo);
        System.out.println();
        System.out.println("Sorted list: ");
        printList(list);
    }

}
