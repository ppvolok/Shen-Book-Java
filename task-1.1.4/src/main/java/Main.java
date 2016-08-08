import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (args.length == 2) {

            long a = Long.parseLong(args[0]);
            long n = Long.parseLong(args[1]);
            System.out.println("Результат вычисления: " + betterPower(a, n));

        } else if (args.length == 0) {

            // Создаем новый Scanner для получения ввода пользователя.
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите число возводимое в степень (целое а): ");
            long a = scanner.nextInt();
            System.out.print("Введите значение степени (целое неотрицательное n): ");
            long n = scanner.nextInt();

            // Вывод сообщения и результата.
            System.out.println("\n" + "Результат вычисления: " + betterPower(a, n));

        } else {

            System.out.println("Аргументы указаны неверно!");
            System.out.println("Правильный формат: \"имя_приложения число_a число_n\"");

        }

    }

    // Функция возведения в степень. Принимает возводимое в степень число a и значение степени n.
    private static long betterPower(long a, long n) {

        long i = n;
        long b = 1;
        long c = a;

        while (i != 0) {

            if (i % 2 == 0) {

                i = i / 2;
                c = c * c;

            } else {

                i--;
                b = b * c;

            }

        }

        return b;

    }
}
