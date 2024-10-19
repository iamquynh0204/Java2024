import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the hours of work: ");
        float hour = scanner.nextFloat();
        System.out.println("Input the rate");
        float rate = scanner.nextFloat();

        float total = hour*rate*100000 + hour*100000; //100000 is base salary

        System.out.printf("The base salary is: %f", total);
    }
}
