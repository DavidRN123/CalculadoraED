
package com.mycompany.calculadoraed;

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
    }
}
