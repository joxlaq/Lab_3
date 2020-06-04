package com.company;

import static java.lang.Math.*;
import java.util.Date;
import java.util.*;
public class Firsttry {

    private double calcy(double x) {

        return 1+x+pow(x,2)/2+pow(x,3)/6+pow(x,4)/24;

    }
    private double calcz(double x, double y) {
        return x*(Math.sin(Math.pow(x,3)) + Math.pow(Math.cos(y),2));
    }
    private void print(double x, double y) {
        System.out.println("s="+x);
        System.out.println("f="+y);
    }
    public void run() {
        System.out.println("Введите числа: ");
        Scanner ss = new Scanner(System.in);
        double x = ss.nextDouble();
        double a = ss.nextDouble();

        double s = calcy(x);
        double f = calcz(x,a);
        print(s,f);
    }

}

