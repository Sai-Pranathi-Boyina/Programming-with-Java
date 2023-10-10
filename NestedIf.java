import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c :");
        try (Scanner sap = new Scanner (System.in)) {
            int a,b,c;
            a = sap.nextInt();
            b = sap.nextInt();
            c = sap.nextInt();
            if (a>b) {
                if (a>c) {
                    System.out.println("The biggest is:"+a);
                } else {
                    System.out.println("The biggest is:"+c);
                }
            } else {
                if (b>c) {
                    System.out.println("The biggest is:"+b);
                } else {
                    System.out.println("The biggest is:"+c);
                }
            }
        }
    }
}
