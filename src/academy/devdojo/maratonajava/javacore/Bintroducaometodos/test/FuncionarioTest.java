package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.salarios = new double[]{2800.00,2200.00,3800.00};
        funcionario.dadosFuncionario(funcionario);
        System.out.println("-----------------//-------------------");
        funcionario.mediaSalarial();
    }
}
