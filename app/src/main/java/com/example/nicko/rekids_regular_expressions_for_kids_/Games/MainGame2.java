
package com.example.nicko.rekids_regular_expressions_for_kids_.Games;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nicko.rekids_regular_expressions_for_kids_.R;
import com.example.nicko.rekids_regular_expressions_for_kids_.Tools.Matriz;

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

    public void show(View v) {
        Matriz matriz = new Matriz();
        int refExp = R.id.textView;
        int cellID = R.id.textBox00;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 11; j++){
                editText = (EditText) findViewById(cellID+(i*10)+j);
                String value = editText.getText().toString();
                matriz.addData(value,j,i);
            }
        }
        String regexp = matriz.regularExp();

        TextView myAwesomeTextView = (TextView) findViewById(refExp);
        myAwesomeTextView.setText(regexp);


    }
}