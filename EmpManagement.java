import java.util.Scanner;

public class EmpManagement {
    public static void main(String[] args) {
        try (Scanner emp = new Scanner(System.in)) {
            int id[] = new int[3];
            int salary[] = new int[3];
            String name[] = new String[3];
            String email[] = new String[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter employee's id,name,email, salary:");
                id[i] = emp.nextInt();
                emp.nextLine();
                name[i] = emp.nextLine();
                email[i] = emp.nextLine();
                salary[i] = emp.nextInt();
            }
            System.out.println("\n****DATABASE****\n");
            for (int i = 0; i < 3; i++) {
                System.out.println(id[i] + " " + name[i] + "\t" + email[i] + "\t" + salary[i]);
            }
            System.out.println("\n***BONUS APPLIED***\n");
            for (int i = 0; i < 3; i++) {
                salary[i] = (int) (salary[i] + salary[i] * 0.1);
                System.out.println(id[i] + " " + name[i] + "\t" + email[i] + "\t" + salary[i]);
            }
            int highest = salary[0], lowest = salary[0];
            for (int i = 1; i < 3; i++) {
                if (highest < salary[i]) {
                    highest = salary[i];
                }
                if (lowest > salary[i]) {
                    lowest = salary[i];
                }
            }
            for (int i = 0; i < 3; i++) {
                if (highest == salary[i]) {
                    System.out.println("The HIGHEST PAID salary:" + highest);
                    System.out.println("EMPLOYEE DETAILS");
                    System.out.println(id[i] + " " + name[i] + "\t" + email[i] + "\t" + salary[i]);
                }
                if (lowest == salary[i]) {
                    System.out.println("The LOWEST PAID salary:" + lowest);
                    System.out.println("EMPLOYEE DETAILS");
                    System.out.println(id[i] + " " + name[i] + "\t" + email[i] + "\t" + salary[i]);
                }
            }
        }
    }
}