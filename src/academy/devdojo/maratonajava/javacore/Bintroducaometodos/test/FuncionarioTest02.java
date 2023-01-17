package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario02;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario02 funcionario = new Funcionario02();
        funcionario.setNome("Roberto");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200,987.32,2000});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());
    }
}
