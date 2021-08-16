package jandira.senai.treinamentoJava.introducao;

public class Aula12_Arrays {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1};

        for(int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        for (int num: numeros3) {
            System.out.println(num);
        }
    }
}
