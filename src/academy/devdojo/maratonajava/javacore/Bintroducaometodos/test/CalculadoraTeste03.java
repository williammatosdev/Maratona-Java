package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alterarDoisNumeros(num1,num2);
        System.out.println("Dentro do CalculadoraTeste03");
        System.out.println(num1);
        System.out.println(num2);
    }
}
