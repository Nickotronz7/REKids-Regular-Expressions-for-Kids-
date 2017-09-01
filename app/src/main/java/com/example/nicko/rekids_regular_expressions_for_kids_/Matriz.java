package com.example.nicko.rekids_regular_expressions_for_kids_;

/**
 * Created by nicko on 01/09/17.
 */

public class Matriz {
    public Matriz y;
    public String regularExp;
    public String matriz[][]= new String[3][12];

    public void addData(String data, int posx, int posy){
        matriz[posy][posx] = data;
    }

    public String getDataByPoss(int x, int y){
        return matriz[y][x];
    }

    public String regularExp(){
        for(int i=0; i<=11;i++){
            for(int w=0; w<=2;w++){
                if(y.matriz[w][i]!=""){
                    if(w==0){
                        if(y.matriz[w+1][i]!="") {
                            regularExp += "(" + y.matriz[w][i] + "+";
                        }else{
                            break;
                        }
                    }else if(w==1){
                        if(y.matriz[w+1][i]!=""){
                            regularExp += y.matriz[w][i] + "+";
                        }else{
                            regularExp += y.matriz[w][i] + ")";
                        }
                    }else{
                        regularExp += y.matriz[w][i] + ")";
                        }
                    }else{
                        break;
                }
            }
        }return regularExp;
    }
}

