package com.example.nicko.rekids_regular_expressions_for_kids_.Instructions_help;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nicko.rekids_regular_expressions_for_kids_.Games.Game_3_Expert;
import com.example.nicko.rekids_regular_expressions_for_kids_.R;

public class Game_3_Instruction extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_3__instruction);
        mediaPlayer = MediaPlayer.create(Game_3_Instruction.this, R.raw.help);
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
}
