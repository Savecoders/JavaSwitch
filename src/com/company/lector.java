package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lector {
    Scanner rd = new Scanner(System.in);
    colors color = new colors();
    Scanner console;
    File dotfile;
    String file = "";
    String line = "";
    String so = System.getProperty("os.name");
    int contCapital = 0, contLower = 0;

    public void setDotfile() {
        if (so.equals("Windows 10") || so.equals("Windows 8.1") || so.equals("Windows 8") || so.equals("Windows 7")) {
            System.out.println("Enter the address of your txt file: ");
            file = rd.nextLine();
            //example: C:\\Users\\Save\\Desktop\\MiOracion.txt
        } else {
            System.out.println("Enter the address of your txt file: ");
            file = rd.nextLine();
            //example: /home/save/Desktop/MiOracion.txt
        }
        dotfile = new File(file);
    }

    public void setConsole() {
        try {
            this.console = new Scanner(dotfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void messageSentence() {
        color.colorCyan();
        System.out.println("The Sentence for file: ");
        color.colorReset();
        color.colorBlue();
        while (console.hasNextLine()) {
            line = console.nextLine();
            System.out.println("\n" + line);
        }
        color.colorReset();
    }

    public void letter() {
        for (int i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i))) {
                contCapital++;
            }
            if (Character.isLowerCase(line.charAt(i))) {
                contLower++;
            }
        }
    }

    //Message:
    public void messageInfo() {
        color.colorPurple();
        System.out.println("The System operative is: " + so);
        color.colorReset();
    }

    public void messageLower() {
        color.colorYellow();
        System.out.println("The amount of lowercase letters are: " + contLower);
        color.colorReset();
    }

    public void messageUpper() {
        color.colorYellow();
        System.out.println("The number of capital letters are: " + contCapital);
        color.colorReset();
    }

    public void todo() {
        setDotfile();
        setConsole();
        messageSentence();
        letter();
        messageLower();
        messageUpper();
    }
}
/*
 * Un menu de 4 opciones de las cuales son las siguientes:
 * 1. Un programa que genera un numero random del 0-20 y que el usuario ingrese
 * un numero y si estos son iguales que le muestre que gano, y sino pues Game Over xD
 * 2. Crear Programa que me permitar crear un .txt y que guarde una oracion
 * 3. Crear un programa de la cual este lee un .txt y que luego me mestre en que SO esta
 *     tambien que me diga cuandas letras son mayusculas y minuscul
 * 4. LISTAS ENLASADAS
 * */