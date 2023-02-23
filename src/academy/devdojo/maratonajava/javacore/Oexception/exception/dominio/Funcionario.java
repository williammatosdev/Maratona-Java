package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInválidoException,FileNotFoundException{
        System.out.println("Salvando Funcionário");
    }
}
