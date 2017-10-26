package com.example.avazquezdev.listviewcustom;

public class Item {
    private String name;
    private String subname;

    public Item(String name, String subname) {
        this.name = name;
        this.subname = subname;
    }
    public String getName() {
        return name;
    }
    public String getSubname() {
        return subname;
    }
}