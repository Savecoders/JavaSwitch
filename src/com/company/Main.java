package com.company;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner rd = new Scanner(System.in);
        int option;
        do {
            System.out.println("**************************************************");
            System.out.println("* 1. Programa numero random y Victoria Aleatoria *");
            System.out.println("* 2. Programa Crear un archivo .txt              *");
            System.out.println("* 3. Programa Leer un Archivo .txt               *");
            System.out.println("* 4. Programa Ingrese y ordene Arreglos          *");
            System.out.println("**************************************************");
            System.out.print("* ELiga una opcion de la lista:  ");
            option = rd.nextInt();
        } while (option > 4);
        switch (option) {
            case 1: {
                random num = new random();
                num.messageNumber();
                num.setNumberPerson(rd.nextInt());
                System.out.println("El numero aleatorio era: " + num.getNumberVar());
                num.messageGeneral();
                break;
            }
            case 2: {
                create file = new create();
                file.addNameAndRoot();
                file.addSentence();
                file.setMessage(rd.nextLine());
                file.complement();
                System.out.println(file.getRoot());
                break;
            }
            case 3: {
                lector txt = new lector();
                txt.messageInfo();
                txt.todo();
                break;
            }
            case 4: {
                functional f = new functional();
                f.messageSize();
                f.setSize(rd.nextInt());
                f.setArraySize();
                f.message();
                f.setArray();
                f.init();
                break;
            }
            default: {
                System.out.println();
                animation animacion = new animation();
                animacion.seleccionarFIgura();
            }
        }
    }

}