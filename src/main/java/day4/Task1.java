package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива");
        int countArray = scanner.nextInt();

        int[] arrays = new int[countArray];
        int countmore8 = 0;
        int countEqual1 = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;


        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10);

        }

        for (int x : arrays) {

            sum += x;

            if (x > 8) {
                countmore8++;

            } else if (x == 1) {
                countEqual1++;
            } else if (x % 2 == 0) {
                countEven++;
            } else if (x % 2 != 0) {
                countOdd++;
            }

        }


        System.out.println(Arrays.toString(arrays));
        System.out.println("Длина массива " + countArray);
        System.out.println("Количество чисел больше 8: " + countmore8);
        System.out.println("Количество чисел равных 1: " + countEqual1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }


}

