package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.EletroDomesticos;

public class EletroDomesticosTest01 {
    public static void main(String[] args) {
        EletroDomesticos eletroDomesticos = new EletroDomesticos();
        eletroDomesticos.setMarca("Samsung");
        eletroDomesticos.setTipo("TV");
        eletroDomesticos.setPolegadas(32);
        eletroDomesticos.televisoresImprime();
        System.out.println("--------------//---------------------");
        eletroDomesticos.som("LG", "MicroSystem", 5.000f);
        eletroDomesticos.somImprime();



    }
}
