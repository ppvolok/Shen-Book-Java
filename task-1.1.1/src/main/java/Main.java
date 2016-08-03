import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Переменная a: " + a);
        System.out.println("Переменная b: " + b);
        System.out.println("Нажмите любую клавишу.");

        System.console().readLine();

        int temp = a;
        a = b;
        b = temp;

    }

}
