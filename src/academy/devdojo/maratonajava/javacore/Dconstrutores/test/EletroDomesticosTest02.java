package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.EletroDomesticos02;

public class EletroDomesticosTest02 {
    public static void main(String[] args) {
        EletroDomesticos02 eletroDomesticos = new EletroDomesticos02("Samsung", "TV Smart", 32, 0,"Casas Bahia",1400.00d);
        eletroDomesticos.televisoresImprime();
        System.out.println("--------------//---------------------");
        EletroDomesticos02 eletroDomesticos2 = new EletroDomesticos02("LG", "MicroSystem", 0, 5000f,"Magazine Luiza",2800.00d);
        eletroDomesticos2.somImprime();


    }
}
