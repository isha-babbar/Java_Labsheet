// 23. Input a temperature in Celsius and convert it to Fahrenheit using type casting and expressions.
import java.util.Scanner;

class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        double f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
        sc.close();
    }
}
