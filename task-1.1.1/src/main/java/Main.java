import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение переменной a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение переменной b: ");
        int b = scanner.nextInt();

        System.out.println("Переменная a равна: " + a);
        System.out.println("Переменная b равна: " + b);

        System.out.println("\n" + "Меняю переменные местами..." + "\n");

        Thread.sleep(1000);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Переменная a теперь равна: " + a);
        System.out.println("Переменная b теперь равна: " + b);

    }

}
