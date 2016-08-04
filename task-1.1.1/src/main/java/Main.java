import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Создаем новый Scanner для получения ввода пользователя.
        Scanner scanner = new Scanner(System.in);

        // Создаем массив для значений введенных пользователем.
        int[] numbers = new int[2];

        // Выводим инструкции и записываем в соответствующие ячейки массива введеннын пользователем значения.
        System.out.print("Введите значение переменной a: ");
        numbers[0] = scanner.nextInt();
        System.out.print("Введите значение переменной b: ");
        numbers[1] = scanner.nextInt();

        // Выводим сообщения с результатами записи переменных в массив.
        System.out.println("\n" + "Переменная a равна: " + numbers[0]);
        System.out.println("Переменная b равна: " + numbers[1]);

        // Выводим сообщение и запускаем функцию смены переменных местами.
        System.out.println("\n" + "Меняю переменные местами..." + "\n");
        numbers = variableChanger(numbers);

        // Делаем паузу в одну секунду для имитации работы функции.
        Thread.sleep(1000);

        // Выводим результат.
        System.out.println("Переменная a теперь равна: " + numbers[0]);
        System.out.println("Переменная b теперь равна: " + numbers[1]);

    }

    // Функция принимает массив целых чисел и меняет местами первые два элемента.
    private static int[] variableChanger(int[] someArray) {

        // Дополнительные переменные введены для наглядности.
        int a = someArray[0];
        int b = someArray[1];
        int temp;

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
