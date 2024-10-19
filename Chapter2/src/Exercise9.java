import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want?");
        System.out.println("Convert from inch to cm (Input: 1)");
        System.out.println("Convert from cm to inch (Input: 2)");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Convert from inch to cm");
            System.out.println("Input the number of length:");
            float inch = scanner.nextFloat();
            System.out.printf("Cm: %f", inch/2.54);
        }
        else if (choice == 2) {
            System.out.println("Convert from cm to inch");
            System.out.println("Input the number of length:");
            float cm = scanner.nextFloat();
            System.out.printf("Cm: %f", cm*2.54);
        } else {
            System.out.println("Wrong");
        }
    }
}
