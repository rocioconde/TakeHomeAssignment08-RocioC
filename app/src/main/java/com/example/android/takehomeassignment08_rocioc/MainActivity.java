package com.example.android.takehomeassignment08_rocioc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference title = database.getReference("showTitle");
    private DatabaseReference flamencoArtists = database.getReference("flamencoArtist");

    private EditText showTitle;
    private EditText artistName;
    private EditText age;
    private CheckBox performedInNewYork;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showTitle = (EditText) findViewById(R.id.title);
        artistName = (EditText) findViewById(R.id.flamenco_artist);
        age = (EditText) findViewById(R.id.age);
        performedInNewYork = (CheckBox) findViewById(R.id.perfomed_new_york);
    }

    public void setTitle(View view) {
        String flamencoShow = showTitle.getText().toString();
        title.setValue(new String(flamencoShow));
    }


    public void addArtist(View view) {


        String artistName1 = artistName.getText().toString();
        String artistAge = age.getText().toString();
        int artistAge1 = Integer.parseInt(artistAge);
        boolean performedInNewYork1;
        performedInNewYork1 = performedInNewYork.isChecked();

        flamencoArtists.push().setValue(new FlamencoArtist(artistName1, artistAge1, performedInNewYork1));

    }
}
