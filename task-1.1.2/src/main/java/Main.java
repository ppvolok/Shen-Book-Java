import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Создаем новый Scanner для получения ввода пользоватепля
        Scanner scanner = new Scanner(System.in);

        // Создаем массив для значений введенных пользователем.
        int[] someNumbers = new int[2];

        // Выводим инструкции и записываем в соответствующие ячейки массива введеннын пользователем значения.
        System.out.print("Введите значение переменной a: ");
        someNumbers[0] = scanner.nextInt();
        System.out.print("Введите значение переменной b: ");
        someNumbers[1] = scanner.nextInt();

        // Выводим сообщения с результатами записи переменных в массив.
        System.out.println("\n" + "Переменная a равна: " + someNumbers[0]);
        System.out.println("Переменная b равна: " + someNumbers[1]);

        // Выводим сообщение и запускаем функцию смены переменных местами.
        System.out.println("\n" + "Меняю переменные местами..." + "\n");
        someNumbers = numberVariableChanger(someNumbers);

        // Делаем паузу в одну секунду для имитации работы функции.
        Thread.sleep(1000);

        // Выводим результат.
        System.out.println("Переменная a теперь равна: " + someNumbers[0]);
        System.out.println("Переменная b теперь равна: " + someNumbers[1]);

    }

    // Функция принимает массив целых чисел и меняет местами первые два элемента без создания временных переменных.
    private static int[] numberVariableChanger(int[] someArray) {

        // Дополнительные переменные введены для наглядности.
        int a = someArray[0];
        int b = someArray[1];

        // Действия из решения задачи.
        a = a + b;
        b = a - b;
        a = a - b;

        // Присвоение измененных значений соответствующим ячейкам массива.
        someArray[0] = a;
        someArray[1] = b;

        // Возврат результата.
        return someArray;

    }

}
