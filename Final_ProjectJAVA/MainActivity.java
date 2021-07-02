package com.example.kiddiealphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abcbtn (View view) {
        Intent intent = new Intent(this,ABC.class);
        startActivity(intent);
    }

    public void stroiesbtn (View view) {
        Intent intent = new Intent(this,stories.class);
        startActivity(intent);
    }

    public void songsbtn(View view) {
        Intent intent = new Intent(this,songs.class);
        startActivity(intent);
    }
}