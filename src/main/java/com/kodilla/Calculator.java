package com.kodilla;

public class Calculator {
    int a;
    int b;

    //Constructor
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5,3);
        calculator.add();
        System.out.println(calculator.add());
        calculator.subtract();
        System.out.println(calculator.subtract());
    }
}
