package com.example.kas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View view){
        Toast.makeText(this, "Opening Memory's", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        startActivity(intent);
    }
    public void openActivity1(View view){
        Toast.makeText(this, "Opening Funny Pics", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity3.class);
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button2);
        startActivity(intent);
    }
    public void openActivity2(View view){
        Toast.makeText(this, "Opening Social Media", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity4.class);
        textView = findViewById(R.id.textView);
        button2 = findViewById(R.id.button3);
        startActivity(intent);
    }
    public void openActivity3(View view){
        Toast.makeText(this, "About JaDDu", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity5.class);
        textView = findViewById(R.id.textView);
        button2 = findViewById(R.id.button4);
        startActivity(intent);
    }
}