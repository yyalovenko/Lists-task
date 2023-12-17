package app;

import app.Entity.Counter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTask {

    public static void listTask01() {
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
        System.out.println();
    }

    public static void listTask02() {
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
        System.out.println();
    }

    public static void listTask03() {
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
        System.out.println();
    }

    public static void printList(List<String> list) {
        for(String s: list) {
            Counter c = new Counter(list,s);
            System.out.println(c.getCount() + s);
        }
    }

}
