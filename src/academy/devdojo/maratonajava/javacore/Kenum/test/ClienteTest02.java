package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente02;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import  academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest02 {
    public static void main(String[] args) {
       // Cliente02 cliente01 = new Cliente02("Fernanda", TipoCliente.PESSOA_FISICA, Cliente02.TipoPagamento.DEBITO);
        //Cliente02 cliente02 = new Cliente02("Nathan",TipoCliente.PESSOA_JURIDICA, Cliente02.TipoPagamento.CREDITO);

       // System.out.println(cliente01);
        //System.out.println(cliente02);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
