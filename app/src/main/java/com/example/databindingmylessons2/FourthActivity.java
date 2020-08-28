package com.example.databindingmylessons2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

import com.example.databindingmylessons2.databinding.ActivityFourthBinding;
import com.example.databindingmylessons2.databinding.StudentBinding;
import com.example.databindingmylessons2.databinding.UrlBinding;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        final Student student = new Student("Petya", "instagram.com", null);
        final ActivityFourthBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_fourth);
        binding.setStudent(student);

        binding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub viewStub, View view) {
               UrlBinding binding =DataBindingUtil.bind(view);
                binding.setStudent(student);
            }
        });

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( !binding.viewStub.isInflated()){
                    binding.viewStub.getViewStub().inflate();
                }
            }
        });
    }
}