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
    String Message;


    public void setRoot(String r) {
        this.root = r;
    }

    public void setMessage(String message) {
        Message = message;
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
        BrosserWrite.write(Message);
        BrosserWrite.close();
    }


    public String getRoot() {
        return root;
    }

    public String getMessage() {
        return Message;
    }

    public void Message() {
        color.colorRed();
        System.out.println("Enter the path of where you want your file to be: ");
        color.colorReset();
    }

    public void addNameAndRoot() {
        Message();
        setRoot(rd.nextLine());
    }
}
