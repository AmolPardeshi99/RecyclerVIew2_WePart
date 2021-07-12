package com.example.recyclerview2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentviewHolder> {
    @NonNull
    ArrayList<StudentModel> studentList;
    private ItemClickListener itemClickListener;

    public StudentAdapter(ArrayList<StudentModel> studentList,
                          ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
        this.studentList = studentList;

    }
    @Override
    public StudentviewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new StudentviewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull  StudentviewHolder holder, int position) {

        StudentModel studentModel = studentList.get(position);
        holder.setData(studentModel);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
