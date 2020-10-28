package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner rd = new Scanner(System.in);
        int option;
        do {
            System.out.println("***********************************");
            System.out.println("* 1. The program random victory   *");
            System.out.println("* 2. The program Create .txt      *");
            System.out.println("* 3. The program Lector .txt      *");
            System.out.println("* 4. The program config arrays    *");
            System.out.println("***********************************");
            System.out.print("* Enter Selection: ");
            option = rd.nextInt();
        } while (option > 4);
        switch (option) {
            case 1: {
                random num = new random();
                num.messageNumber();
                num.setNumberPerson(rd.nextInt());
                System.out.println("The number random is: " + num.getNumberVar());
                num.messageGeneral();
                break;
            }
            case 2: {
                create file = new create();
                file.addNameAndRoot();
                file.setMessage("Hello world!");
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
                System.out.println(f.getSize());
                f.message();
                f.setArray();
                System.out.println("Normal Arrays");
                System.out.println(Arrays.toString(f.getArray()));
                System.out.println("As a minor a mayor");
                f.Minus();
                System.out.println("from highest to lowest");
                f.Mayor();
                System.out.println(Arrays.toString(f.getArray()));
            }
            default: {

            }
        }
    }

}