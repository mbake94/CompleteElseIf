import java.util.Scanner;

public class CompleteIfElse {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        int number;
        System.out.print("Enter any number: ");
        number = keybd.nextInt();

        if (number > 10) {
            System.out.println("Number is Greater than 10");
        }
        else if (number == 10) {
            System.out.println("Number is Equal to 10.");
        } else {
        System.out.println("Number is Less than 10");
        }
    }

}

