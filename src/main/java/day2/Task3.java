package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        if (value1 > value2) {
            System.out.println("ERROR");
        }


        while (value1 < value2) {

            if (value1 % 5 == 0 && value1 % 10 != 0) {
                System.out.println(value1);
            }
            value1++;

        }
    }
}