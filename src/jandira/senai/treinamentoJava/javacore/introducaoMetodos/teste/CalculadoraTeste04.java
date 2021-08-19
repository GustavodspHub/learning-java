package jandira.senai.treinamentoJava.javacore.introducaoMetodos.teste;

import jandira.senai.treinamentoJava.javacore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste04 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro Calculadora 04");
        System.out.println("Numero1 " + a);
        System.out.println("Numero2 " + b);


    }
}
