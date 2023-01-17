package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;


import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro02;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro02.setVelocidadeLimite(180);

        Carro02 c1 = new Carro02("BMW",280);
        Carro02 c2= new Carro02("Audi",290);
        Carro02 c3 = new Carro02("mercedes",270);
        Carro02 c4 = new Carro02("Ferrari",310);

        Carro02.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
        c4.imprime();
    }
}