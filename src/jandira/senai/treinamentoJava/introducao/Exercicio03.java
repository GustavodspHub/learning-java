package jandira.senai.treinamentoJava.introducao;

public class Exercicio03 {
    //Imprima todos os numeros pares do 0 até 1000000

    public static void main(String[] args) {
        int i;

        for(i=0; i <= 1000000; i++){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }
}
