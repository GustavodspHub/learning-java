package jandira.senai.treinamentoJava.javacore.introducaoMetodos.teste;

import jandira.senai.treinamentoJava.javacore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("Finalizando soma");

        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando Subtração");
    }
}
