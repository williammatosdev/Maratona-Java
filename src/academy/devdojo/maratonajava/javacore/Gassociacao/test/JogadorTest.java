package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Maradona");
        Jogador jogador3 = new Jogador("Sócrates");
        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        for(Jogador jogador : jogadores){
             jogador.imprime();
        }
    }
}
