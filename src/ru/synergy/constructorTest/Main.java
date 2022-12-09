package ru.synergy.constructorTest;

public class Main {

    public static void main(String[] args){
        Fraction fr = new Fraction(1,2);
        fr.add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator();

    }


}

class Fraction{
    private int numerator; //числитель
    private int denominator = 1; //знаминатель


    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public Fraction add1ToNumerator(){
    this.numerator++;
    return this;
    }

    public Fraction getObjetCurrent() {return this;}

}