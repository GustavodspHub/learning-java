package jandira.senai.treinamentoJava.javacore.introducaoClasses.test;

import jandira.senai.treinamentoJava.javacore.introducaoClasses.dominio.Estudante;

public class EstudanteTeste {

    public static void main(String[] args) {

        Estudante gustavo = new Estudante();

        gustavo.nome = "Gustavo dos Santos Pereira";
        gustavo.sexo = 'M';
        gustavo.idade = 18;

        System.out.println(gustavo.nome);
        System.out.println(gustavo.idade);
        System.out.println(gustavo.sexo);
    }

}
