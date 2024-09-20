package model;

public class Calculator {
    private double num1, num2;

    public Calculator(double num1, double num2){
        this.num1 = num2;
        this.num2 = num2;
    }

    public double addition(double num1, double num2){
        return num1 + num2;
    }

    public double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public double division(double num1, double num2){
        return num1 / num2;
    }

    public double squared(double num1){
        return num1 * num1;
    }

    public double fractionNumerator1(double num1){
        return 1/num1;
    }

    public double aquareRoot(double num1){
        return Math.sqrt(num1);
    }

    public double percentage(double num1, double num2){
        return (num1 * num2) / 100;
    }


}
