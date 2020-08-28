package com.example.databindingmylessons2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Vasya"));
        students.add(new Student("Jasya"));
        students.add(new Student("Pasya"));
        students.add(new Student("Oasya"));

        StudentAdapter adapter = new StudentAdapter(students);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }
}