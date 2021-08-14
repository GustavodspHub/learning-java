package jandira.senai.treinamentoJava.introducao;

public class Exercicio04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valor parcela >= 1000

    public static void main(String[] args) {

        double valorTotal = 30000;
        for(int parcela = 1; parcela <= valorTotal ; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }else{
                break;
            }
        }

    }


}
