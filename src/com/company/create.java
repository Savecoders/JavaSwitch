package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class create {
    Scanner rd = new Scanner(System.in);
    colors color = new colors();
    String root;
    File dotFiles;
    String Mensage;


    public void setRoot(String r) {
        this.root = r;
    }

    public void setMessage(String message) {
        Mensage = message;
    }


    public void file() {
        dotFiles = new File(root);
    }

    public void complement() throws IOException {
        file();
        if (!dotFiles.exists()) {
            dotFiles.createNewFile();
        }
        FileWriter Filewriter = new FileWriter(dotFiles);
        BufferedWriter BrosserWrite = new BufferedWriter(Filewriter);
        BrosserWrite.write(Mensage);
        BrosserWrite.close();
    }


    public String getRoot() {
        return root;
    }

    public String getMessage() {
        return Mensage;
    }

    public void Message() {
        color.colorRed();
        System.out.println("Ingresa la ubicacion donde quieres que este tu archivo y su nombre");
        color.colorReset();
    }
    public void addSentence(){
        color.colorPurple();
        System.out.println("Ingrese la oración que quiera que guarde su archivo: ");
        color.colorReset();
    }
    public void addNameAndRoot() {
        Message();
        setRoot(rd.nextLine());
    }
}
