package academy.maratona_java.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //Doação se salário < 5000

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Valor abaixo para fazer doação ";
        String resultado;
        if(salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
