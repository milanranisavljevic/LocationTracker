package com.lt.milanranisavljevic.locationtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyTracks extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_tracks);
        init();
    }

    private void init() {
        Button btnNewTrack = (Button) findViewById(R.id.btnNewTrack);
        btnNewTrack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNewTrack:
                Intent intentNewTrack = new Intent(this, NewTrack.class);
                startActivity(intentNewTrack);
        }
    }
}
