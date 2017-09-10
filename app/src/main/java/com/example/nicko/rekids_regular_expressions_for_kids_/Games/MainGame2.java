
package com.example.nicko.rekids_regular_expressions_for_kids_.Games;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nicko.rekids_regular_expressions_for_kids_.R;
import com.example.nicko.rekids_regular_expressions_for_kids_.Tools.Matriz;

public class MainGame2 extends AppCompatActivity {

    public EditText editText;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game2);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song2);
        SystemClock.sleep(250);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    protected void onPause() {
        super.onPause();
        if (this.isFinishing()){
            mediaPlayer.stop();
        }
    }

    public void clear(View v){
        int name = R.id.textBox00;
        for (int i = 0; i < 30; i++){
            editText = (EditText) findViewById(name+i);
            editText.setText("");
            TextView myAwesomeTextView = (TextView) findViewById(R.id.textHilerasView);
            TextView myAwesomeTexTView2 = (TextView) findViewById(R.id.textRegExpView);
            myAwesomeTexTView2.setText("");
            myAwesomeTextView.setText("");
        }
    }

    public void show(View v) {
        Matriz matriz = new Matriz();
        int refExp = R.id.textHilerasView;
        int cellID = R.id.textBox00;
        for (int j = 0; j < 10; j++){
            for (int i = 0; i < 3; i++){
                editText = (EditText) findViewById(cellID+(10*i)+j);
                String value = editText.getText().toString();
                matriz.addData(value,i,j);
            }
        }
        TextView myAwesomeTextView = (TextView) findViewById(refExp);
        TextView myAwesomeTexTView2 = (TextView) findViewById(R.id.textRegExpView);
        myAwesomeTexTView2.setText(matriz.regExpEnssambler());
        myAwesomeTextView.setText(matriz.getHileras(matriz.regExpEnssambler(), matriz.getAlfabeto(matriz.regExpEnssambler())));
    }
}