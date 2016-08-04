import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (args.length == 2) {

            long a = Long.parseLong(args[0]);
            long n = Long.parseLong(args[1]);
            System.out.println("Результат вычисления: " + power(a, n));

        } else if (args.length == 0) {

            // Создаем новый Scanner для получения ввода пользователя.
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите число возводимое в степень (целое а): ");
            long a = scanner.nextInt();
            System.out.print("Введите значение степени (целое неотрицательное n): ");
            long n = scanner.nextInt();

            // Вывод сообщения и результата.
            System.out.println("\n" + "Результат вычисления: " + power(a, n));

        } else {

            System.out.println("Аргументы указаны неверно!");
            System.out.println("Правильный формат: \"Имя_приложения\" \"число a\" \"число n\"");

        }

    }

    // Функция возведения в степень. Принимает возводимое в степень число a и значение степени n.
    private static long power(long a, long n) {

        // Переменная b сохраняет результат (как промежуточный, так и конечный). Начальное значение равно 1, так как
        // любое число в нулевой степени равно единице.
        long b = 1;

        // Переменная i - счетчик цикла.
        int i = 0;

        // С каждым шагом счетчик цикла i увеличивается на 1 до тех пор, пока он не станет равен значению степени.
        while (i != n) {

            // Увеличиваем счетчик на 1.
            i++;

            // На каждом шаге b умножается на возводимое в степень число. Результат присваивается той же переменной b,
            // позволяя таким образом накапливать результат вычислений.
            b = b * a;
        }

        // Возврат результата после окончания цикла.
        return b;
    }

}
