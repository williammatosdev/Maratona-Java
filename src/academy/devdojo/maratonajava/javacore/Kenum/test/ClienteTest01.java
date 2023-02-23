package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria Lucia","Pessoa Física");
        Cliente cliente2 = new Cliente("Maria Lucia","Pessoa Juridica");
        Cliente cliente3 = new Cliente("Maria Lucia","pessoa física");
        Cliente cliente4 = new Cliente("Maria Lucia","pessoa juridica");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
