package com.arnoldvaz27.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.imageButton);
        
        imageButton.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Hii I'm Image Button", Toast.LENGTH_SHORT).show());
    }
}