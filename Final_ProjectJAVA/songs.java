package com.example.kiddiealphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class songs extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Baa Baa Black Sheep","Unknown",R.raw.baabaablackship));
        arrayList.add(new Music("Five Little Monkeys","Unknown",R.raw.fivelittlemonkeys));
        arrayList.add(new Music("Hickory Dickory","Unknown",R.raw.hickorydickory));
        arrayList.add(new Music("Humpty Dumpty","Unknown",R.raw.humptydumpty));
        arrayList.add(new Music("Jack And Jill","Unknown",R.raw.jacknjill));
        arrayList.add(new Music("London Bridge","Unknown",R.raw.londonbridge));
        arrayList.add(new Music("Mary Had A Little Lamb","Unknown",R.raw.maryhadalittlelamb));
        arrayList.add(new Music("Old McDonald","Unknown",R.raw.oldmcdonald));
        arrayList.add(new Music("One Two Thee Four","Unknown",R.raw.onetwothreefour));
        arrayList.add(new Music("Rain Rain Go Away","Unknown",R.raw.rainraingoaway));
        arrayList.add(new Music("Row Row Your Boat","Unknown",R.raw.rowrowrowyourboat));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    }

    public void backbtn(View view) {
        finish();
    }
}