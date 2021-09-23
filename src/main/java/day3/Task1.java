package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        for (; !country.equalsIgnoreCase("Stop"); country = scanner.nextLine()) {
            switch (country) {
                case "Рим":
                case "Милан":
                case "Турин":

                    System.out.println("Италия");
                    break;

                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;

                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;

                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;

                case "Stop":
                    break;
                default:
                    System.out.println("Такой страны не найдено");

            }

        }
    }
}
