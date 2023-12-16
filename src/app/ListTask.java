package app;

import java.util.List;

public class ListTask {

    public static void printList(List<String> list) {
        for(String s: list) {
            System.out.println(list.indexOf(s) + 1 + ") " + s);
        }
    }

}
