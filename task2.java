import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строк для сравнения
        System.out.print("Введите первую строку: ");
        String string1 = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String string2 = scanner.nextLine();

        // Сравнение введённых строк
        if (string1.equals(string2)) {
            System.out.println("Строки идентичны.");
        } else {
            System.out.println("Строки не идентичны.");
        }
    }
}  