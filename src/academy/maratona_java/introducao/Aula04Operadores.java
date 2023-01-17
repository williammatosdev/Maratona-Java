package academy.maratona_java.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        //%
        int resto = 20 % 2;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);
        System.out.println(isDezDiferenteVinte);

        //&& (AND) || (OR)
        int idade = 34;
        float salario = 2500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 37 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 28 && salario >= 2212;

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= /= %=
        double bonus = 6000;
        bonus = bonus + 1000;
        bonus += 2000;
        bonus -= 5000;
        bonus = bonus * 2;
        bonus *= 3;
        bonus = bonus / 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //imcremento ++ --
        int contador = 0;
        contador += 1; //contador = contador + 1
        contador ++;
        contador --;
        System.out.println(contador);


    }
}
