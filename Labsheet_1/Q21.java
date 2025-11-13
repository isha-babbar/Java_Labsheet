import java.util.Scanner;
// 21. Accept three angles from the user and check whether they can form a valid triangle (sum of
// angles = 180°). 
class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle1: ");
        int a1 = sc.nextInt();
        System.out.print("Enter angle2: ");
        int a2 = sc.nextInt();
        System.out.print("Enter angle3: ");
        int a3 = sc.nextInt();
        sc.close();
        if (a1 + a2 + a3 == 180)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}
