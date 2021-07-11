package com.example.recyclerview2;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentviewHolder extends RecyclerView.ViewHolder {

    private ImageView mTvStudentImg;
    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvDob;
    private TextView mTvAddress;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;
    public StudentviewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvName = itemView.findViewById(R.id.tvName);
        mTvStudentImg = itemView.findViewById(R.id.ivStudentImg);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvAddress = itemView.findViewById(R.id.tvAddress);
        mTvDob = itemView.findViewById(R.id.tvDob);
        relativeLayout = itemView.findViewById(R.id.relativeLayout);


    }

    public void setData(StudentModel studentModel){
        mTvStudentImg.setImageResource(studentModel.getImageId());
        mTvName.setText(studentModel.getName());
        mTvAge.setText(studentModel.getAge()+"");
        mTvDob.setText(studentModel.getDob());
        mTvAddress.setText(studentModel.getAddress());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(studentModel,getAdapterPosition());

            }
        });
    }
}
