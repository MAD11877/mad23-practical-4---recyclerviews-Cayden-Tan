package com.example.week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ListActivity extends AppCompatActivity {

    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);


        List<User> data = new ArrayList<User>();
        data.add(new User("User132586325", "Excommunicado", 1, false, R.drawable.a));
        data.add(new User("User234234237", "Excommunicado", 2, false, R.drawable.a));
        data.add(new User("User123434666", "Excommunicado", 3, false, R.drawable.a));
        data.add(new User("User834823837", "Excommunicado", 4, false, R.drawable.a));
        data.add(new User("User055353535", "Excommunicado", 5, false, R.drawable.a));
        data.add(new User("User123556235", "Excommunicado", 6, false, R.drawable.a));
        data.add(new User("User103003500", "Excommunicado", 7, false, R.drawable.a));
        data.add(new User("User224353535", "Excommunicado", 8, false, R.drawable.a));
        data.add(new User("User123548236", "Excommunicado", 9, false, R.drawable.a));
        data.add(new User("User453535567", "Excommunicado", 10, false, R.drawable.a));
        data.add(new User("User354545455", "Excommunicado", 11, false, R.drawable.a));
        data.add(new User("User005823978", "Excommunicado", 12, false, R.drawable.a));
        data.add(new User("User235235765", "Excommunicado", 13, false, R.drawable.a));
        data.add(new User("User656565656", "Excommunicado", 14, false, R.drawable.a));
        data.add(new User("User135902535", "Excommunicado", 15, false, R.drawable.a));
        data.add(new User("User135252353", "Excommunicado", 16, false, R.drawable.a));
        data.add(new User("User177373779", "Excommunicado", 17, false, R.drawable.a));
        data.add(new User("User637257235", "Excommunicado", 18, false, R.drawable.a));
        data.add(new User("User235235246", "Excommunicado", 19, false, R.drawable.a));
        data.add(new User("User937563357", "Excommunicado", 20, false, R.drawable.a));

        adapter = new MyAdapter(this, data);
        adapter.setOnItemClickListener(new MyViewHolder.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // Handle the click event and navigate to the target page
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                intent.putExtra("username", data.get(position).getName());
                startActivity(intent);
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}