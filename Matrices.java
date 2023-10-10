import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
        try (Scanner sap = new Scanner(System.in)) {
            int matrix[][] = new int[3][3];
            System.out.println("Enter the values to be inserted into Matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j]= sap.nextInt();
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            int sum=0 , row_sum = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    row_sum = row_sum + matrix[i][j];
                    sum = sum + matrix[i][j];
                }
                System.out.println("sum of numbers in row "+(i+1)+" is "+ row_sum);
                row_sum=0;
            }
            System.out.println("The sum of all elements ="+sum);
        }
    }
}