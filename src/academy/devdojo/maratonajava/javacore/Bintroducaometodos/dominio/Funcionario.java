package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    public String nome = "Rafael";
    public int idade = 28;
    public double salario = 2800.00;

    public String nome2 = "João";
    public int idade2 = 23;
    public double salario2 = 2200.00;

    public String nome3 = "Joana";
    public int idade3 = 37;
    public double salario3 = 3800.00;

    public double[] salarios;

    public void dadosFuncionario(Funcionario funcionario){

        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        System.out.println(funcionario.salario);
        System.out.println("-------------------//--------------------");
        System.out.println(funcionario.nome2);
        System.out.println(funcionario.idade2);
        System.out.println(funcionario.salario2);
        System.out.println("-------------//----------------");
        System.out.println(funcionario.nome3);
        System.out.println(funcionario.idade3);
        System.out.println(funcionario.salario3);
    }

    public void mediaSalarial(){
      double media = 0;
      for(double salario: salarios){
          media += salario;
      }
      media /= salarios.length;
        System.out.println("A média salarial é: " + media);
    }
}


