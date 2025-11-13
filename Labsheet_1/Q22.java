import java.util.Scanner;
// 22. Input the length and breadth of a rectangle, and determine whether it is a square or not using
// if-else.
class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        sc.close();
        if (l == b)
            System.out.println("It is a Square");
        else
            System.out.println("It is a Rectangle");
    }
}
