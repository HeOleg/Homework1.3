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
        //Задание 4
        int deliveryDistance=60;
        int standartDelivery=deliveryDistance-20;
        int standartTimeDelivery=1;
        int distanceDifference=standartDelivery/40;
        boolean additionalsDays=deliveryDistance<=20;
        int delivery=distanceDifference+standartTimeDelivery;
        int hardDelivery=distanceDifference+standartTimeDelivery+1;
        if (additionalsDays) {
            System.out.println("Потребуется дней: " + standartTimeDelivery);
        } else if (standartDelivery%40>0) {
            System.out.println("Потребуется дней: "+hardDelivery);
        }
        else {
            System.out.println("Потребуется дней: "+delivery);
        }
        //Задание 5
        int monthNumber=1;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
    }

