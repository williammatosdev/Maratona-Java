package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Professor Raimundo");
        Professor professor02 = new Professor("Professor Chico Anísio");
        Professor[]professores = {professor01,professor02};
        Escola escola = new Escola("Escolinha do Barulho",professores);

        escola.imprime();
    }
}
