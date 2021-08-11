package jandira.senai.treinamentoJava.introducao;

public class Aula05_EstruturasCondicionais2 {

    public static void main(String [] agrs){

        int idade = 14;

        if(idade < 15){
            System.out.println("Categoria infatil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria adulto");
        }
    }
}
