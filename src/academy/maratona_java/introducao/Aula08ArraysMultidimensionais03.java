package academy.maratona_java.introducao;

public class Aula08ArraysMultidimensionais03 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[][] arrayInt= new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        int[][]arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for(int[] arrayBase: arrayInt){
            System.out.println("\n----");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }

    }
}

