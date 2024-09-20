package controller;

import model.Calculator;

public class Control {
    Calculator calculator = new Calculator(0, 0);

    public double operationToDo(double num1, double num2, char operation){
        double result;
        switch(operation){
            case '+':
                result = calculator.addition(num1, num2);
                break;
            case '-':
                result = calculator.subtraction(num1, num2);
                break;
            case '*':
                result = calculator.multiplication(num1, num2);
                break;
            case '/':
                result = calculator.division(num1, num2);
                break;
            case '^':
                result = calculator.squared(num1);
                break;
            case 'F':
                result = calculator.fractionNumerator1(num1);
                break;
            case 'S':
                result = calculator.aquareRoot(num1);
                break;
            case '%':
                result = calculator.percentage(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("ERROR");
        }

        return result;
    }
}
