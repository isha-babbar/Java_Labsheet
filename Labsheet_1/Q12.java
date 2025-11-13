import java.util.Scanner;
// 12. Accept a year and check whether it is a leap year using if-else.
class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        sc.close();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is NOT a Leap Year");
    }
}
