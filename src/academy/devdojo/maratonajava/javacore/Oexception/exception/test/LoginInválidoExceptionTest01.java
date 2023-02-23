package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInválidoException;

import java.util.Scanner;

public class LoginInválidoExceptionTest01 {
    public static void main(String[] args){
        try {
            logar();
        } catch (LoginInválidoException e) {
            throw new RuntimeException(e);
        }
    }
    private static void logar() throws LoginInválidoException {
        Scanner ler = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = ler.nextLine();
        System.out.println("Senha");
        String senhaDigitada = ler.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInválidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
