package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInválidoException extends Exception{
    public LoginInválidoException() {
        super("Login Inválido");
    }

    public LoginInválidoException(String message) {
        super(message);
    }
}
