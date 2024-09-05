import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Ввод первого числа a
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        // Ввод второго числа b
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел a и b
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполнение арифметических операций
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));

        // Проверка деления на ноль
        if (b != 0) {
            System.out.println("Частное: " + (a / b));
        } else {
            System.out.println("Деление на ноль невозможно!");
        }
    }
}