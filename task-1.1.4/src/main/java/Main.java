import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (args.length == 2) {

            long a = Long.parseLong(args[0]);
            long n = Long.parseLong(args[1]);
            System.out.println("Результат вычисления: " + betterPow(a, n));

        } else if (args.length == 0) {

            // Создаем новый Scanner для получения ввода пользователя.
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите число возводимое в степень (целое а): ");
            long a = scanner.nextInt();
            System.out.print("Введите значение степени (целое неотрицательное n): ");
            long n = scanner.nextInt();

            // Вывод сообщения и результата.
            System.out.println("\n" + "Результат вычисления: " + betterPow(a, n));

        } else {

            System.out.println("Аргументы указаны неверно!");
            System.out.println("Правильный формат: \"имя_приложения число_a число_n\"");

        }

    }

    // Функция возведения в степень. Принимает возводимое в степень число a и значение степени n.
    private static long betterPow(long a, long n) {

        // Начальные условия, при которых верно утверждение b ^ i * c = a ^ n.
        long b = a;
        long i = n;
        long c = 1;

        // Условие при котором утверждение приобрет вид c = a ^ n.
        while (i != 0) {

            // Если i - четное, то уменьшаем степень в 2 раза, но домножаем b само на себя.
            if (i % 2 == 0) {

                i = i / 2;
                b = b * b;

            // Если i - нечетное, то делаем его четным уменьшив на единицу, но домножаем b на c, чтобы соблюсти свойство
            // инварианта.
            } else {

                i--;
                c = b * c;

            }

        }

        // Таким образом, пошагово изменяя значения левой части утверждения к искомому виду, но соблюдая при этом
        // свойство инварианта - неизменность значения мы получаем в переменной c значение a ^ n. Его и возвращаем из
        // функции.
        return c;

    }
}
