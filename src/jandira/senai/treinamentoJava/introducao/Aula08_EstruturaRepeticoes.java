package jandira.senai.treinamentoJava.introducao;

public class Aula08_EstruturaRepeticoes {
    public static void main(String[] args) {
        //Imprima até o numero 25 de um determinado valor, por exemplo 50!

        int valorMax = 50;
        for(int i = 0;i <= 50; i++){
            if(i>25){
                break;
            }
            System.out.println("i: " + i);
        }
    }
}
