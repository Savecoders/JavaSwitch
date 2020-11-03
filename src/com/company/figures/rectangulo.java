package com.company.figures;
import com.company.colors;

public class rectangulo {
    colors color = new colors();
    public void rectangule() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 14; j++) {
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
