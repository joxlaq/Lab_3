package com.company;

import static java.lang.Math.pow;

public class Pow implements Function {
    public final double degree;
    public final Function func;

    public Pow(double degree, Function func) {
        this.degree = degree;
        this.func = func;
    }

    @Override
    public double calculate(double x) {
        return pow(func.calculate(x), degree);
    }

    @Override
    public Function derivative() {
        return new Multiplication(new Constant(degree),
                new Multiplication(func.derivative(), new Pow(degree - 1, func)));
    }
}
