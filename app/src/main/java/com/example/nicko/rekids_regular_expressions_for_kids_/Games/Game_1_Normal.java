package com.example.nicko.rekids_regular_expressions_for_kids_.Games;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.nicko.rekids_regular_expressions_for_kids_.R;

public class Game_1_Normal extends AppCompatActivity {
    private TextView txtvQ1, txtvQ2, txtvQ3, txtvQ4, txtvPantalla;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btnLimpiar1, btnLimpiarT, btnNext, btnPrevious;
    private CheckBox check1, check2, check3, check4;
    private ImageView imgv1, imgv2, imgv3, imgv4;
    private CheckBox[] checkBoxes;
    private Button[] botones ;
    private TextView[] textViews;
    private MediaPlayer mediaPlayer;
    private int stage = 1;
    private int vidas = 5;
    private View view;

    public void cargarOpciones(){
        //Text Views
        txtvQ1 = (TextView)findViewById(R.id.txtvQ1);
        txtvQ2 = (TextView)findViewById(R.id.txtvQ2);
        txtvQ3= (TextView)findViewById(R.id.txtvQ3);
        txtvQ4 = (TextView)findViewById(R.id.txtvQ4);
        txtvPantalla = (TextView)findViewById(R.id.txtvPantalla);

        //Buttons
        btn1 = (Button)findViewById(R.id.btnOpt1);
        btn2 = (Button)findViewById(R.id.btnOpt2);
        btn3 = (Button)findViewById(R.id.btnOpt3);
        btn4 = (Button)findViewById(R.id.btnOpt4);
        btn5 = (Button)findViewById(R.id.btnOpt5);
        btn6 = (Button)findViewById(R.id.btnOpt6);
        btn7 = (Button)findViewById(R.id.btnOpt7);
        btn8 = (Button)findViewById(R.id.btnOpt8);
        btnPrevious = (Button)findViewById(R.id.btnPrev);
        btnNext = (Button)findViewById(R.id.btnNext);
        btnLimpiar1 = (Button)findViewById(R.id.btnBorr);
        btnLimpiarT = (Button)findViewById(R.id.btnBorrT);

        //CheckBox
        check1 = (CheckBox)findViewById(R.id.chbxAns1);
        check2 = (CheckBox)findViewById(R.id.chbxAns2);
        check3 = (CheckBox)findViewById(R.id.chbxAns3);
        check4 = (CheckBox)findViewById(R.id.chbxAns4);

        //image views
        imgv1 = (ImageView)findViewById(R.id.imgv1);
        imgv2 = (ImageView)findViewById(R.id.imgv2);
        imgv3 = (ImageView)findViewById(R.id.imgv3);
        imgv4 = (ImageView)findViewById(R.id.imgv4);
    }

    public void cargarArreglos(){
        checkBoxes = new CheckBox[4];
        checkBoxes[0] = check1;
        checkBoxes[1] = check2;
        checkBoxes[2] = check3;
        checkBoxes[3] = check4;

        botones = new Button[12];
        botones[0] = btn1;
        botones[1] = btn2;
        botones[2] = btn3;
        botones[3] = btn4;
        botones[4] = btn5;
        botones[5] = btn6;
        botones[6] = btn7;
        botones[7] = btn8;
        botones[8] = btnLimpiarT;
        botones[9] = btnLimpiar1;
        botones[10] = btnNext;
        botones[11] = btnPrevious;

        textViews =  new TextView[5];
        textViews[0] = txtvQ1;
        textViews[1] = txtvQ2;
        textViews[2] = txtvQ3;
        textViews[3] = txtvQ4;
        textViews[4] = txtvPantalla;
    }


