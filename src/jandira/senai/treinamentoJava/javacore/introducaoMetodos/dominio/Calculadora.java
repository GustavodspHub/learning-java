package jandira.senai.treinamentoJava.javacore.introducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(10 - 10);
    }

    public void multipliqueDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 100;
        num2 = 100;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Numero1 " + num1);
        System.out.println("Numero2 " + num2);
    }

}
