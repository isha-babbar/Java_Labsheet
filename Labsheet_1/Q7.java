import java.util.Scanner;
// 7. Input a number and check if it is divisible by both 3 and 5 using logical operators.
class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        if (num % 3 == 0 && num % 5 == 0)
            System.out.println(num + " is divisible by both 3 and 5");
        else
            System.out.println(num + " is NOT divisible by both 3 and 5");
    }
}
