package com.company;

public class random {
    colors color = new colors();
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

    public  void messageWin() {
        color.colorGreen();
        System.out.println("The two numbers are the same, you won congratulations");
        color.colorReset();
    }

    public  void messageGameOver() {
        color.colorRed();
        System.out.println("The two numbers are different  sorry game over, oh no!");
        color.colorReset();
    }

    public void messageGeneral() {
        if (numberPerson == numberVar) {
            messageWin();
        } else {
            messageGameOver();
        }
    }
}
