package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();

        if (value1 > value2) {
            System.out.println("ERROR");
        }

        for (int i = value1; value2 > i; i++) {

            if (i++ % 5 == 0 && i % 10 != 0) {

                System.out.println(i);
            }
        }
    }
}
