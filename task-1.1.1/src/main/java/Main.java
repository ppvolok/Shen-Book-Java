import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение переменной a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение переменной b: ");
        int b = scanner.nextInt();

        System.out.println("Переменная a: " + a);
        System.out.println("Переменная b: " + b);

        scanner.nextLine();
        System.out.println("\n" + "Нажмите любую клавишу, чтобы поменять переменные местами.");
        scanner.nextLine();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Переменная a теперь равна: " + a);
        System.out.println("Переменная b теперь равна: " + b);

    }

}
