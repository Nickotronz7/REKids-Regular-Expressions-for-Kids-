package com.example.nicko.rekids_regular_expressions_for_kids_.Tools;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

/**
 * Created by nicko on 01/09/17.
 */

public class Matriz {
    private String regExp = "";
    private static String [][] matriz = new String[3][12];

    public String getHileras(String regExp, String[] alfabeto) {
        String hileras = "";
        final Pattern patron = Pattern.compile(regExp);
        for (int i = 0; i < 10; i++) {
            Matcher encaja = patron.matcher(getRandom(alfabeto));
            if (encaja.find()) {
                hileras+= encaja.group() + "\n";
            }
        }
        return hileras;
    }

    private static String getRandom(String[] array) {
        int min = 0;
        int max = 28;
        StringBuilder hilera = new StringBuilder();
        int randomNum = ThreadLocalRandom.current().nextInt(min, max);
        for (int i = 0; i < randomNum; i++) {
            int rnd = new Random().nextInt(array.length);
            hilera.append(array[rnd]);
        }
        return hilera.toString();
    }

    public String[] getAlfabeto(String regExp) {
        ArrayList<String> arrayAlfa = new ArrayList<String>();
        String [] arrayRegExp = regExp.split("");
        for (String anArrayRegExp : arrayRegExp) {
            if (!Objects.equals(anArrayRegExp, "(") && !Objects.equals(anArrayRegExp, ")") && !Objects.equals(anArrayRegExp, "+") && !Objects.equals(anArrayRegExp, "*")) {
                arrayAlfa.add(anArrayRegExp);
            }
        }
        String[] alfabeto = new String[ arrayAlfa.size() ];
        arrayAlfa.toArray( alfabeto );
        return alfabeto;
    }

    public void addData(String data, int posx, int posy) {
        this.matriz[posx][posy] = data;
    }

    private String getDataByPoss(int x, int y) {
        return matriz[x][y];
    }

    public String regExpEnssambler() {
        for (int j = 0; j < 10; j++) {
            if (!Objects.equals(this.getDataByPoss(0,j),"") && !Objects.equals(this.getDataByPoss(0,j),"*")) {
                regExp+="(";
                for (int i = 0; i < 3; i++){
                    if (!Objects.equals(this.getDataByPoss(i,j),"")) {
                        if (i < 2 && !Objects.equals(this.getDataByPoss(i + 1, j), "")) {
                            this.regExp += this.getDataByPoss(i, j) + "|";
                        } else {
                            this.regExp += this.getDataByPoss(i, j) + ")";
                        }
                    }
                }
            } else if (Objects.equals(this.getDataByPoss(0,j),"*")) {
                this.regExp+="*";
            }
        }
        return this.regExp;
    }
}
