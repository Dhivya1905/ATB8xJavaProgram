package Oct.ex_25102024_Array;

public class Lab056_Program {

    public static void main (String[] args) {


        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println(matrix1[i][j]);
            }

            System.out.println();
        }

    }
}
