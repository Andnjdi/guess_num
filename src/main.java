import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("\t\t\t\tGame 'GUESS NUMBER'");
        int hidden_num = rand.nextInt(100) + 1;
        int attemps = 0;
        while (true) {
            System.out.print("Guess num (1-100): ");
            attemps++;
            int guess = scan.nextInt();
            if (guess == 0) {
                System.out.println("You're lose!");
                break;
            }
            else if (guess < 0 || guess > 100) {
                System.out.println("Try again");
                attemps--;
                continue;
            }
            else if (guess == hidden_num) {
                System.out.println("You're win!");
                System.out.println("Amount attemps: " + attemps);
                break;
            }
            else if (guess > hidden_num) {
                System.out.println("My number less");
            }
            else if (guess < hidden_num) {
                System.out.println("My number more");
            }
        }
        scan.close();
    }
}
