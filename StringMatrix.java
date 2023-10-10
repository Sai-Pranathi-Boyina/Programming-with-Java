import java.util.Scanner;
public class StringMatrix {
    public static void main(String[] args) {
        try (Scanner sap = new Scanner(System.in)) {
            String matrix[][] = new String[3][3];
            System.out.println("Enter the strings to be inserted into matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = sap.next();
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j]+"\t");
                }
                System.out.println();
                System.out.println();
            }
        }
    }
}