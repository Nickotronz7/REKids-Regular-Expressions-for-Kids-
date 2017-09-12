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

public class Game_3_Expert extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    TextView T7;
    TextView T8;
    TextView T9;
    Button B7;
    Button B8;
    Button B9;
    ImageView H7;
    ImageView H8;
    ImageView H9;
    ImageView G7;
    ImageView G8;
    ImageView G9;
    boolean h7=true;
    boolean h8=true;
    boolean h9=true;
    boolean g7=true;
    boolean g8=true;
    boolean g9=true;
    int hp=0;
    int ohp=0;
    int lvl=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_3__expert);
        T7 = (TextView) findViewById(R.id.T7);
        T8 = (TextView) findViewById(R.id.T8);
        T9 = (TextView) findViewById(R.id.T9);
        B7 = (Button) findViewById(R.id.B7);
        B8 = (Button) findViewById(R.id.B8);
        B9 = (Button) findViewById(R.id.B9);
        H7 = (ImageView) findViewById(R.id.H7);
        H8 = (ImageView) findViewById(R.id.H8);
        H9 = (ImageView) findViewById(R.id.H9);
        G7 = (ImageView) findViewById(R.id.G7);
        G8 = (ImageView) findViewById(R.id.G8);
        G9 = (ImageView) findViewById(R.id.G9);
        B7Pressed();
        B8Pressed();
        B9Pressed();
        mediaPlayer = MediaPlayer.create(Game_3_Expert.this, R.raw.game_1_assasins);
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

    public void B7Pressed(){
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hp==2|ohp==2){
                    Intent Juego3Activity = new Intent(Game_3_Expert.this, GameOver_game3.class);
                    startActivity(Juego3Activity);
                }
                else{
                    if (h9==true){
                        H9.setVisibility(View.INVISIBLE);
                        h9=false;
                        hp=hp+1;
                    }
                    else if (h8==true){
                        H8.setVisibility(View.INVISIBLE);
                        h8=false;
                        hp=hp+1;
                        }
                    else{
                        H7.setVisibility(View.INVISIBLE);
                        h7=false;
                        hp=hp+1;
                        }
                    }
            }
        });
    }

    public void B8Pressed(){
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hp==2|ohp==2){
                    Intent Juego3Activity = new Intent(Game_3_Expert.this, GameOver_game3.class);
                    startActivity(Juego3Activity);
                }
                else{
                    switch (lvl){
                        case 1: if (h9==true){
                            H9.setVisibility(View.INVISIBLE);
                            h9=false;
                            hp=hp+1;
                        }
                        else if (h8==true){
                            H8.setVisibility(View.INVISIBLE);
                            h8=false;
                            hp=hp+1;
                        }
                        else{
                            H7.setVisibility(View.INVISIBLE);
                            h7=false;
                            hp=hp+1;
                        }
                            break;
                        case 2: if (h9==true){
                            H9.setVisibility(View.INVISIBLE);
                            h9=false;
                            hp=hp+1;
                        }
                        else if (h8==true){
                            H8.setVisibility(View.INVISIBLE);
                            h8=false;
                            hp=hp+1;
                        }
                        else{
                            H7.setVisibility(View.INVISIBLE);
                            h7=false;
                            hp=hp+1;
                        }
                            break;
                        case 3: if (h9==true){
                            H9.setVisibility(View.INVISIBLE);
                            h9=false;
                            hp=hp+1;
                        }
                        else if (h8==true){
                            H8.setVisibility(View.INVISIBLE);
                            h8=false;
                            hp=hp+1;
                        }
                        else{
                            H7.setVisibility(View.INVISIBLE);
                            h7=false;
                            hp=hp+1;
                        }
                        break;
                    }
                }
            }
        });
    }

    public void B9Pressed(){
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hp==2|ohp==2){
                    Intent Juego3Activity = new Intent(Game_3_Expert.this, GameOver_game3.class);
                    startActivity(Juego3Activity);
                }
                else{
                    switch (lvl){
                        case 1: load(2);
                            G7.setVisibility(View.INVISIBLE);
                            ohp=ohp+1;
                            lvl=lvl+1;
                            break;
                        case 2: load(3);
                            G8.setVisibility(View.INVISIBLE);
                            ohp=ohp+1;
                            lvl=lvl+1;
                            break;
                        case 3: if (h9==true){
                            H9.setVisibility(View.INVISIBLE);
                            h9=false;
                            hp=hp+1;
                        }
                        else if (h8==true){
                            H8.setVisibility(View.INVISIBLE);
                            h8=false;
                            hp=hp+1;
                        }
                        else{
                            H7.setVisibility(View.INVISIBLE);
                            h7=false;
                            hp=hp+1;
                        }
                            break;

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
        T7.setText("abb");
        T8.setText("babbabaabbaa");
        T9.setText("abababbabaabb");
        B7.setText("(a+b)* b* (a+b)* b");
        B8.setText("a* (aa+bb)* b*");
        B9.setText("(a+b)* (a+bb)");//correcta
    }
    protected void lvl3(){
        T7.setText("aab");
        T8.setText("aaaaaaaaaabbbbbbb");
        T9.setText("aaaaaaaaaaaaaabb");
        B7.setText("(a)* (b)*");
        B8.setText("(aa)* (bb)* b");//c
        B9.setText("(a+b)*");
    }
}
