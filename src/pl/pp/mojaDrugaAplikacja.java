package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {

        double t = 10;
        double y = 2;

        Scanner scanner = new Scanner(System.in);

        var result = t + y;
        System.out.println("t + y = " + result);

        result = t - y;
        System.out.println("t - y = " + result);

        result = t * y;
        System.out.println("t * y = " + result);

        result = t / y;
        System.out.println("t / y = " + result);

        result = t % y;
        System.out.println("t % y = " + result);

        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("t + y = " + (first + second));

        int x;
        x = 10;
        System.out.println("x = " + x);
        x = x * 2;
        System.out.println("x = " + x * 2);
        x = x * x;
        System.out.println("x = " + x * x);

        System.out.println("Prosze podacz wiek:");
        int age = scanner.nextInt();

        int wiek = age * 360 * 24 * 60 * 60;
        System.out.println("Twoj wiek w sekundach: " + wiek);

    }
}
