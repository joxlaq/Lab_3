package com.company;


import java.util.Date;

public class Main {

    public static void main(String[] args) {
        double x=0.335, y=0.025;
        Function F1 = new Sum(new Sum(new Sum(new Sum(new Constant(1), new Linear(1)),
                new Division(new Pow(2, new Linear(1)), new Constant(2))),
                new Division(new Pow(3, new Linear(1)), new Constant(6))),
                new Division(new Pow(4, new Linear(1)), new Constant(24)));
        System.out.println("F1="+F1.calculate(x));
        System.out.println("F1="+F1.derivative().calculate(x));
        Function F2 = new Multiplication(new Linear(1),
                new Sum(new Sin(new Pow(3, new Linear(1))),
                        new Pow(2, new Cos(new Constant(y)))));
        System.out.println("F2="+F2.calculate(x));
        System.out.println("F2="+F2.derivative().calculate(x));
    }
}
