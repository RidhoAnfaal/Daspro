import java.util.Scanner;
public class SalaryStudentID {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numAttendance, numAbsence, totalSalary, salary, salaryDeduction;

        System.out.print("Input attendance number: ");
        numAttendance = input.nextInt();
        System.out.print("Input absence number: ");
        numAbsence = input.nextInt();
        System.out.print("Input salary: ");
        salary = input.nextInt();
        System.out.print("Input salary deduction: ");
        salaryDeduction = input.nextInt();

        totalSalary = (numAttendance * salary) - (numAbsence * salaryDeduction);
        System.out.println("Total salary: "+totalSalary);

    }
}
