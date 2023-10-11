/**
 * IDNumber
 */
public class ExampleVariableIDNumber {

    public static void main(String[] args) {
        
        String oneOfMyHobbies = "Playing Game";
        boolean isSmart = true;
        char gender = 'M';
        byte _age = 18;
        double $gpa = 3.38, height = 1.68;

        System.out.println(oneOfMyHobbies);
        System.out.println("Are you smart ? " + isSmart);
        System.out.println("Gender: " + gender);
        System.out.println("My current age is " + _age);
        System.out.printf("My GPA is %s and my height is %s meters", $gpa, height);

    }
}