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
                cuadro.callMessage();
                cuadro.cuadrado();
                break;
            }
            case 2:{
                rectangule.callMessage();
                rectangule.rectangule();
                break;
            }
            case 3:{
                triangulo.messageY();
                triangulo.triangulo();
                break;
            }
        }
    }
}
