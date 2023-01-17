package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro02 {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro02(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------//--------------");
        System.out.println("Nome "+ this.nome);
        System.out.println("Velocidade Máxima "+ this.velocidadeMaxima);
        System.out.println("Velocidade Limite "+ Carro02.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro02.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }
}
