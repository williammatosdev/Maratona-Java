package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvĂˇlidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvĂˇlidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
