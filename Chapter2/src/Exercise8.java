import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the pay rate: ");
        float payRate = scanner.nextFloat();
        System.out.println("Input the hours work in a week: ");
        int hour = scanner.nextInt();

        if(payRate < 5.15) {
            System.out.println("The pay rate is less than the minimum wage");
        } if(hour > 48) {
            System.out.println("The employee worked more than the number of hours in a week");
        }

    }
}
