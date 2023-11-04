import java.util.Scanner;
public class ArrayRataNilai23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] studentGrades = new int[10];
        double total = 0;
        double average;
        int pass = 0;

        for (int i = 0; i < studentGrades.length; i++) {
            System.out.print("Enter student grades "+(i+1)+" : ");
            studentGrades[i] = sc.nextInt();   
        }
        for (int i = 0; i < studentGrades.length; i++) {
            total += studentGrades[i];
            if (studentGrades[i] > 70) { 
                pass++;
            }
        }
        average = total/studentGrades.length;
        System.out.println("Average grade = "+average);
        System.out.println("Number of students who passed: " + pass);
        sc.close();
    }
}
