import java.util.Scanner;

public class CinemaWithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        String name, next;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Enter a name: ");
                        name = sc.nextLine();
                        System.out.print("Enter row number: ");
                        row = sc.nextInt();
                        System.out.print("Enter column number: ");
                        column = sc.nextInt();
                        sc.nextLine(); // Consume the newline character

                        if (row >= 1 && row <= audience.length && column >= 1 && column <= audience[0].length) {
                            if (audience[row - 1][column - 1] == null) {
                                audience[row - 1][column - 1] = name;
                                System.out.println("Audience added successfully!");
                            } else {
                                System.out.println(
                                        "Warning: The selected seat is already occupied. Please choose another seat.");
                            }
                        } else {
                            System.out.println("Invalid seat. Please enter valid row and column numbers.");
                        }

                        System.out.print("Are there any other audiences to be added? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Audience List:");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(audience[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exit");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
