import java.util.Scanner ;
public class IntegerType {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        try (Scanner sap = new Scanner(System.in)) {
            long x =sap.nextLong();
            if (x>0) {
                System.out.println(x+" is POSITIVE");
            } 
            else if(x<0) {
                System.out.println(x+" is NEGATIVE");
            }
            else {
                System.out.println(x+" is ZERO");
            }
        }
    }
}