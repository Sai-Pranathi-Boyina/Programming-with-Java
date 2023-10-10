import java.util.Scanner;
public class BodyMassIndex
{
    public static void main(String[] args) {
        try (Scanner sap = new Scanner(System.in)) {
            System.out.println("Enter weight:");
            int weight = sap.nextInt();
            System.out.println("Enter height:");
            double height = sap.nextDouble();
            double bmi = weight /(height*height);
            if (bmi<18.5) {
                System.out.println("Thinness");
            } 
            else if (18.5<=bmi && bmi<25) {
                System.out.println("Normal");
            } 
            else if (25<=bmi && bmi<30) {
                System.out.println("Overweight");
            } 
            else {
                System.out.println("Obese");
            }
        }
    }
}