package pl.pp;

import java.util.Scanner;

public class mojaPiataAplikacja {

    public static void printchat(char chapter, int times, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < times; j++) {
                System.out.print(chapter);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char chapter = '*';
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile raz wydrukowac w wierszy: ");
        int repeat = scan.nextInt();
        System.out.println("Ile wierszy wydrukowac: ");
        int rows = scan.nextInt();
        printchat(chapter, repeat, rows);
    }
}
