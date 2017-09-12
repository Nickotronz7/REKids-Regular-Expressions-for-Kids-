package com.example.nicko.rekids_regular_expressions_for_kids_.Games;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nicko.rekids_regular_expressions_for_kids_.R;

public class Game_1_Rookie extends AppCompatActivity {
    private TextView txtv1, txtv2, txtv3, txtv4, txtvPantallas;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btnLimpiar1, btnLimpiarT, btnNext, btnPrevious;
    private CheckBox check1, check2, check3, check4, check5, check6, check7, check8, check9, check10, check11, check12;
    private ImageView imgv1, imgv2, imgv3, imgv4;
    private CheckBox[] checkBoxes;
    private Button[] buttons;
    private TextView[] textViews;
    private MediaPlayer mediaPlayer;
    private int stage=1;
    private View view;

    public void cargarElementos(){
        //btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8
        //Identificar botones
        btn1 = (Button)findViewById(R.id.btnOption1);
        btn2 = (Button)findViewById(R.id.btnOption2);
        btn3 = (Button)findViewById(R.id.btnOption3);
        btn4 = (Button)findViewById(R.id.btnOption4);
        btn5 = (Button)findViewById(R.id.btnOption5);
        btn6 = (Button)findViewById(R.id.btnOption6);
        btn7 = (Button)findViewById(R.id.btnOption7);
        btn8 = (Button)findViewById(R.id.btnOption8);
        btnLimpiar1 = (Button)findViewById(R.id.btnLimpiar1);
        btnLimpiarT = (Button)findViewById(R.id.btnLimpiarT);
        btnNext = (Button)findViewById(R.id.btnNext);
        btnPrevious = (Button)findViewById(R.id.btnPrevious);

        //Identifivcar Views
        imgv1 = (ImageView)findViewById(R.id.imgv1);
        imgv2 = (ImageView)findViewById(R.id.imgv2);
        imgv3 = (ImageView)findViewById(R.id.imgv3);
        imgv4 = (ImageView)findViewById(R.id.imgv4);

        //Identificar TextViews
        txtv1 = (TextView)findViewById(R.id.txtvFirstQ);
        txtv2 = (TextView)findViewById(R.id.txtvSecondQ);
        txtv3 = (TextView)findViewById(R.id.txtvThirdQ);
        txtv4 = (TextView)findViewById(R.id.txtvFourthQ);
        txtvPantallas = (TextView)findViewById(R.id.txtvPantallas);

        //Identificar CheckBoxes
        check1 = (CheckBox)findViewById(R.id.chbxAnswer1);
        check2 = (CheckBox)findViewById(R.id.chbxAnswer2);
        check3 = (CheckBox)findViewById(R.id.chbxAnswer3);
        check4 = (CheckBox)findViewById(R.id.chbxAnswer4);
        check5 = (CheckBox)findViewById(R.id.chbxAnswer5);
        check6 = (CheckBox)findViewById(R.id.chbxAnswer6);
        check7 = (CheckBox)findViewById(R.id.chbxAnswer7);
        check8 = (CheckBox)findViewById(R.id.chbxAnswer8);
        check9 = (CheckBox)findViewById(R.id.chbxAnswer9);
        check10 = (CheckBox)findViewById(R.id.chbxAnswer10);
        check11 = (CheckBox)findViewById(R.id.chbxAnswer11);
        check12 = (CheckBox)findViewById(R.id.chbxAnswer12);
    }

    public void cargarArreglos(){
        checkBoxes = new CheckBox[12];
        checkBoxes[0] = check1;
        checkBoxes[1] = check2;
        checkBoxes[2] = check3;
        checkBoxes[3] = check4;
        checkBoxes[4] = check5;
        checkBoxes[5] = check6;
        checkBoxes[6] = check7;
        checkBoxes[7] = check8;
        checkBoxes[8] = check9;
        checkBoxes[9] = check10;
        checkBoxes[10] = check11;
        checkBoxes[11] = check12;

        buttons = new Button[12];
        buttons[0] = btn1;
        buttons[1] = btn2;
        buttons[2] = btn3;
        buttons[3] = btn4;
        buttons[4] = btn5;
        buttons[5] = btn6;
        buttons[6] = btn7;
        buttons[7] = btn8;
        buttons[8] = btnPrevious;
        buttons[9] = btnNext;
        buttons[10] = btnLimpiar1;
        buttons[11] = btnLimpiarT;

        textViews = new TextView[5];
        textViews[0] = txtv1;
        textViews[1] = txtv2;
        textViews[2] = txtv3;
        textViews[3] = txtv4;
        textViews[4] = txtvPantallas;




    }

