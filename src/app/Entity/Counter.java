package app.Entity;

import java.util.List;

public class Counter {
    private List<String> list;
    private String s;

    public Counter (List<String> list, String s) {
        this.list = list;
        this.s = s;
    }
    public String getCount(){
        return this.list.indexOf(this.s) + 1 + ") ";
    }

}
