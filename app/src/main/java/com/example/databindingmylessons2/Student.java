package com.example.databindingmylessons2;

import java.util.ArrayList;

public class Student {
    public String name;
    public String url;
    public ArrayList<String> lessons;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String url, ArrayList<String> lessons) {
        this.name = name;
        this.url = url;
        this.lessons = lessons;
    }
}
