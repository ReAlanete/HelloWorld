import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
    }
        System.out.println("Задача 3");
        int year = 2021;
        if (year >= 1584) {
        if ((year % 4 == 0) || (year % 100 == 0) || (year % 400 == 0)) {
            System.out.println(year + " Год является високосным.");
        }
        else {
            System.out.println(year + " Год не является високосным.");
        }
        } else  System.out.println(year + " Год должен быть больше, чем 1584 (в котором был введен високосный год).");
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 0 && deliveryDistance <= 20){
            System.out.println("Потребуетя дней " + deliveryDays + ".");}
        else if (deliveryDistance > 20 && deliveryDistance <= 60)
             {   deliveryDays +=1;
            System.out.println("Потребуетя дней " + deliveryDays + ".");
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100)
        { deliveryDays +=2;
            System.out.println("Потребуетя дней " + deliveryDays + ".");
    }
        else {System.out.println("Доставки нет.");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
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
                System.out.println("Такого месяца нет");
        }
    }
}


