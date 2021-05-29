package com.quotes.randomquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMotivation,btnAttitude,btnTravel,btnSchool,btnCollege;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMotivation = findViewById(R.id.btnMotivational);
        btnAttitude = findViewById(R.id.btnAttitude);
        btnTravel = findViewById(R.id.btnTravelling);
        btnSchool = findViewById(R.id.btnSchool);
        btnCollege = findViewById(R.id.btnCollege);

        btnMotivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ViewActivity.class);
//                i.putExtra("Motivational","First Quotes");
                startActivity(i);
            }

        });
        btnAttitude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ViewActivity.class);
//                i.putExtra("Motivational","First Quotes");
                startActivity(i);
            }

        });
        btnTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ViewActivity.class);
//                i.putExtra("Motivational","First Quotes");
                startActivity(i);
            }

        });
        btnSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ViewActivity.class);
//                i.putExtra("Motivational","First Quotes");
                startActivity(i);
            }

        });
        btnCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ViewActivity.class);
//                i.putExtra("Motivational","First Quotes");
                startActivity(i);
            }

        });

    }
}