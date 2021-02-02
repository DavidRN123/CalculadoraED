
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
    
}
