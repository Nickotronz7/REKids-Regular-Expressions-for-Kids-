package com.example.nicko.rekids_regular_expressions_for_kids_.Menus;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

import com.example.nicko.rekids_regular_expressions_for_kids_.R;

import com.example.nicko.rekids_regular_expressions_for_kids_.Games.*;


public class Game_1_Menu extends AppCompatActivity {

    private Button btnManual, btnRookie, btnNormal, btnExpert;
    private MediaPlayer mediaPlayer;

    public void btnNManualAction(){
        btnManual = (Button)findViewById(R.id.btnUserManual);
        btnManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent UserManualActivity = new Intent(Game_1_Menu.this,Game_1_UserManual.class);

                startActivity(UserManualActivity);

            }
        });

    }

    public void RookieAction(){
        btnRookie = (Button)findViewById(R.id.btnGameRookie);
        btnRookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RookieGameActivity = new Intent(Game_1_Menu.this, Game_1_Rookie.class);
                startActivity(RookieGameActivity);
            }
        });
    }

    public void NormalAction(){
        btnNormal = (Button)findViewById(R.id.btnGameNormal);
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NormalGameActivity = new Intent(Game_1_Menu.this, Game_1_Normal.class);
                startActivity(NormalGameActivity);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_1__menu);

        mediaPlayer = MediaPlayer.create(Game_1_Menu.this, R.raw.game_1_menu);
        Play();


        //Llamada a las acciones de los botones
        btnNManualAction();
        RookieAction();
        NormalAction();

    }

    public void Play(){
        mediaPlayer.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.release();
    }
}
