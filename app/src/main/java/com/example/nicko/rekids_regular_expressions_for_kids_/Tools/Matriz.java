package com.example.nicko.rekids_regular_expressions_for_kids_.Tools;

/**
 * Created by nicko on 01/09/17.
 */

public class Matriz {
    public Matriz y;
    public String regularExp = "";
    public static String matriz[][] = new String[12][3];

    public void addData(String data, int posx, int posy) {
        matriz[posx][posy] = data;
    }

    public String getDataByPoss(int x, int y) {
        return matriz[y][x];
    }

    public String regularExp() {
        if (matriz == null) {
            return "error";
        } else {
            for (int i = 0; i <= 11; i += 1) {
                for (int w = 0; w <= 2; w += 1) {
                    if (y.matriz[i][w] != "" & y.matriz[i][w]!=null) {
                        if (w == 0) {
                            if (y.matriz[i][1] != "" & y.matriz[i][1]!=null) {
                                regularExp += ("(" + y.matriz[i][w] + "+");
                            } else {
                                regularExp += y.matriz[i][w];
                            }
                        } else if (w == 1) {
                            if (y.matriz[i][2] != "" & y.matriz[i][2]!=null) {
                                regularExp += (y.matriz[i][w] + "+");
                            } else {
                                regularExp += (y.matriz[i][w] + ")");
                            }
                        } else {
                            regularExp += (y.matriz[i][w] + ")");
                        }
                    } else {
                        break;
                    }
                }
            }
            return regularExp;
        }
    }
}
