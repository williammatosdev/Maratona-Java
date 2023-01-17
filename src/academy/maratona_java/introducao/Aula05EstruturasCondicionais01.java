package academy.maratona_java.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        String categoria;

        if (idade >= 18){
            System.out.println("Autorizado a comprar bebida alcólica.");
        }else {
            System.out.println("Não Autorizado a comprar bebida.");
        }

        if(idade < 15){
           categoria = "Categoria Infantil";
        } else if (idade >=15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
