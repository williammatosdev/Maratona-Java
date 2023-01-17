package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim,talvez ou não");
        String pergunta = ler.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else if(pergunta.charAt(2) == ' '){
            System.out.println("Talvez");
        }else {
            System.out.println("NÂO");
        }
    }
}
