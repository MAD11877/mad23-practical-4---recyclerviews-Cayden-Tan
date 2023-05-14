package com.example.week2practical;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        TextView tv = findViewById(R.id.editTextText2);
        tv.setText(username);

        Button followButton = findViewById(R.id.followButton);
        Button messageButton = findViewById(R.id.messageButton);
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonTextString = followButton.getText().toString();
                if (buttonTextString.equals("Follow")) {
                    followButton.setText("Unfollow");
                    Toast.makeText(MainActivity.this, "Followed!", Toast.LENGTH_SHORT).show();
                }
                else{
                    followButton.setText("Follow");
                    Toast.makeText(MainActivity.this, "Unfollowed...", Toast.LENGTH_SHORT).show();

                }
            }
        });

        messageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent2 = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(intent2);
            }
        });
    }
}