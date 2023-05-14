package com.example.week2practical;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        Button group1 = findViewById(R.id.button2);
        group1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                GroupFragment1 myFragment = new GroupFragment1();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, myFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        Button group2 = findViewById(R.id.button3);
        group2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                GroupFragment2 myFragment2 = new GroupFragment2();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, myFragment2)
                        .commit();
            }
        });
    }
}