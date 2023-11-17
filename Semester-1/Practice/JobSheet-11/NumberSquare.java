import java.util.Scanner;
public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N value (at least 3): ");
        int N = sc.nextInt();

        while (N < 3) {
            System.out.println("The N value must be at least 3, Please re-enter");
            System.out.print("Enter the N value (at least 3): ");
            N = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}