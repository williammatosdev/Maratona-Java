package academy.maratona_java.introducao;
/*
Prática

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mesnsagem:

Eu <nome>,morando no endereço <endereço> confirmo que recebi o salário <salário>,na data <data>

 */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        String nome = "william";
        String endereco = "Rua: João Gomes Pereira";
        double salario = 2500.00;
        String dataRecebimentoSalario = "20/12/2022";

        System.out.println("Eu " + nome + ",morando no endereço " + endereco + " confirmo que recebi o salário R$" + salario + ",na data " + dataRecebimentoSalario + "." );
    }
}