    public void accionNiveles(){
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stage < 3){
                    stage += 1;
                    limpiarChecks();
                    cargarEscenario();
                    musica();
                }
            }
        });
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stage > 1){
                    stage -= 1;
                    limpiarChecks();
                    cargarEscenario();
                    musica();
                }
            }
        });

    }

    public void limpiarChecks(){
        for(int i = 0; i < 12; i++){
            checkBoxes[i].setText("");
            checkBoxes[i].setChecked(false);
        }
        imgv1.setImageResource(0);
        imgv2.setImageResource(0);
        imgv3.setImageResource(0);
        imgv4.setImageResource(0);
    }

    public void cargarEscenario(){
        if (stage == 1){
            cargarEscenario1();
        }
        if(stage == 2){
            cargarEscenario2();
        }
        if(stage == 3){
            cargarEscenario3();
        }
    }

    public void cargarEscenario1(){
        //Cargar colores del Escenario
        coloresTom();
        //Asignar a botones
        btn1.setText("T");
        btn2.setText("J");
        btn3.setText("O");
        btn4.setText("B");
        btn5.setText("S");
        btn6.setText("M");
        btn7.setText("R");
        btn8.setText("*");

        //Asignar Querrys
        txtv1.setText("   T   O   M");
        txtv2.setText("   T   O   O   M");
        txtv3.setText("   T   O   O   O   M");
        txtv4.setText("   T   O   O   O   O   M");

    }

    public void cargarEscenario2(){
        //Cargar colores del Escenario
        coloresGravity();
        //Asignar a botones
        btn1.setText("F");
        btn2.setText("J");
        btn3.setText("S");
        btn4.setText("P");
        btn5.setText("R");
        btn6.setText("U");
        btn7.setText("R");
        btn8.setText("*");

        //Asignar Querrys
        txtv1.setText("   S   U   S");
        txtv2.setText("   U   U   S   S");
        txtv3.setText("   S   U   S   S   S");
        txtv4.setText("   U   U   S   S   S   S");

    }

    public void cargarEscenario3(){
        //Cargar colores del Escenario
        coloresCoraje();
        //Asignar a botones
        btn1.setText("PE");
        btn2.setText("RR");
        btn3.setText("O");
        btn4.setText("RRO");
        btn5.setText("PERR");
        btn6.setText("P");
        btn7.setText("E");
        btn8.setText("*");

        //Asignar Querrys
        txtv1.setText("   P   E   R   R   O   O");
        txtv2.setText("   P   E   R   R   O   R   R   O   O");
        txtv3.setText("   P   E   R   R   O   R   R   O   R   R   O   O");
        txtv4.setText("   P   E   R   R   O   R   R   O   R   R   O   R   R   O   O");

    }

    public void Respuestas(){
        if(stage == 1){
            respuestasTom();
        }if(stage == 2){
            respuestasGravity();
        }if(stage == 3){
            respuestasCoraje();
        }
    }

    public void respuestasTom(){
        if (checkBoxes[0].getText() == "T" && checkBoxes[4].getText() == "" && checkBoxes[8].getText() == ""){
            imgv1.setImageResource(R.drawable.game_1_tom1);
        }
        if (checkBoxes[1].getText() == "O" && checkBoxes[5].getText() == "" && checkBoxes[9].getText() == ""){
            imgv2.setImageResource(R.drawable.game_1_tom2);
        }
        if (checkBoxes[2].getText() == "*" && checkBoxes[6].getText() == "" && checkBoxes[10].getText() == ""){
            imgv3.setImageResource(R.drawable.game_1_tom3);
        }
        if (checkBoxes[3].getText() == "M" && checkBoxes[7].getText() == "" && checkBoxes[11].getText() == ""){
            imgv4.setImageResource(R.drawable.game_1_tom4);
        }
        if (checkBoxes[0].getText() != "T" || checkBoxes[4].getText() != "" || checkBoxes[8].getText() != ""){
            imgv1.setImageResource(0);
        }
        if(checkBoxes[1].getText() != "O" || checkBoxes[5].getText() != "" || checkBoxes[9].getText() != ""){
            imgv2.setImageResource(0);
        }
        if(checkBoxes[2].getText() != "*" || checkBoxes[6].getText() != "" || checkBoxes[10].getText() != ""){
            imgv3.setImageResource(0);
        }
        if(checkBoxes[3].getText() != "M" || checkBoxes[7].getText() != "" || checkBoxes[11].getText() != ""){
            imgv4.setImageResource(0);
        }
    }

    public void respuestasGravity(){
        if (checkBoxes[0].getText() != "S" && checkBoxes[4].getText() != "U"){
            imgv1.setImageResource(0);
        }
        if(checkBoxes[0].getText() == "U" && checkBoxes[4].getText() == "U"){
            imgv1.setImageResource(0);
        }
        if(checkBoxes[0].getText() == "S" && checkBoxes[4].getText() == "S"){
            imgv1.setImageResource(0);
        }
        if(checkBoxes[0].getText() != "U" && checkBoxes[0].getText() != "S"){
            imgv1.setImageResource(0);
        }
        if(checkBoxes[8].getText() != ""){
            imgv1.setImageResource(0);
        }
        if (checkBoxes[1].getText() != "U" || checkBoxes[5].getText() != "" || checkBoxes[9].getText() != "" ){
            imgv2.setImageResource(0);
        }
        if (checkBoxes[2].getText() != "S" || checkBoxes[6].getText() != "" || checkBoxes[10].getText() != ""){
            imgv3.setImageResource(0);
        }
        if (checkBoxes[3].getText() != "*" || checkBoxes[7].getText() != "" || checkBoxes[11].getText() != ""){
            imgv4.setImageResource(0);
        }

        //BUENAS
        if (checkBoxes[0].getText() == "S" && checkBoxes[4].getText() == "U" && checkBoxes[8].getText() == ""){
            imgv1.setImageResource(R.drawable.game_1_gravity1);
        }
        if (checkBoxes[0].getText() == "U" && checkBoxes[4].getText() == "S" && checkBoxes[8].getText() == ""){
            imgv1.setImageResource(R.drawable.game_1_gravity1);
        }
        if (checkBoxes[1].getText() == "U" && checkBoxes[5].getText() == "" && checkBoxes[9].getText() == ""){
            imgv2.setImageResource(R.drawable.game_1_gravity2);
        }
        if (checkBoxes[2].getText() == "S" && checkBoxes[6].getText() == "" && checkBoxes[10].getText() == ""){
            imgv3.setImageResource(R.drawable.game_1_gravity3);
        }
        if (checkBoxes[3].getText() == "*" && checkBoxes[7].getText() == "" && checkBoxes[11].getText() == ""){
            imgv4.setImageResource(R.drawable.game_1_gravity4);
        }

    }

    public void respuestasCoraje(){
        if (checkBoxes[0].getText() == "PE" && checkBoxes[4].getText() == "" && checkBoxes[8].getText() == ""){
            imgv1.setImageResource(R.drawable.game_1_coraje1);
        }
        if (checkBoxes[1].getText() == "RRO" && checkBoxes[5].getText() == "" && checkBoxes[9].getText() == ""){
            imgv2.setImageResource(R.drawable.game_1_coraje2);
        }
        if (checkBoxes[2].getText() == "*" && checkBoxes[6].getText() == "" && checkBoxes[10].getText() == ""){
            imgv3.setImageResource(R.drawable.game_1_coraje3);
        }
        if (checkBoxes[3].getText() == "O" && checkBoxes[7].getText() == "" && checkBoxes[11].getText() == ""){
            imgv4.setImageResource(R.drawable.game_1_coraje4);
        }
        if (checkBoxes[0].getText() != "PE" || checkBoxes[4].getText() != "" || checkBoxes[8].getText() != ""){
            imgv1.setImageResource(0);
        }
        if(checkBoxes[1].getText() != "RRO" || checkBoxes[5].getText() != "" || checkBoxes[9].getText() != ""){
            imgv2.setImageResource(0);
        }
        if(checkBoxes[2].getText() != "*" || checkBoxes[6].getText() != "" || checkBoxes[10].getText() != ""){
            imgv3.setImageResource(0);
        }
        if(checkBoxes[3].getText() != "O" || checkBoxes[7].getText() != "" || checkBoxes[11].getText() != ""){
            imgv4.setImageResource(0);
        }
    }

    public void coloresTom(){
        //Background
        view.setBackgroundResource(R.color.TomBackground);
        //Botones
        for(int i = 0; i < 12; i++){

            buttons[i].setBackgroundResource(R.color.TomButtonsTint);
            buttons[i].setTextColor(getResources().getColor(R.color.TomButtonsText));
        }
        //TextViews
        for(int i = 0; i < 5; i++){
            textViews[i].setTextColor(getResources().getColor(R.color.TomTextView));
        }
        //CheckBoxes
        for(int i = 0; i < 4; i++){
            checkBoxes[i].setTextColor(getResources().getColor(R.color.TomTextView));

        }

    }

    public void coloresGravity(){
        //Background
        view.setBackgroundResource(R.color.GraviBackground);
        //Botones
        for(int i = 0; i < 12; i++){

            buttons[i].setBackgroundResource(R.color.GraviButtonsTint);
            buttons[i].setTextColor(getResources().getColor(R.color.GraviButtonsText));
        }
        //TextViews
        for(int i = 0; i < 5; i++){
            textViews[i].setTextColor(getResources().getColor(R.color.GraviTextView));
        }
        //CheckBoxes
        for(int i = 0; i < 4; i++){
            checkBoxes[i].setTextColor(getResources().getColor(R.color.GraviTextView));

        }
    }

    public void coloresCoraje(){
        //Background
        view.setBackgroundResource(R.color.CorajeBackground);
        //Botones
        for(int i = 0; i < 12; i++){

            buttons[i].setBackgroundResource(R.color.CorajeButtonsTint);
            buttons[i].setTextColor(getResources().getColor(R.color.CorajeButtonsText));
        }
        //TextViews
        for(int i = 0; i < 5; i++){
            textViews[i].setTextColor(getResources().getColor(R.color.CorajeTextView));
        }
        //CheckBoxes
        for(int i = 0; i < 4; i++){
            checkBoxes[i].setTextColor(getResources().getColor(R.color.CorajeTextView));

        }

    }

    public void AccionBotones(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 12; i++){
                    if (checkBoxes[i].isChecked()){
                        checkBoxes[i].setText(btn1.getText());
                        checkBoxes[i].setChecked(false);
                    }
                }
                Respuestas();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 12; i++){
                    if (checkBoxes[i].isChecked()){
                        checkBoxes[i].setText(btn2.getText());
                        checkBoxes[i].setChecked(false);
                    }
                }
                Respuestas();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 12; i++){
                    if (checkBoxes[i].isChecked()){
                        checkBoxes[i].setText(btn3.getText());
                        checkBoxes[i].setChecked(false);
                    }
                }
                Respuestas();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 12; i++){
                    if (checkBoxes[i].isChecked()){
                        checkBoxes[i].setText(btn4.getText());
                        checkBoxes[i].setChecked(false);
                    }
                }
                Respuestas();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 12; i++){
                    if (checkBoxes[i].isChecked()){
                        checkBoxes[i].setText(btn5.getText());
                        checkBoxes[i].setChecked(false);
                    }
                }
                Respuestas();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 12; i++){
                    if (checkBoxes[i].isChecked()){
                        checkBoxes[i].setText(btn6.getText());
                        checkBoxes[i].setChecked(false);
                    }
                }
                Respuestas();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 12; i++){
                    if (checkBoxes[i].isChecked()){
                        checkBoxes[i].setText(btn7.getText());
                        checkBoxes[i].setChecked(false);
                    }
                }
                Respuestas();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 12; i++){
                    if (checkBoxes[i].isChecked()){
                        checkBoxes[i].setText(btn8.getText());
                        checkBoxes[i].setChecked(false);
                    }
                }
                Respuestas();
            }
        });
        btnLimpiar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 12; i++){
                    if (checkBoxes[i].isChecked()){
                        checkBoxes[i].setText("");
                        checkBoxes[i].setChecked(false);
                    }
                }
                Respuestas();
            }
        });
        btnLimpiarT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiarChecks();
                Respuestas();
            }

        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_1__rookie);
        mediaPlayer = MediaPlayer.create(Game_1_Rookie.this, R.raw.game_1_tom);
        Play();
        view = this.getWindow().getDecorView();

        //Preparar Escena
        cargarElementos();
        cargarArreglos();
        cargarEscenario();
        accionNiveles();
        AccionBotones();



    }
    public void musica(){
        if(mediaPlayer != null){
            mediaPlayer.release();        }
        if (stage == 1){
            mediaPlayer = MediaPlayer.create(Game_1_Rookie.this, R.raw.game_1_tom);
            Play();
        }if(stage == 2) {
            mediaPlayer = MediaPlayer.create(Game_1_Rookie.this, R.raw.game_1_gravity);
            Play();
        }if(stage == 3){
            mediaPlayer = MediaPlayer.create(Game_1_Rookie.this, R.raw.game_1_coraje);
            Play();
        }
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
