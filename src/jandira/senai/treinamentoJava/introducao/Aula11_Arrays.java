package jandira.senai.treinamentoJava.introducao;

public class Aula11_Arrays {
    public static void main(String[] args) {
        // byte, short, int, long, float, double - 0
        // char - '\u0000' ' '
        //Boolean - false
        //String - null

        String [] nomes = new String[10];
        nomes[0] = "Gustavo";
        nomes[1] = "Millena";
        nomes [2] = "Gabriel";

        for(int i = 0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }

        nomes = new String[11];
    }
}
