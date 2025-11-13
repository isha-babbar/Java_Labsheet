// 29. Input the height (in cm) of a person and classify them as short, average, or tall:
// < 150: Short
// 150–170: Average
// 170: Tall

import java.util.Scanner;
class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height (in cm): ");
        int h = sc.nextInt();
        sc.close();
        if (h < 150)
            System.out.println("Short");
        else if (h <= 170)
            System.out.println("Average");
        else
            System.out.println("Tall");
    }
}
