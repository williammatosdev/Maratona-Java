package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.EletroDomesticos;

public class EletroDomesticosTest {
    public static void main(String[] args) {
        EletroDomesticos eletroDomesticos = new EletroDomesticos("Samsung", "TV", 32, 0);
        eletroDomesticos.televisoresImprime();
        System.out.println("--------------//---------------------");
        EletroDomesticos eletroDomesticos2 = new EletroDomesticos("LG", "MicroSystem", 0, 5000f);
        eletroDomesticos2.somImprime();


    }
}
