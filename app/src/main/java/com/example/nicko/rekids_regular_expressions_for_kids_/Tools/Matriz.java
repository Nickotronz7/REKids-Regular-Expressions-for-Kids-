package com.example.nicko.rekids_regular_expressions_for_kids_.Tools;

import java.util.Objects;

/**
 * Created by nicko on 01/09/17.
 */

public class Matriz {
    private String strMatrix = "";
    private String regExp = "";
    private static String [][] matriz = new String[3][12];

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
                        if (i < 2 && !Objects.equals(this.getDataByPoss(i + 1, j), "")) { //revisar sentecia
                            this.regExp += this.getDataByPoss(i, j) + "+";
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
