package com.example.nicko.rekids_regular_expressions_for_kids_.Menus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.nicko.rekids_regular_expressions_for_kids_.Games.MainGame2;
import com.example.nicko.rekids_regular_expressions_for_kids_.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGame2 (View v){
        Intent intent = new Intent(this, MainGame2.class);
        startActivity(intent);
    }
}