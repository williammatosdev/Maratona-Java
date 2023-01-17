package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class EletroDomesticos02 {
    private String marca;
    private String tipo;
    private int polegadas;

    private float potencia;

    private double valor;

    private String loja;

    public EletroDomesticos02(String marca, String tipo, int polegadas, float potencia) {

        this.marca = marca;
        this.tipo = tipo;
        this.potencia = potencia;
        this.polegadas = polegadas;
    }

    public EletroDomesticos02(String marca, String tipo, int polegadas, float potencia,String loja, double valor) {
        this(marca,tipo,polegadas,potencia);
        this.loja = loja;
        this.valor = valor;
    }

    public void somImprime() {
        System.out.println(this.marca);
        System.out.println(this.tipo);
        System.out.println(this.potencia);
        System.out.println(this.loja);
        System.out.println(this.valor);

    }

    public void televisoresImprime() {
        System.out.println(this.marca);
        System.out.println(this.tipo);
        System.out.println(this.polegadas);
        System.out.println(this.loja);
        System.out.println(this.valor);
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

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getLoja() {
        return this.loja;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}
