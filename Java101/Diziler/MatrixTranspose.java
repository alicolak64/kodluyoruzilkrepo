import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of rows in the matrix ? ");
        int length = scan.nextInt();
        System.out.print("Number of columns in the matrix ? ");
        int weight = scan.nextInt();
        System.out.println("Enter the elements of the matrix in order.");

        int[][] matrix = new int[length][weight];

        for(int i =0  ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[i].length;j++)
                matrix[i][j] = scan.nextInt();
        }
        System.out.println("==================================");
        System.out.println("Matrix : ");
        System.out.println();

        for(int i =0  ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[i].length;j++)
                System.out.print(matrix[i][j]+"   ");
            System.out.println();
        }
        System.out.println("------------");
        System.out.println("Transpose of the Matrix : ");
        System.out.println();
        //int[][] matrix_transpoze = new int[weight][length];
        for(int j = 0 ; j < matrix[0].length;j++){
            for(int i =0  ; i < matrix.length;i++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
        scan.close();
    }
}
