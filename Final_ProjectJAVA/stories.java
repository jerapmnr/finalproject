package com.example.kiddiealphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
    }

    public void backbtn(View view) {
        finish();
    }

    public void ibtn(View view) {
        Intent intent = new Intent(this,stri.class);
        startActivity(intent);
    }

    public void iibtn(View view) {
        Intent intent = new Intent(this,strii.class);
        startActivity(intent);
    }

    public void iiibtn(View view) {
        Intent intent = new Intent(this,striii.class);
        startActivity(intent);
    }

    public void ivbtn(View view) {
        Intent intent = new Intent(this,striv.class);
        startActivity(intent);
    }

    public void vbtn(View view) {
        Intent intent = new Intent(this,strv.class);
        startActivity(intent);
    }

    public void vibtn(View view) {
        Intent intent = new Intent(this,strvi.class);
        startActivity(intent);
    }

    public void viibtn(View view) {
        Intent intent = new Intent(this,strvii.class);
        startActivity(intent);
    }

    public void viiibtn(View view) {
        Intent intent = new Intent(this,strviii.class);
        startActivity(intent);
    }

    public void ixbtn(View view) {
        Intent intent = new Intent(this,strix.class);
        startActivity(intent);
    }

    public void xbtn(View view) {
        Intent intent = new Intent(this,strx.class);
        startActivity(intent);
    }

    public void xibtn(View view) {
        Intent intent = new Intent(this,strxi.class);
        startActivity(intent);
    }

    public void xiibtn(View view) {
        Intent intent = new Intent(this,strxii.class);
        startActivity(intent);
    }

    public void xiiibtn(View view) {
        Intent intent = new Intent(this,strxiii.class);
        startActivity(intent);
    }

    public void xivbtn(View view) {
        Intent intent = new Intent(this,strxiv.class);
        startActivity(intent);
    }

    public void xvbtn(View view) {
        Intent intent = new Intent(this,strxv.class);
        startActivity(intent);
    }
}