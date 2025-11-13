import java.util.Scanner;
// 20. Accept age and gender and determine eligibility for marriage (e.g., male ≥ 21, female ≥ 18) using
// nested if-else conditions.
class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().toUpperCase().charAt(0);
        sc.close();
        if (gender == 'M') {
            if (age >= 21)
                System.out.println("Eligible for Marriage");
            else
                System.out.println("Not Eligible for Marriage");
        } else if (gender == 'F') {
            if (age >= 18)
                System.out.println("Eligible for Marriage");
            else
                System.out.println("Not Eligible for Marriage");
        } else {
            System.out.println("Invalid Gender Input");
        }
    }
}
