package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double value1 = scanner.nextDouble();
        double value2 = scanner.nextDouble();


        for (; value2 != 0; value1 = scanner.nextDouble(), value2 = scanner.nextDouble()) {

            double result = value1 / value2;
            System.out.println(result);

        }


    }
}
