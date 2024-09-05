import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Ввод первой строки a
        System.out.print("Введите первую строку (a): ");
        String a = scanner.nextLine();

        // Ввод второй строки b
        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();

        // Сравнение строк a и b
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}