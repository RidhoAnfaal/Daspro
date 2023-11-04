import java.util.Scanner;
public class ArrayRataNilai23Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int[] studentGrades = new int[numberOfStudents];
        double totalPass = 0, totalFail = 0, avgPass, avgFail;
        int countPass = 0, countFail = 0;

        for (int i = 0; i < studentGrades.length; i++) {
            System.out.print("Enter student grades " + (i + 1) + " : ");
            studentGrades[i] = sc.nextInt();
            if (studentGrades[i] > 70) {
                totalPass += studentGrades[i];
                countPass++;
            } else {
                totalFail += studentGrades[i];
                countFail++;
            }
        }

        avgPass = countPass > 0 ? totalPass / countPass : 0;
        avgFail = countFail > 0 ? totalFail / countFail : 0;
        System.out.println("Average grade of passed students = " + avgPass);
        System.out.println("Average grade of failed students = " + avgFail);
        sc.close();
    }
}
