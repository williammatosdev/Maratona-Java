package academy.maratona_java.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte,short,int,long,float e double 0
        //char 'u/0000' ''
        //boolean false
        //String null
        String[] nomes = new String[3];

        //1° Opção
        nomes[0] = "Rebeka";
        nomes[1] = "Alisson";
        nomes[2] = "Marcia";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        System.out.println("---------------------------//-----------------------------");

        //2° Opção
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
            
        }
    }
}
