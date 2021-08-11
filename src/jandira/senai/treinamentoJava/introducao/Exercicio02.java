package jandira.senai.treinamentoJava.introducao;

public class Exercicio02 {
    public static void main(String[] args) {

        byte dia = 1;

        switch(dia){
            case 1:
                System.out.println("Domingo - Final de semana");
                break;
            case 2:
                System.out.println("Segunda-Feira - dia útil");
                break;
            case 3:
                System.out.println("Terça-Feira - dia útil");
                break;
            case 4:
                System.out.println("Quarta-Feira - dia útil");
                break;
            case 5:
                System.out.println("Quinta-Feira - dia útil");
                break;
            case 6:
                System.out.println("Sexta-Feira - dia útil");
                break;
            case 7:
                System.out.println("Sabado - Final de semana");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
