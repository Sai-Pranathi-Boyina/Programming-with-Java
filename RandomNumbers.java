import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        for (int index = 0; index < 10; index++) {
            System.out.println(1+r.nextInt(12));
        }
        
    }
}