package com.company;

public class random {
    int numberPerson;
    int numberVar = (int) (Math.random() *20);

    //The algorithm for random number is: (int) (Math.random() *20)

    public int getNumberPerson() {
        return numberPerson;
    }
    public void setNumberPerson(int number) {
        this.numberPerson = number;
    }
    public int getNumberVar() {
        return numberVar;
    }
    public static void messageWin(){
        System.out.println("The two numbers are the same, you won congratulations");
    }
    public static void messageGameOver(){
        System.out.println("The two numbers are different  sorry game over, oh no!");
    }
    public void  messageGeneral(){
        if (numberPerson == numberVar){
            messageWin();
        }else {
            messageGameOver();
        }
    }
}
