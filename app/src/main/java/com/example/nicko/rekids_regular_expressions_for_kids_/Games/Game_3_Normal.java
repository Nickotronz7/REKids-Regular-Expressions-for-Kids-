package com.example.nicko.rekids_regular_expressions_for_kids_.Games;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nicko.rekids_regular_expressions_for_kids_.Menus.GameOver_game3;
import com.example.nicko.rekids_regular_expressions_for_kids_.R;

public class Game_3_Normal extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    TextView T4;
    TextView T5;
    TextView T6;
    Button B4;
    Button B5;
    Button B6;
    ImageView H6;
    ImageView H5;
    ImageView H4;
    ImageView G6;
    ImageView G5;
    ImageView G4;
    boolean h6=true;
    boolean h5=true;
    boolean h4=true;
    boolean g6=true;
    boolean g5=true;
    boolean g4=true;
    int hp=0;
    int ohp=0;
    int lvl=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_3__normal);
        T4 = (TextView) findViewById(R.id.T4);
        T5 = (TextView) findViewById(R.id.T5);
        T6 = (TextView) findViewById(R.id.T6);
        B4 = (Button) findViewById(R.id.B4);
        B5 = (Button) findViewById(R.id.B5);
        B6 = (Button) findViewById(R.id.B6);
        H4 = (ImageView) findViewById(R.id.H4);
        H5 = (ImageView) findViewById(R.id.H5);
        H6 = (ImageView) findViewById(R.id.H6);
        G4 = (ImageView) findViewById(R.id.G4);
        G5 = (ImageView) findViewById(R.id.G5);
        G6 = (ImageView) findViewById(R.id.G6);


        B1Pressed();
        B2Pressed();
        B3Pressed();
        mediaPlayer = MediaPlayer.create(Game_3_Normal.this, R.raw.battle);
        Play();
    }

    public void B1Pressed(){
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hp==2|ohp==2){
                    Intent Juego3Activity = new Intent(Game_3_Normal.this, GameOver_game3.class);
                    startActivity(Juego3Activity);
                }
                else{
                    switch (lvl){
                        case 1: if (h6==true){
                            H6.setVisibility(View.INVISIBLE);
                            h6=false;
                            hp=hp+1;
                        }
                        else if (h5==true){
                            H5.setVisibility(View.INVISIBLE);
                            h5=false;
                            hp=hp+1;
                        }
                        else{
                            H4.setVisibility(View.INVISIBLE);
                            h4=false;
                            hp=hp+1;
                        }
                            break;
                        case 2: if (h6==true){
                            H6.setVisibility(View.INVISIBLE);
                            h6=false;
                            hp=hp+1;
                        }
                        else if (h5==true){
                            H5.setVisibility(View.INVISIBLE);
                            h5=false;
                            hp=hp+1;
                        }
                        else{
                            H4.setVisibility(View.INVISIBLE);
                            h4=false;
                            hp=hp+1;
                        }
                            break;
                        case 3:
                            G4.setVisibility(View.INVISIBLE);
                            ohp=ohp+1;
                            lvl=lvl+1;
                            break;

                    }
                }
            }
        });
    }

    public void B2Pressed(){
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hp==2|ohp==2){
                    Intent Juego3Activity = new Intent(Game_3_Normal.this, GameOver_game3.class);
                    startActivity(Juego3Activity);
                }
                else{
                    switch (lvl){
                        case 1: load(2);
                            G6.setVisibility(View.INVISIBLE);
                            ohp=ohp+1;
                            lvl=lvl+1;
                            break;
                        case 2: load(3);
                            G5.setVisibility(View.INVISIBLE);
                            ohp=ohp+1;
                            lvl=lvl+1;
                            break;
                        case 3: if (h6==true){
                            H6.setVisibility(View.INVISIBLE);
                            h6=false;
                            hp=hp+1;
                        }
                        else if (h5==true){
                            H5.setVisibility(View.INVISIBLE);
                            h5=false;
                            hp=hp+1;
                        }
                        else{
                            H4.setVisibility(View.INVISIBLE);
                            h4=false;
                            hp=hp+1;
                        }
                            break;

                    }
                }
            }
        });
    }

    public void B3Pressed(){
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hp==2|ohp==2){
                    Intent Juego3Activity = new Intent(Game_3_Normal.this, GameOver_game3.class);
                    startActivity(Juego3Activity);
                }
                else{
                    if (h6==true){
                        H6.setVisibility(View.INVISIBLE);
                        h6=false;
                        hp=hp+1;
                    }
                    else if (h5==true){
                        H5.setVisibility(View.INVISIBLE);
                        h5=false;
                        hp=hp+1;
                    }
                    else{
                        H4.setVisibility(View.INVISIBLE);
                        h4=false;
                        hp=hp+1;
                    }
                }
            }
        });
    }

    public void load(int number){
        if(number==2){
            this.lvl2();
        }
        else{
            this.lvl3();
        }
    }
    protected void lvl2(){
        T4.setText("caca");
        T5.setText("caasst");
        T6.setText("cas");
        B4.setText("ca +(r+s+t)*");
        B5.setText("c (a)* (r+s+t)*");
        B6.setText("(c+a) (a)* (r+s+t)*");
    }
    protected void lvl3(){
        T4.setText("abcbcarttts");
        T5.setText("bart");
        T6.setText("cacaartss");
        B4.setText("[(c+a+b)* a] [r (s+r+t)*]");
        B5.setText("[ba (c+a) r] (r+s+t)");
        B6.setText("(b+a+c)*+ [r (s+t+r)*]");
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
