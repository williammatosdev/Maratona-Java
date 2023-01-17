package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatoriPagamento(){
        System.out.println("Eu "+this.getNome()+"recebi o salário de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
