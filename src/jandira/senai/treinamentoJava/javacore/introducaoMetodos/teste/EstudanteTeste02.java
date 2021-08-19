package jandira.senai.treinamentoJava.javacore.introducaoMetodos.teste;

import jandira.senai.treinamentoJava.javacore.introducaoMetodos.dominio.Estudante;

public class EstudanteTeste02 {

    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Gustavo";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Millena";
        estudante2.idade = 17;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
