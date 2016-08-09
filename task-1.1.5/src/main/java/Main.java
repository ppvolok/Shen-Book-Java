import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (args.length == 2) {

            System.out.println("Результат вычисления равен: " + multiplier(Integer
                    .parseInt(args[0]), Integer.parseInt(args[1])));

        } else if (args.length == 0) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первый множитель: ");
            int a = scanner.nextInt();
            System.out.print("Введите второй множитель: ");
            int b = scanner.nextInt();
            System.out.println("\n" + "Результат вычисления равен: " + multiplier(a, b));

        } else {

            System.out.println("Аргументы указаны неверно!");
            System.out.println("Правильный формат: \"имя_приложения число_a число_b\"");

        }

    }

    // Функция получает два целых числа и возвращает их произведение.
    private static int multiplier(int a, int b) {

        // Начальные условия.
        int i = 0;
        int c = 0;

        // Условие завершение цикла.
        while (i != b) {

            // Прибавляем к переменной i единицу, таким образом приближая к b.
            i++;
            // Следовательно для сохранения справедливости c = a * i, прибавляем a к c.
            c = c + a;

        }

        // Возврат результата.
        return c;

    }

}
