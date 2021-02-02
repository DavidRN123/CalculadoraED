package com.mycompany.calculadoraed;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        boolean quit=false;
        double numero=0;
        String dato = "";
        double numero2=0;
        
        while (!quit) {
            System.out.println("["+numero+"]");
            dato =  input.nextLine();
            if (esNumero(dato)){
                if(negativo(dato)) {numero = -(convertirANumero(dato));}
                else {numero = convertirANumero(dato);}
            } else {
                if(dato.equals("+") || dato.equals("-") || dato.equals("*") || dato.equals("/") || dato.equals("%") || dato.equals("^")) {
                    numero2 = input.nextDouble();
                    numero = Calculadora.op(dato.charAt(0), numero, numero2);
                }
                else if(dato.equals("sqrt") || dato.equals("rt")) {
                    numero = Calculadora.opRoot(dato, numero);
                }
                else if(dato.equals("ln") || dato.equals("log")) {
                    numero = Calculadora.opLog(dato, numero);
                }
                else if(dato.equals("inv")) {
                    numero = Calculadora.opInv(numero);
                }
                else if(dato.equals("sin") || dato.equals("cos") || dato.equals("tan") || dato.equals("arcsin") || dato.equals("arccos") || dato.equals("arctan")) {
                    numero = Calculadora.opTri(dato, numero);
                }
                else if(dato.equals("fact")) {
                    numero = Calculadora.opFact(numero);
                }
                else if(dato.equals("x2")) {
                    Scanner incognita = new Scanner(System.in);
                    int in1 = incognita.nextInt();
                    int in2 = incognita.nextInt();
                    int in3 = incognita.nextInt();
                    Calculadora.opX2(in1,in2,in3);
                    numero=0;
                }
                else if(dato.equals("q")) {
                    quit=true;
                }
            }
        }
        
    }
    
    public static double convertirANumero(String dato) {
        
        double numero=0;
        boolean decimales=false;
        int punto=0;
        
        for(int i=0; i<dato.length(); i++) {
            if(dato.charAt(i)=='.') {
                decimales = true;
                punto = i;
            }
        }
            if(decimales) {
                double cont=1;
                for(int j=punto-1; j>=0; j--) {
                    numero = numero + cont*charNumero(dato.charAt(j));
                    cont = cont*10;
                }
                cont=0.1;
                for(int k=punto+1; k<dato.length(); k++) {
                    numero = numero + cont*charNumero(dato.charAt(k));
                    cont = cont/10;
                }
            } else {
                int cont2=1;
                for(int h=dato.length()-1; h>=0; h--) {
                    numero = numero + cont2*charNumero(dato.charAt(h));
                    cont2=cont2*10;
                }
            }
            return numero;
        }
    
    public static int charNumero(char c) {
        switch(c) {
            case '1': return 1;
            case '2': return 2; 
            case '3': return 3; 
            case '4': return 4; 
            case '5': return 5; 
            case '6': return 6; 
            case '7': return 7; 
            case '8': return 8; 
            case '9': return 9; 
            default: return 0;
            
        }
    }
    
    public static boolean esNumero(String dato) {
        
        int cont=0;
        int cont2=0;
        boolean puntos=false;
        boolean character=false;
        String datotemp="";
        
        if(dato.charAt(0)=='-') {
            for(int j=1; j<dato.length(); j++) {
                datotemp=datotemp+dato.charAt(j);
            }
        } else {
            datotemp = dato;
        }
        for(int i=0; i<datotemp.length(); i++) {
            if(datotemp.charAt(i)=='.') {
                cont++;
            } else if(datotemp.charAt(i)<'0' || datotemp.charAt(i)>'9') {
                cont2++;
            }
        }
        if(cont>1) {puntos=true;}
        if(cont2>0) {character=true;}
        
        if(puntos) {return false;}
        else if(character) {return false;}
        else {return true;}
        
    }
    
    public static boolean negativo(String dato) {
        if(dato.charAt(0)=='-') {return true;}
        else {return false;}
    }
    
}