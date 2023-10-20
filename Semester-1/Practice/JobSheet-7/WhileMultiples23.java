import java.util.Scanner;
public class WhileMultiples23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiple, sum = 0, counter = 0, i = 1;

        System.out.print("Input the multiple = ");
        multiple = input.nextInt();

        while (i <= 50) {
            if (i % multiple == 0) {
            sum = sum + i;
            counter++;
        }
            i++; 
        }
        
        double avarage = sum / counter;
        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
        System.out.printf("The avarage of all multiples of %d in the range 1 to 50 is %.2f. \n", multiple, avarage);
    
    }
}