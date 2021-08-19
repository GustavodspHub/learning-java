package jandira.senai.treinamentoJava.javacore.introducaoMetodos.dominio;

public class ImprimeEstudante {

    public void imprime (Estudante estudante){
        System.out.println("-------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
