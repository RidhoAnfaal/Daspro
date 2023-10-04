import java.util.Scanner;
/**
 * Selection1StudentIDNumber
 */
public class Selection1StudentIDNumber {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.print("Input a number = ");
        int number = input05.nextInt();
        String hasil;

        hasil = (number%2 == 0) ? " is an even number!" : " is an odd number!";
        System.out.println(number + hasil);


    }
}