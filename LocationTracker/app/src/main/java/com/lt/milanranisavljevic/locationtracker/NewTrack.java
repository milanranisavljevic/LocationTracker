package com.lt.milanranisavljevic.locationtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewTrack extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_track);
        init();

    }

    private void init() {
        EditText name = (EditText)findViewById(R.id.etName);
        EditText description = (EditText)findViewById(R.id.etDescription);
        Button btnStart = (Button)findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
        if( name.getText().toString().length() == 0)
            name.setError( "Name is required!" );
        if( description.getText().toString().length() == 0)
            description.setError( "Description is required!" );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnStart:
                Intent intentNewTrack = new Intent(this, TrackDetails.class);
                startActivity(intentNewTrack);
        }
    }
}
