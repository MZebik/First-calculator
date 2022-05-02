package com.kodilla.kalkulator;

public class Calculator {

    int A;
    int B;

    public Calculator(int A, int B){
        this.A = A;
        this.B = B;
    }

    public int addition(){
        return A + B;
    }

    public int subtraction(){
        return A - B;
    }
}
