import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the number b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (b > a) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }

        int add = a + b;
        int subtr = a - b;
        int mult = a * b;
        int div = a / b;

        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + subtr);
        System.out.println(a + " * " + b + " = " + mult);
        System.out.println(a + " / " + b + " = " + div);
    }
}