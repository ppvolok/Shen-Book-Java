import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Создаем массив для значений введенных пользователем.
        String[] strings = new String[2];

        // Если аргументов два, то...
        if (args.length == 2) {

            // ...присваиваем их соответсвующим ячейкам массива.
            strings[0] = args[0];
            strings[1] = args[1];

            // Выводим сообщения с результатами записи переменных в массив.
            System.out.println("\n" + "Переменная a равна: " + strings[0]);
            System.out.println("Переменная b равна: " + strings[1]);

            // Выводим сообщение и запускаем функцию смены переменных местами.
            System.out.println("\n" + "Меняю переменные местами..." + "\n");
            strings = variableChanger(strings);

            // Делаем паузу в одну секунду для имитации работы функции.
            Thread.sleep(1000);

            // Выводим результат.
            System.out.println("Переменная a теперь равна: " + strings[0]);
            System.out.println("Переменная b теперь равна: " + strings[1]);

        } else if (args.length == 0) {

            // Создаем новый Scanner для получения ввода пользователя.
            Scanner scanner = new Scanner(System.in);


            // Выводим инструкции и записываем в соответствующие ячейки массива введеннын пользователем значения.
            System.out.print("Введите значение переменной a: ");
            strings[0] = scanner.nextLine();
            System.out.print("Введите значение переменной b: ");
            strings[1] = scanner.nextLine();

            // Выводим сообщения с результатами записи переменных в массив.
            System.out.println("\n" + "Переменная a равна: " + strings[0]);
            System.out.println("Переменная b равна: " + strings[1]);

            // Выводим сообщение и запускаем функцию смены переменных местами.
            System.out.println("\n" + "Меняю переменные местами..." + "\n");
            strings = variableChanger(strings);

            // Делаем паузу в одну секунду для имитации работы функции.
            Thread.sleep(1000);

            // Выводим результат.
            System.out.println("Переменная a теперь равна: " + strings[0]);
            System.out.println("Переменная b теперь равна: " + strings[1]);

        } else {

            // Для всех иных вариантов указания аргументов, выводим справку.
            System.out.println("Аргументы указаны неверно!");
            System.out.println("Правильный формат: \"имя_приложения переменная_1 переменная_2\"");

        }

    }

    // Функция принимает массив целых чисел и меняет местами первые два элемента.
    private static String[] variableChanger(String[] someArray) {

        // Дополнительные переменные введены для наглядности.
        String a = someArray[0];
        String b = someArray[1];
        String temp;

        // Действия из решения задачи.
        temp = a;
        a = b;
        b = temp;

        // Присвоение измененных значений соответствующим ячейкам массива.
        someArray[0] = a;
        someArray[1] = b;

        // Возврат результата.
        return someArray;

    }

}
