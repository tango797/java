import complexNumbers.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] matrix = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println(matrix[1].length);
        int[][] matrix1 = new int[3][2];
        System.out.println(matrix1[1]);

        String words = new String("Java Programing");

        String word[] = words.split("a");
        for (String lu : word) {
            System.out.println(lu);
        }
        System.out.println(word.length);
        int m1[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < m1.length; i++) {
            sum += m1[i][(m1.length - i - 1)];
        }
        System.out.println(sum);
    }

}