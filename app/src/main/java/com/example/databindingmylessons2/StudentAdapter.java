package com.example.databindingmylessons2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databindingmylessons2.databinding.RvItemBinding;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RvItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.rv_item, parent, false);
        return new StudentViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        holder.bind(students.get(position));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder{
        RvItemBinding binding;

        public StudentViewHolder(@NonNull RvItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Student student){
            binding.setStudent(student);
            binding.executePendingBindings();
        }
    }
}
