package jandira.senai.treinamentoJava.javacore.introducaoClasses.test;

import jandira.senai.treinamentoJava.javacore.introducaoClasses.dominio.Carros;

public class CarrosTeste {

    public static void main(String[] args) {

        Carros carro1 = new Carros();
        Carros carro2 = new Carros();

        carro1.nome = "Porsche";
        carro1.modelo = "Taycan";
        carro1.ano = 2021;

        carro2.nome = "Audi";
        carro2.modelo = "A7";
        carro2.ano = 2021;

        System.out.println("O carro numero 1 é o: " + carro1.nome + "." + " O seu modelo é " + carro1.modelo + " do ano " + carro1.ano + ".");
        System.out.println("O carro numero 2 é o: " + carro2.nome + "." + " O seu modelo é " + carro2.modelo + " do ano " + carro2.ano + ".");
    }
}
