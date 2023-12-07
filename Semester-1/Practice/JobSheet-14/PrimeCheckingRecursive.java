import java.util.Scanner;

public class PrimeCheckingRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input number(n): ");
        int n = input.nextInt();
        if (primeCheckingRecursive(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        input.close();
    }

    public static boolean primeCheckingRecursive(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            return primeCheckingRecursive(n - 1);
        }
    }
}