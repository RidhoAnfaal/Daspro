import java.util.Scanner;
public class weeklyGrades23 {
    static double[][] studentScore = new double[5][7];
    static String[] studentName = new String[5];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        inputValue(input);
        showStudentScore();
        int highestValueDay = findHighestValueDays();
        System.out.println("Week with the highest value is week-" + (highestValueDay + 1));
        showHighestStudentScore(highestValueDay);
        input.close();
    }

    public static void inputValue (Scanner input) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the student name-" + (i + 1) + ": ");
            studentName[i] = input.nextLine();

            for (int j = 0; j < 7; j++) {
                System.out.print("Enter student score week-" + (j + 1) + " for " + studentName[i] + ": ");
                studentScore[i][j] = input.nextDouble();
            }
            System.out.println();
            input.nextLine();
        }
    }

    public static void showStudentScore() {
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s |", "Student Name");
        for (int j = 0; j < 7; j++) {
            System.out.printf(" %-10s |", "Week " + (j + 1));
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf("| %-15s |", studentName[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf(" %-10.2f |", studentScore[i][j]);
                
            }
            System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        }
    }

    public static int findHighestValueDays() {
        int highestValueDay = 0;
        double highestScore = studentScore[0][0];
 
        for (int j = 1; j < 7; j++) {
            double scoreWeek = 0;
            for (int i = 0; i < 5; i++) {
                scoreWeek += studentScore[i][j];
            }

            if (scoreWeek > highestScore) {
                highestScore = scoreWeek;
                highestValueDay = j;
            }
        }

        return highestValueDay;
    }

    public static void showHighestStudentScore(int week) {
        double highestTotalScore = 0;
        int highestScoringStudent = -1;

        for (int i = 0; i < 5; i++) {
            double totalScore = 0;
            for (int j = 0; j < 7; j++) {
                totalScore += studentScore[i][j];
            }

            if (totalScore > highestTotalScore) {
                highestTotalScore = totalScore;
                highestScoringStudent = i;
            }
        }

        if (highestScoringStudent != -1) {
            System.out.println("Student with the highest grade: " + studentName[highestScoringStudent] + " (Total Score: " + highestTotalScore + ")");
        }
    }
}