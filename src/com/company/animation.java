package com.company;
import com.company.figures.*;

import java.util.Scanner;

public class animation {
    Scanner rd = new Scanner(System.in);
    colors color = new colors();
    Cuadrado cuadro = new Cuadrado();
    rectangulo rectangule = new rectangulo();
    Triangulo triangulo = new Triangulo();
    int option;
    public void seleccionarFIgura(){
        System.out.println("***********************************************");
        System.out.println("* 1. Imprimir un cuadrado                     *");
        System.out.println("* 2. Imprimir rectangulo                      *");
        System.out.println("* 3. Imprimir un triangulo                    *");
        System.out.println("***********************************************");
        System.out.print("* Elija la opcion que deseas:   ");
        option = rd.nextInt();
        switch (option){
            case 1:{
                cuadro.cuadrado();
            }
            case 2:{
                rectangule.rectangule();
            }
            case 3:{
                triangulo.triangulo();
            }
        }
    }
}
