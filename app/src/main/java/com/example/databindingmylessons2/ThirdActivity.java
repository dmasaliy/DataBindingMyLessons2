package com.example.databindingmylessons2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingmylessons2.databinding.ActivityMainBinding;
import com.example.databindingmylessons2.databinding.ActivityThirdBinding;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Student student = new Student("Misha");
        ActivityThirdBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_third);
        binding.setStudent(student);
    }
}