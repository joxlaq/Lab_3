package com.company;

public class Difference implements Function {
    private final Function a, b;

    public Difference(Function a, Function b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return a.calculate(x) - b.calculate(x);
    }

    @Override
    public Function derivative() {
        return new Difference(a.derivative(), b.derivative());
    }
}
