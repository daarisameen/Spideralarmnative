package com.github.daaris.simplealarms.ui;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.ppartisan.simplealarms.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final FloatingActionButton showRules = (FloatingActionButton) findViewById(R.id.fa);

        showRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewRules = new Intent(MainActivity.this,timer.class);
                startActivity(viewRules);


            }
        });

        final FloatingActionButton showRule = (FloatingActionButton) findViewById(R.id.f);

        showRule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewRule = new Intent(MainActivity.this,Stopwatch.class);
                startActivity(viewRule);


            }
        });


    }

}