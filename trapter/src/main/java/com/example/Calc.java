package com.example;

public class Calc {
    public static double calcTrap(double a, double b, double c, double d) {
        double numerator = a+c;
        double denominator = 4*(a-c);

        double sqrTr = (a+b-c+d)*(a-b-c+d)*(a+b-c-d)*(-a+b+c+d);
        return (numerator/denominator)* Math.sqrt(sqrTr);
    }
}
