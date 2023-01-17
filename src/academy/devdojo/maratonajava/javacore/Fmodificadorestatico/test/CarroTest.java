package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280);
        Carro c2= new Carro("Audi",290);
        Carro c3 = new Carro("mercedes",270);
        Carro c4 = new Carro("Ferrari",310);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
        c4.imprime();
    }
}
