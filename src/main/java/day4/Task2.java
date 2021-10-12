package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int countArray = scanner.nextInt();

        int[] array = new int[countArray];
        System.out.println("Введите граничное значение массива");
        int boundArray = scanner.nextInt();

        int maxNumber = array[0];
        int numberOdd = 0;
        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(boundArray);

        }
        int minNumber = array[0];

        for (int x : array) {
            maxNumber = Math.max(maxNumber, x);
            minNumber = Math.min(minNumber, x);
            if (x % 10 == 0) {
                numberOdd++;


            }
            if (x % 10 == 0) {
                sum = sum + x;
            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println("Наибольший элемент массива: " + maxNumber);
        System.out.println("Наименьший элемент массива: " + minNumber);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + numberOdd);
        System.out.println("Cумма элементов массива, оканчивающихся на 0 " + sum);


    }
}