    public void limpiarChecks(){
        for(int i = 0; i < 4; i++){
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
        coloresStarcraft();
        //Asignar a botones
        btn1.setText("S");
        btn2.setText("(S+T)");
        btn3.setText("(A+R)*");
        btn4.setText("A*");
        btn5.setText("(AR)*");
        btn6.setText("T");
        btn7.setText("R*");
        btn8.setText("T*");

        //Asignar Querrys
        txtvQ1.setText("   S   T   A   R");
        txtvQ2.setText("   T   T   A   R");
        txtvQ3.setText("   S   T   A   A");
        txtvQ4.setText("   S   T   A   A   A   R   R");


    }

    public void cargarEscenario2(){
        coloresDiablo();
        //Asignar a botones
        btn1.setText("K");
        btn2.setText("((K+A)A)*");
        btn3.setText("(N+M)*");
        btn4.setText("N*");
        btn5.setText("(NM)*");
        btn6.setText("Y*");
        btn7.setText("M*");
        btn8.setText("(YNM)*");

        //Asignar Querrys
        txtvQ1.setText("   K   A   Y   N   ");
        txtvQ2.setText("   A   A   Y   Y   N   M");
        txtvQ3.setText("   K   A   K   A   A   A   K   A   Y   N   N   M   M");
        txtvQ4.setText("   K   A   A   A   K   A   Y   Y   N");

    }

    public void cargarEscenario3(){
        coloresAssassins();
        //Asignar a botones
        btn1.setText("A");
        btn2.setText("(NS)*");
        btn3.setText("(NNS)*");
        btn4.setText("(SSI)*");
        btn5.setText("(ASS)*");
        btn6.setText("(SS)*");
        btn7.setText("(A+S)*");
        btn8.setText("(ASS+SSI)*");

        //Asignar Querrys
        txtvQ1.setText("   A   S   S   A   S   S   I   N   S");
        txtvQ2.setText("   A   S   S   A   S   S   A   S   S   I   N   S");
        txtvQ3.setText("   A   S   S   A   S   S   I   S   S   I   N   S   N   S");
        txtvQ4.setText("   A   S   S   A   S   S   A   S   S   I   S   S   I   N   S   N   S   N   S");
    }

    public void Respuestas(){
        if(stage == 1){
            respuestasStar();
        }if(stage == 2){
            respuestasDiablo();
        }if(stage == 3){
            respuestasAssa();
        }
    }

    public void respuestasStar(){
        if(checkBoxes[0].getText() == "(S+T)"){
            imgv1.setImageResource(R.drawable.game_1_star1);
        }if(checkBoxes[0].getText() != "" && checkBoxes[0].getText() != "(S+T)"){
            imgv1.setImageResource(0);
            vidas -= 1;
        }
        if(checkBoxes[1].getText() == "T"){
            imgv2.setImageResource(R.drawable.game_1_star2);
        }if(checkBoxes[1].getText() != "" && checkBoxes[1].getText() != "T"){
            imgv2.setImageResource(0);
            vidas -= 1;
        }
        if(checkBoxes[2].getText() == "A*"){
            imgv3.setImageResource(R.drawable.game_1_star3);
        }if(checkBoxes[2].getText() != "" && checkBoxes[2].getText() != "A*"){
            imgv3.setImageResource(0);
            vidas -= 1;
        }
        if(checkBoxes[3].getText() == "R*"){
            imgv4.setImageResource(R.drawable.game_1_star4);
        }if(checkBoxes[3].getText() != "" && checkBoxes[3].getText() != "R*"){
            imgv4.setImageResource(0);
            vidas -= 1;
        }

    }

    public void respuestasDiablo(){
        if(checkBoxes[0].getText() == "((K+A)A)*"){
            imgv1.setImageResource(R.drawable.game_1_diablo1);
        }if(checkBoxes[0].getText() != "" && checkBoxes[0].getText() != "((K+A)A)*"){
            imgv1.setImageResource(0);
            vidas -= 1;
        }
        if(checkBoxes[1].getText() == "Y*"){
            imgv2.setImageResource(R.drawable.game_1_diablo2);
        }if(checkBoxes[1].getText() != "" && checkBoxes[1].getText() != "Y*"){
            imgv2.setImageResource(0);
            vidas -= 1;
        }
        if(checkBoxes[2].getText() == "N*"){
            imgv3.setImageResource(R.drawable.game_1_diablo3);
        }if(checkBoxes[2].getText() != "" && checkBoxes[2].getText() != "N*"){
            imgv3.setImageResource(0);
            vidas -= 1;
        }
        if(checkBoxes[3].getText() == "M*"){
            imgv4.setImageResource(R.drawable.game_1_diablo4);
        }if(checkBoxes[3].getText() != "" && checkBoxes[3].getText() != "M*"){
            imgv4.setImageResource(0);
            vidas -= 1;
        }
    }

    public void respuestasAssa(){
        if(checkBoxes[0].getText() == "(ASS)*"){
            imgv1.setImageResource(R.drawable.game_1_assa1);
        }if(checkBoxes[0].getText() != "" && checkBoxes[0].getText() != "(ASS)*"){
            imgv1.setImageResource(0);
            vidas -= 1;
        }
        if(checkBoxes[1].getText() == "A"){
            imgv2.setImageResource(R.drawable.game_1_assa2);
        }if(checkBoxes[1].getText() != "" && checkBoxes[1].getText() != "A"){
            imgv2.setImageResource(0);
            vidas -= 1;
        }
        if(checkBoxes[2].getText() == "(SSI)*"){
            imgv3.setImageResource(R.drawable.game_1_assa3);
        }if(checkBoxes[2].getText() != "" && checkBoxes[2].getText() != "(SSI)*"){
            imgv3.setImageResource(0);
            vidas -= 1;
        }
        if(checkBoxes[3].getText() == "(NS)*"){
            imgv4.setImageResource(R.drawable.game_1_assa4);
        }if(checkBoxes[3].getText() != "" && checkBoxes[3].getText() != "(NS)*"){
            imgv4.setImageResource(0);
            vidas -= 1;
        }

    }

    public void AccionBotones(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 4; i++){
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
                for(int i = 0; i < 4; i++){
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
                for(int i = 0; i < 4; i++){
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
                for(int i = 0; i < 4; i++){
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
                for(int i = 0; i < 4; i++){
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
                for(int i = 0; i < 4; i++){
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
                for(int i = 0; i < 4; i++){
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
                for(int i = 0; i < 4; i++){
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
                for(int i = 0; i < 4; i++){
                    if (checkBoxes[i].isChecked()){
                        checkBoxes[i].setText("");
                        checkBoxes[i].setChecked(false);
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

    public void coloresStarcraft(){
        //Background
        view.setBackgroundResource(R.color.StarBackground);
        //Botones
        for(int i = 0; i < 12; i++){

            botones[i].setBackgroundResource(R.color.StarButtonsTint);
            botones[i].setTextColor(getResources().getColor(R.color.StarButtonsText));
        }
        //TextViews
        for(int i = 0; i < 5; i++){
           textViews[i].setTextColor(getResources().getColor(R.color.StarTextView));
        }
        //CheckBoxes
        for(int i = 0; i < 4; i++){
            checkBoxes[i].setTextColor(getResources().getColor(R.color.StarTextView));


        }


    }

    public void coloresDiablo(){
        //Background
        view.setBackgroundResource(R.color.DiabloBackground);
        //Botones
        for(int i = 0; i < 12; i++){
            botones[i].setBackgroundResource(R.color.DiabloButtonsTint);
            botones[i].setTextColor(getResources().getColor(R.color.DiabloButtonsText));
        }
        //TextViews
        for(int i = 0; i < 5; i++){
            textViews[i].setTextColor(getResources().getColor(R.color.DiabloTextView));
        }
        //CheckBoxes
        for(int i = 0; i < 4; i++){
            checkBoxes[i].setTextColor(getResources().getColor(R.color.DiabloTextView));
        }
    }

    public void coloresAssassins(){
        //Background
        view.setBackgroundResource(R.color.AssaBackground);
        //Botones
        for(int i = 0; i < 12; i++){
            botones[i].setBackgroundResource(R.color.AssaButtonsTint);
            botones[i].setTextColor(getResources().getColor(R.color.AssaButtonsText));
        }
        //TextViews
        for(int i = 0; i < 5; i++){
            textViews[i].setTextColor(getResources().getColor(R.color.AssaTextView));
        }
        //CheckBoxes
        for(int i = 0; i < 4; i++){
            checkBoxes[i].setTextColor(getResources().getColor(R.color.AssaTextView));
        }
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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_1__normal);
        view = this.getWindow().getDecorView();

        mediaPlayer = MediaPlayer.create(Game_1_Normal.this, R.raw.game_1_starcraft);
        Play();
        //Cargar Escenario
        cargarOpciones();
        cargarArreglos();
        cargarEscenario();
        accionNiveles();
        AccionBotones();


    }

    public void musica(){
        if(mediaPlayer != null){
            mediaPlayer.release();
        }
        if (stage == 1){
            mediaPlayer = MediaPlayer.create(Game_1_Normal.this, R.raw.game_1_starcraft);
            Play();
        }if(stage == 2) {
            mediaPlayer = MediaPlayer.create(Game_1_Normal.this, R.raw.game_1_diablo);
            Play();
        }if(stage == 3){
            mediaPlayer = MediaPlayer.create(Game_1_Normal.this, R.raw.game_1_assasins);
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
