package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Marcelinho Carioca");
        Jogador jogador2 = new Jogador("Viola");
        Time time = new Time("Corinthians");
        Jogador[] jogadores = {jogador,jogador2};
        jogador.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("---Jogador---");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("---Time---");
        time.imprime();
    }
}
