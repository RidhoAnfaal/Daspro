import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';

        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Guess the numbers (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer == number) {
                    System.out.println("Congratulations! You have successfully guessed the number");
                    success = true;
                }else if (answer < number) {
                    System.out.println("Your guess is too small, try again!");
                }else {
                    System.out.println("Your guess is too big, try again!");
                }
            } while (!success);
            System.out.print("Would you like to repeat the game (Y/y)? ");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
        
        input.close();   
    }
}