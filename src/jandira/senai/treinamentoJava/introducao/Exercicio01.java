package jandira.senai.treinamentoJava.introducao;

public class Exercicio01 {
    public static void main(String[] args) {
        //Descubra o % do seu imposto conforme o seu salário anual

        double salarioAnual = 35000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
            System.out.println("O seu imposto será de: " + valorImposto + "$");
        }else if (salarioAnual >= 34713 && salarioAnual <= 68505){
            valorImposto = salarioAnual * segundaFaixa;
            System.out.println("O seu imposto será de: " + valorImposto + "$");
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
            System.out.println("O seu imposto será de: " + valorImposto + "$");
        }
    }
}
