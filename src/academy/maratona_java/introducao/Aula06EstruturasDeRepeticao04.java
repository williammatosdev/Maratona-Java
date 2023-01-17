package academy.maratona_java.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //Dado o valor de um carro,descubra em quantas vezes ele pode ser parcelado
    //Condição valorParcela >= 1000
    public static void main(String[] args) {
       String carro = "Onix";
       String modelo = "Chevrolet";
       int ano = 2020;
       double valorTotal  = 80000;

        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
           double valorParcela = valorTotal / parcela;
           if (valorParcela < 1000){
               break;
           }
           System.out.println("Carro:"+carro+" "+modelo+" Ano "+ano+" Parcela "+ parcela + " R$" + valorParcela);
        }
    }
}
