package jandira.senai.treinamentoJava.javacore.introducaoMetodos.teste;

import jandira.senai.treinamentoJava.javacore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste03 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(100,10);
        System.out.println(result);
    }
}
