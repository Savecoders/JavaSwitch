package com.company.figures;
import com.company.colors;

import java.util.Scanner;

public class rectangulo {
    Scanner rd = new Scanner(System.in);
    colors color = new colors();
    int x,y;

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void rectangule() {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if(i%2==0){
                    if (j % 2 == 0) {
                        color.colorYellow();
                        System.out.print("* ");
                        color.colorReset();
                    } else {
                        System.out.print("* ");
                    }
                }else {
                    if (j % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        color.colorYellow();
                        System.out.print("* ");
                        color.colorReset();
                    }
                }

            }
            System.out.println("");
        }
    }
    public void messageY(){
        color.colorCyan();
        System.out.print("Ingrese el tamaño de la altura: ");
        setY(rd.nextInt());
        color.colorReset();
    }
    public void messageX(){
        color.colorBlue();
        System.out.print("Ingrese el tamaño de la anchura: ");
        setX(rd.nextInt());
        color.colorReset();
    }
    public void callMessage(){
        messageY();
        messageX();
    }
}
