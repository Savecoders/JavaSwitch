package com.company.figures;
import com.company.colors;

public class Triangulo {
    colors color = new colors();
    public void triangulo() {
        for (int i = 0; i < 8; i++) {
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
}
