package com.example.nicko.rekids_regular_expressions_for_kids_.Tools;

import java.util.Objects;

/**
 * Created by nicko on 01/09/17.
 */

public class Matriz {
    private String strMatrix = "";
    private String regExp = "";
    private static String [][] matriz = new String[3][12];

        //this.getMatrix();
    public void addData(String data, int posx, int posy) {
        this.matriz[posx][posy] = data;
    }

    private String getDataByPoss(int x, int y) {
        return matriz[x][y];
    }

    public void getMatrix() {
        String strMatrix = "[";
        for (int i = 0; i < 3; i++) {
            strMatrix += "[";
            for (int j = 0; j < 11; j++) {
                if (Objects.equals(this.getDataByPoss(i,j),"")){
                    strMatrix += "_,";
                } else {
                    strMatrix += this.getDataByPoss(i,j);
                }
            }
            strMatrix += "]\n";
        }
        strMatrix += "]";
        this.strMatrix = strMatrix;
    }

    public String regExpEnssambler() {
        for (int j = 0; j < 10; j++) {
            if (!Objects.equals(this.getDataByPoss(0,j),"")) {
                regExp+="(";
                for (int i = 0; i < 3; i++){
                    if (!Objects.equals(this.getDataByPoss(i,j),"")) {
                        if (i < 2){ //revisar sentecia
                            this.regExp+=this.getDataByPoss(i,j) + "("+i+")";
                        } else {
                            this.regExp+=this.getDataByPoss(i,j)+")";
                        }
                    } else {
                        //regExp+="(";
                    }
                }
            } else {
                break;
            }
        }
        return this.regExp;
    }

    public String getStrMatrix(){
        return this.strMatrix;
    }
}
