package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class EletroDomesticos {
    private String marca;
    private String tipo;
    private int polegadas;

    private float potencia;

    public EletroDomesticos(String marca, String tipo, int polegadas, float potencia) {
        this.marca = marca;
        this.tipo = tipo;
        this.potencia = potencia;
        this.polegadas = polegadas;
    }

    public EletroDomesticos(){

    }

    public void somImprime() {
        System.out.println(this.marca);
        System.out.println(this.tipo);
        System.out.println(this.potencia);
    }

    public void televisoresImprime() {
        System.out.println(this.marca);
        System.out.println(this.tipo);
        System.out.println(this.polegadas);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {

        return this.marca;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setPolegadas(int polegadas) {

        this.polegadas = polegadas;
    }

    public int getPolegadas() {

        return this.polegadas;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getPotencia() {
        return this.potencia;
    }
}

