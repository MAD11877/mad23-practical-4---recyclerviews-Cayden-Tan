package com.example.week2practical;
import android.view.View;
import android.media.Image;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imgView;
    TextView nameView,descView;

    private OnItemClickListener listener;

    public MyViewHolder(@NotNull View userView){
        super(userView);
        nameView = userView.findViewById(R.id.name);
        descView = userView.findViewById(R.id.description);
        imgView = userView.findViewById(R.id.ListimageView);

        userView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
            }
        });

    }
    public static interface OnItemClickListener {
        void onItemClick(int position);
    }

    // Add a setter method for the listener
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }


}

