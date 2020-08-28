package com.example.databindingmylessons2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingmylessons2.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<String> lessons = new ArrayList<>();
        lessons.add("math");
        lessons.add("english");

        Student student = new Student("Misha", "https://www.meme-arsenal.com/memes/9dcc5191490ae55276c6e172df95d706.jpg", lessons);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setStudent(student);
    }
}