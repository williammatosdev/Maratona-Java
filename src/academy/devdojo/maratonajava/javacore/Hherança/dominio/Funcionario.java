package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }
    {
        System.out.println("Dentro do bloco inicialização de Funcionario1");
    }
    {
        System.out.println("Dentro do bloco inicialização de Funcionario2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do Construtor de Funcionário");
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
