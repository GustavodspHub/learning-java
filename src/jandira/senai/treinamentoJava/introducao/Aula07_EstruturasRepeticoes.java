package jandira.senai.treinamentoJava.introducao;

import java.sql.SQLOutput;

public class Aula07_EstruturasRepeticoes {

    public static void main(String[] args) {
        int count = 1;

        while (count <= 10){
            System.out.println(count++);
        }

        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        }while(count <= 10);

        for(int i=0; i<10; i++){
            System.out.println("teste " + ++i);
        }
    }
}
