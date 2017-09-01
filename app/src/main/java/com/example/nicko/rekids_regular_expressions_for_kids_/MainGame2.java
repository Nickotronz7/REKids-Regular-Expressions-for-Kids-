package com.example.nicko.rekids_regular_expressions_for_kids_;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainGame2 extends AppCompatActivity {

    public EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_game2);


    }

    public void clear(View v){
        int name = R.id.textBox00;
        for (int i = 0; i < 33; i++){
            editText = (EditText) findViewById(name+i);
            editText.setText("");
        }
    }
}
