package com.company;

public class random {
    colors color = new colors();
    int numberPerson;
    int numberVar = (int) (Math.random() * 20);

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

    public void messageWin() {
        color.colorGreen();
        System.out.println("Los dos números son iguales, ganaste felicitaciones");
        color.colorReset();
    }

    public void messageGameOver() {
        color.colorRed();
        System.out.println("Los dos números son diferentes, lo siento, juego terminado.");
        color.colorReset();
    }

    public void messageNumber() {
        color.colorYellow();
        System.out.print("Ingresa un numero entre el 0 o el 20: ");
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
