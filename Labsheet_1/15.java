import java.util.Scanner;
// 15. Accept a 3-digit number and check whether it is an Armstrong number or not using arithmetic
// operators and if-else.
class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is NOT an Armstrong Number");

        sc.close();
    }
}
