
package com.mycompany.calculadoraed;

import java.util.Scanner;

public class Calculadora {
    public static double op(char operator, double num1, double num2) {
        switch(operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            case '%': return num1 % num2;
            case '^': return Math.pow(num1, num2);
            default: return 0;
        }
    }
    public static double opRoot(String operator, double num1) {
        if(operator.equals("sqrt")) {
            return Math.pow(num1, (double) 1/2);
        } else {
            Scanner input = new Scanner(System.in);
            double num2 = input.nextDouble();
            return Math.pow(num1, (double) 1/num2);
        }
    }
    public static double opLog(String operator, double num1) {
        if(operator.equals("ln")) {
            return Math.log(num1);
        } else {
            Scanner input = new Scanner(System.in);
            double num2 = input.nextDouble();
            return (Math.log(num1) / Math.log(num2));
        }
    }
    
    public static double opInv(double num1) {
        return (double) 1/num1;
    }
    
    public static double opTri(String operator, double n) {
        n = Math.toRadians(n);
        if(operator.equals("sin")) {return Math.sin(n);}
        else if(operator.equals("cos")) {return Math.cos(n);}
        else if(operator.equals("tan")) {return Math.tan(n);}
        else if(operator.equals("arcsin")) {return Math.asin(n);}
        else if(operator.equals("arccos")) {return Math.acos(n);}
        else if(operator.equals("arctan")) {return Math.atan(n);}
        else {return 0;}
    }
    
    public static double opFact(double n) {
        double fact=n;
        int numero = (int) n;
        for(int i=numero-1; i>1; i--) {
            fact = fact * i;
        }
        return fact;
    }
    
}
