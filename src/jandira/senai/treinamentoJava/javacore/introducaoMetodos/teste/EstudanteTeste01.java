package jandira.senai.treinamentoJava.javacore.introducaoMetodos.teste;

import jandira.senai.treinamentoJava.javacore.introducaoMetodos.dominio.Estudante;
import jandira.senai.treinamentoJava.javacore.introducaoMetodos.dominio.ImprimeEstudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante1.nome = "Gustavo";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Millena";
        estudante2.idade = 17;
        estudante2.sexo = 'F';

        imprimeEstudante.imprime(estudante1);
        imprimeEstudante.imprime(estudante2);


    }
}
