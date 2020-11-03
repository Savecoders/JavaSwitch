package com.company;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner rd = new Scanner(System.in);
        int option;
        do {
            System.out.println("***********************************************");
            System.out.println("* 1. El programa de victoria aleatoria        *");
            System.out.println("* 2. El programa de crear un .txt             *");
            System.out.println("* 3. El programa de leer un .txt              *");
            System.out.println("* 4. EL programa de de menor a mayor arreglo  *");
            System.out.println("***********************************************");
            System.out.print("* Entra la opcion que quieras:  ");
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
                file.setMessage("Esta es la oración");
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
                System.out.println("Arreglo de forma normal");
                System.out.println(Arrays.toString(f.getArray()));
                System.out.println("Arreglo de menor a mayor");
                f.Minus();
                System.out.println(Arrays.toString(f.getArray()));
                System.out.println("Arreglo de mayor a menor");
                f.Mayor();
                System.out.println(Arrays.toString(f.getArray()));
            }
            default: {

            }
        }
    }

}