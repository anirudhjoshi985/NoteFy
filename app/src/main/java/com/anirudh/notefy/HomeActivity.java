package com.anirudh.notefy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;



public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button mButton = (Button) findViewById(R.id.buttonbro);
    }
}
