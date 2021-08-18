package jandira.senai.treinamentoJava.javacore.introducaoClasses.test;

import jandira.senai.treinamentoJava.javacore.introducaoClasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.idade = 30;
        professor.nome = "Leandro";
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + "\nidade: " + professor.idade + "\nsexo: " + professor.sexo);
    }

}
