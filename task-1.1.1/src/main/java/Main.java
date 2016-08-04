import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[2];

        System.out.print("Введите значение переменной a: ");
        numbers[0] = scanner.nextInt();
        System.out.print("Введите значение переменной b: ");
        numbers[1] = scanner.nextInt();

        System.out.println("\n" + "Переменная a равна: " + numbers[0]);
        System.out.println("Переменная b равна: " + numbers[1]);

        System.out.println("\n" + "Меняю переменные местами..." + "\n");
        numbers = variableChanger(numbers);

        Thread.sleep(1000);

        System.out.println("Переменная a теперь равна: " + numbers[0]);
        System.out.println("Переменная b теперь равна: " + numbers[1]);

    }

    // Функция принимает массив целых чисел и меняет местами первые два элемента.
    private static int[] variableChanger(int[] someArray) {

        // Доополнитльные пересенные введены для наглядности.
        int a = someArray[0];
        int b = someArray[1];
        int temp;

        // Действия из решения задачи.
        temp = a;
        a = b;
        b = temp;

        // Присвоение измененных значений соответсвтующим ячейкам массива.
        someArray[0] = a;
        someArray[1] = b;

        // Возврат результата.
        return someArray;

    }

}
