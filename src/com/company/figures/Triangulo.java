package com.company.figures;
import com.company.colors;

import java.util.Scanner;

public class Triangulo {
    Scanner rd = new Scanner(System.in);
    colors color = new colors();
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public void triangulo() {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < i; j++) {
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
}
