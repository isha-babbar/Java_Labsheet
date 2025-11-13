import java.util.Scanner;
// 28. Accept a number and display the number of digits using expressions and if-else.
class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0, temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        sc.close();
        System.out.println("Number of digits in " + num + " is: " + count);
    }
}
