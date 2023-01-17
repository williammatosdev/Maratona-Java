package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class EletroDomesticos {
    private String marca;
    private String tipo;
    private int polegadas;

    private float potencia;

    public void basico(String marca,String tipo){
        this.marca = marca;
        this.tipo = tipo;
    }

    public void som(String marca, String tipo,float potencia) {
        this.basico(marca,tipo);
        this.potencia = potencia;
    }

    public void televisores(String marca,String tipo,int polegadas){
        this.basico(marca,tipo);
        this.polegadas = polegadas;
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
