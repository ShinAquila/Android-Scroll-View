package com.example.nameapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public CardView maps,games;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.next_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){openActivity2();}


        });

        games = (CardView) findViewById(R.id.gamesCard);
        games.setOnClickListener(this::onClick);

        maps = (CardView) findViewById(R.id.mapsCard);
        maps.setOnClickListener(this::onClick);


    }


    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void onClick(View view){
        Intent i;

        if (view.getId() == R.id.gamesCard){
            i = new Intent(this,games.class);
            startActivity(i);
        } else if (view.getId() == R.id.mapsCard) {
            i = new Intent(this,maps.class);
            startActivity(i);
        }

    }
}