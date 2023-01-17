package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
    endereco.setRua("Rua 3");
    endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("12345678900");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Gilberto Rodriguez");
        funcionario.setCpf("12345678900");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(15000);
        System.out.println("----------//-----------");
        funcionario.imprime();
    }
}
