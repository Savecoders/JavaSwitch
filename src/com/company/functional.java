package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class functional {
    colors color = new colors();
    Scanner rd = new Scanner(System.in);
    int size;
    int[] array ;

    public void setSize(int n) {
            this.size = n;
    }

    public int getSize() {
        return size;
    }

    public void setArraySize(){
        try {
            this.array = new int[size];
        }catch (Exception err){
            System.out.println(err);
        }
    }

    public void setArray() {
        for (int i = 0; i < size; i++) {
            array[i] = rd.nextInt();
        }
    }

    public int[] getArray() {
        return array;
    }

    public void Minus() {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size - j - 1/*4 3 2 1*/; i++) {
                if (array[i] > array[i + 1]) {//4 3 12 3 13 | 3 4 3 12 13 | 3 3 4 12 13 |
                    int eql = array[i + 1];//=3
                    array[i + 1] = array[i];//=4
                    array[i] = eql;//=3
                }
            }
        }
    }

    public void Mayor() {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size - j - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int eql = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = eql;
                }
            }
        }
    }

    //Message.
    public void message() {
        color.colorBlue();
        System.out.println("The numbers for  arrays: ");
        color.colorReset();
    }

    public void messageDouble() {
        color.colorYellow();
        System.out.println("The numero es decimal");
        color.colorReset();
    }

    public void messageMinus() {
        color.colorCyan();
        System.out.println("El arreglo esta de forma Ascendete");
        color.colorReset();
    }
    public void messageMayus() {
        color.colorCyan();
        System.out.println("El arreglo esta de forma decendente");
        color.colorReset();
    }
    public void messageSize() {
        color.colorPurple();
        System.out.print("Ingrese el tamaño del arreglo: ");
        color.colorReset();
    }
    public void init(){
        System.out.println("Arreglo de forma normal");
        System.out.println(Arrays.toString(getArray()));
        messageMinus();
        Minus();
        System.out.println(Arrays.toString(getArray()));
        messageMayus();
        Mayor();
        System.out.println(Arrays.toString(getArray()));

    }
}
