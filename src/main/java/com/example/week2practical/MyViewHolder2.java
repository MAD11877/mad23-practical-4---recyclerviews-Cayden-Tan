package com.example.week2practical;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class MyViewHolder2 extends RecyclerView.ViewHolder {
    ImageView imgView2, UserFrame;
    TextView nameView2,descView2;

    private OnItemClickListener listener2;

    public MyViewHolder2(@NotNull View userView2){
        super(userView2);
        nameView2 = userView2.findViewById(R.id.name);
        descView2 = userView2.findViewById(R.id.description);
        imgView2 = userView2.findViewById(R.id.ListimageView);
        UserFrame = userView2.findViewById(R.id.UserFrame);

        userView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener2 != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener2.onItemClick(position);
                    }
                }
            }
        });

    }
    public static interface OnItemClickListener {
        void onItemClick(int position);
    }

    // Add a setter method for the listener
    public void setOnItemClickListener(MyViewHolder2.OnItemClickListener listener2) {
        this.listener2 = listener2;
    }


}

