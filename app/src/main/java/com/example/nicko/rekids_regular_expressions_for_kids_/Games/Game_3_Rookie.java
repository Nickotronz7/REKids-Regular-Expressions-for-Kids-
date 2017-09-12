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

public class Game_3_Rookie extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    TextView T1;
    TextView T2;
    TextView T3;
    Button B1;
    Button B2;
    Button B3;
    ImageView H3;
    ImageView H2;
    ImageView H1;
    ImageView G3;
    ImageView G2;
    ImageView G1;
    boolean h3=true;
    boolean h2=true;
    boolean h1=true;
    boolean g3=true;
    boolean g2=true;
    boolean g1=true;
    int hp=0;
    int ohp=0;
    int lvl=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_3__rookie);
        T1 = (TextView) findViewById(R.id.T1);
        T2 = (TextView) findViewById(R.id.T2);
        T3 = (TextView) findViewById(R.id.T3);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        H1 = (ImageView) findViewById(R.id.H1);
        H2 = (ImageView) findViewById(R.id.H2);
        H3 = (ImageView) findViewById(R.id.H3);
        G1 = (ImageView) findViewById(R.id.G1);
        G2 = (ImageView) findViewById(R.id.G3);
        G3 = (ImageView) findViewById(R.id.G2);
        B1Pressed();
        B2Pressed();
        B3Pressed();
        mediaPlayer = MediaPlayer.create(Game_3_Rookie.this, R.raw.battle);
        Play();
    }
    public void B1Pressed(){
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hp==2|ohp==2){
                    Intent Juego3Activity = new Intent(Game_3_Rookie.this, GameOver_game3.class);
                    startActivity(Juego3Activity);
                }
                else{
                switch (lvl){
                    case 1: load(2);
                            G3.setVisibility(View.INVISIBLE);
                            ohp=ohp+1;
                            lvl=lvl+1;
                            break;
                    case 2: if (h3==true){
                        H3.setVisibility(View.INVISIBLE);
                        h3=false;
                        hp=hp+1;
                    }
                    else if (h2==true){
                        H2.setVisibility(View.INVISIBLE);
                        h2=false;
                        hp=hp+1;
                    }
                    else{
                        H1.setVisibility(View.INVISIBLE);
                        h1=false;
                        hp=hp+1;
                    }
                    break;
                    case 3:
                        G1.setVisibility(View.INVISIBLE);
                        ohp=ohp+1;
                        lvl=lvl+1;
                        break;

                }
            }
        }
    });
}

    public void B2Pressed(){
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hp==3|ohp==3){
                    Intent Juego3Activity = new Intent(Game_3_Rookie.this, GameOver_game3.class);
                    startActivity(Juego3Activity);
                }
                else{
                    switch (lvl){
                        case 1: if (h3==true){
                            H3.setVisibility(View.INVISIBLE);
                            h3=false;
                            hp=hp+1;
                        }
                        else if (h2==true){
                            H2.setVisibility(View.INVISIBLE);
                            h2=false;
                            hp=hp+1;
                        }
                        else{
                            H1.setVisibility(View.INVISIBLE);
                            h1=false;
                            hp=hp+1;
                        }
                            break;
                        case 2: load(3);
                            G2.setVisibility(View.INVISIBLE);
                            ohp=ohp+1;
                            lvl=lvl+1;
                            break;
                        case 3: if (h3==true){
                            H3.setVisibility(View.INVISIBLE);
                            h3=false;
                            hp=hp+1;
                        }
                        else if (h2==true){
                            H2.setVisibility(View.INVISIBLE);
                            h2=false;
                            hp=hp+1;
                        }
                        else{
                            H1.setVisibility(View.INVISIBLE);
                            h1=false;
                            hp=hp+1;
                        }
                            break;

                    }
                }
            }
        });
    }

    public void B3Pressed(){
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hp==3|ohp==3){
                    Intent Juego3Activity = new Intent(Game_3_Rookie.this, GameOver_game3.class);
                    startActivity(Juego3Activity);
                }
                else{
                    if (h3==true){
                        H3.setVisibility(View.INVISIBLE);
                        h3=false;
                        hp=hp+1;
                    }
                    else if (h2==true){
                        H2.setVisibility(View.INVISIBLE);
                        h2=false;
                        hp=hp+1;
                    }
                    else{
                        H1.setVisibility(View.INVISIBLE);
                        h1=false;
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
        T1.setText("abcaa");
        T2.setText("abcbc");
        T3.setText("abcac");
        B1.setText("(a+b+c) a (a+c)");
        B2.setText("abc (a+b) (a+c)");
        B3.setText("ab (c+a) ba");
    }
    protected void lvl3(){
        T1.setText("aaabac");
        T2.setText("babbbc");
        T3.setText("baabbc");
        B1.setText("[(a+b) a] [(a+b) b] [(a+b) c]");
        B2.setText("aaa [(a+b)(a+c)]");
        B3.setText("b [(a+b) b (a+c)] c");
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
