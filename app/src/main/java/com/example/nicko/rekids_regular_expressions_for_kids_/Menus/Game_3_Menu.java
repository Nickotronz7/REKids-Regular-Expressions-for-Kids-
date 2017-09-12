package com.example.nicko.rekids_regular_expressions_for_kids_.Menus;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nicko.rekids_regular_expressions_for_kids_.Games.Game_3_Expert;
import com.example.nicko.rekids_regular_expressions_for_kids_.Games.Game_3_Normal;
import com.example.nicko.rekids_regular_expressions_for_kids_.Games.Game_3_Rookie;
import com.example.nicko.rekids_regular_expressions_for_kids_.Instructions_help.Game_3_Instruction;
import com.example.nicko.rekids_regular_expressions_for_kids_.R;

public class Game_3_Menu extends AppCompatActivity {
    private  Button RookieBtn;
    private  Button NormalBtn;
    private  Button ExpertBtn;
    private  Button HelpBtn;
    private MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_3__menu);

        StartGameOnRookie();
        StartGameOnIntermediate();
        StartGameOnExpert();
        DisplayHelp();
        mediaPlayer = MediaPlayer.create(Game_3_Menu.this, R.raw.main);
        Play();
    }

    public void Play(){
        mediaPlayer.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.release();

    }

    public void StartGameOnRookie(){
        RookieBtn = (Button)findViewById(R.id.RookieBtn);
        RookieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                Intent gameR = new Intent(Game_3_Menu.this,Game_3_Rookie.class);
                startActivity(gameR);
            }
        });
    }

    public void StartGameOnIntermediate(){
        NormalBtn = (Button)findViewById(R.id.NormalBtn);
        NormalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                Intent gameI = new Intent(Game_3_Menu.this, Game_3_Normal.class);
                startActivity(gameI);
            }
        });
    }

    public void StartGameOnExpert(){
        ExpertBtn = (Button)findViewById(R.id.ExpertBtn);
        ExpertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                Intent gameE = new Intent(Game_3_Menu.this,Game_3_Expert.class);
                startActivity(gameE);
            }
        });
    }

    public void DisplayHelp(){
        HelpBtn = (Button)findViewById(R.id.HelpBtn);
        HelpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                Intent display = new Intent(Game_3_Menu.this,Game_3_Instruction.class);
                startActivity(display);
            }
        });
    }
}
