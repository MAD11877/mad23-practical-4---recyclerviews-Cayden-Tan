package com.example.week2practical;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


    private Context context;
    private List<User> data;

    private static final int VIEW_TYPE_WITH_FRAME = 1;
    private static final int VIEW_TYPE_WITHOUT_FRAME = 2;

    private MyViewHolder.OnItemClickListener listener;

    @Override
    public int getItemViewType(int position) {
        // Determine the view type based on the item's position or other criteria.
        // This is just an example. You can use your own logic to determine the view type.
        if (position % 2 == 0) {
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
    public MyAdapter(Context context, List<User> data){
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_view, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        viewHolder.setOnItemClickListener(listener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User userData = data.get(position);
        holder.nameView.setText(data.get(position).getName());
        holder.descView.setText(data.get(position).getDescription());
        holder.imgView.setImageResource(data.get(position).getImg());

    }


    @Override
    public int getItemCount() {

        return data.size();
    }
}
