package jandira.senai.treinamentoJava.introducao;

public class Aula13_ArraysMultidimensionais {

    public static void main(String[] args) {

        String [] [] meses = new String[3][3];

        meses[0][0] = "teste";
        meses[0][1] = "teste1";
        meses[0][2] = "teste2";

        meses[1][0] = "teste3";
        meses[1][1] = "teste4";
        meses[1][2] = "teste5";

        meses[2][0] = "teste6";
        meses[2][1] = "teste7";
        meses[2][2] = "teste8";

       for (int i =0; i < meses.length; i++){
           for (int j = 0; j< meses[0].length; j++){
               System.out.println(meses[i][j]);
           }
       }

        System.out.println("------------------------");

        for (String[] arrayBase:meses) {
            for (String testes : arrayBase) {
                System.out.println(testes);
            }
        }
    }
}
