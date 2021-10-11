package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextDouble();
        double value2 = scanner.nextDouble();



        for(int i = 0; i<5;i++,value1= scanner.nextDouble(),value2= scanner.nextDouble()){
            System.out.println(value1/value2);

        if(value2==0){
            System.out.println("Деление на ноль");
        }

        }



    }
}
