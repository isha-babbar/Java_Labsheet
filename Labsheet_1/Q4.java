import java.util.Scanner;
// 4. Accept a floating-point number and convert it explicitly to an integer. Print both the original and
// the converted values.
class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        float f = sc.nextFloat();
        int i = (int) f;
        sc.close();
        System.out.println("Original value: " + f);
        System.out.println("Converted value: " + i);
    }
}
