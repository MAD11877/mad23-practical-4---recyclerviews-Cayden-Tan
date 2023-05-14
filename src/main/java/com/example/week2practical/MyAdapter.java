package com.example.week2practical;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;
    private List<User> data;

    private static final int VIEW_TYPE_WITH_FRAME = 1;
    private static final int VIEW_TYPE_WITHOUT_FRAME = 2;

    private MyViewHolder.OnItemClickListener listener;

    private MyViewHolder2.OnItemClickListener listener2;

    @Override
    public int getItemViewType(int position) {
        // Determine the view type based on the item's position or other criteria.
        // This is just an example. You can use your own logic to determine the view type.
        String username = data.get(position).getName();
        if (username.charAt(username.length() - 1) == '7') {
            return VIEW_TYPE_WITH_FRAME;
        } else {
            return VIEW_TYPE_WITHOUT_FRAME;
        }
    }
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(MyViewHolder.OnItemClickListener listener) {
        this.listener = listener;
    }
    public void setOnItemClickeListener2(MyViewHolder2.OnItemClickListener listener2) {
        this.listener2 = listener2;
    }
    public void setOnItemClickListener2(MyViewHolder2.OnItemClickListener listener2) {
        this.listener2 = listener2;
    }
    public MyAdapter(Context context, List<User> data){
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_WITHOUT_FRAME) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_view, parent, false);
            MyViewHolder viewHolder = new MyViewHolder(view);
            viewHolder.setOnItemClickListener(listener);
            return viewHolder; }
        else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user2_view, parent, false);
            MyViewHolder2 viewHolder2 = new MyViewHolder2(view);
            viewHolder2.setOnItemClickListener(listener2);
            return viewHolder2;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == VIEW_TYPE_WITHOUT_FRAME) {
            MyViewHolder holder1 = (MyViewHolder) holder ;
            holder1.nameView.setText(data.get(position).getName());
            holder1.descView.setText(data.get(position).getDescription());
            holder1.imgView.setImageResource(data.get(position).getImg()); }
        else {
            MyViewHolder2 holder2 = (MyViewHolder2) holder ;
            holder2.nameView2.setText(data.get(position).getName());
            holder2.descView2.setText(data.get(position).getDescription());
            holder2.imgView2.setImageResource(data.get(position).getImg());
            holder2.UserFrame.setImageResource(data.get(position).getImg());


        }

    }


    @Override
    public int getItemCount() {

        return data.size();
    }
}
