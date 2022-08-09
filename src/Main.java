public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS");
        } else {
            System.out.println("Установите версию приложения для Android");
        }

        //Задание2
        int ClientOS = 1;
        int yearOfProduction = 2013;
        boolean lightVersion = yearOfProduction < 2015;
        if (lightVersion && ClientOS == 0) {
            System.out.println("Установите облегченную версию приложения для IOS");
            if (lightVersion && ClientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android");
            }
        } else if (ClientOS == 0) {
            System.out.println("Установите приложение для IOS");
        } else {
            System.out.println("Установите приложение для Android");
        }

        //Задание 3
        int year = 2021;
        boolean leapYear = (year % 4 == 0&&year%100!=0||year/400==0);
        if (leapYear) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }
}