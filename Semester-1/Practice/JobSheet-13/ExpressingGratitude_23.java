import java.util.Scanner;
public class ExpressingGratitude_23 {
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world.\n" + "You inspired in me a lover for learning and made me feel like I could ask you anything.");
        sayAdditionalGreetings(name, "Wishing you a wonderful day");
    }

    public static void main(String[] args) {
        sayThankyou();
    }

    public static void sayAdditionalGreetings(String name, String additionalGreetings) {
        System.out.print("Additional Greetings for " + name + " : ");
        System.out.print(additionalGreetings);
    }
}