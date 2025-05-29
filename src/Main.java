import java.time.LocalDate;

public class Main {


    //task 1 Method 1
    public static void isYearLeap(int year) {
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }

    // task 2 Method 2
    public static void checkOsAndYear(int clientDeviceOS, int clientDeviceYear) {
        String osName = (clientDeviceOS == 0) ? "IOS" : "Android";
        int currentYear = LocalDate.now().getYear();
        String versionType = (clientDeviceYear < currentYear) ? "облегченную" : "обычную";
        System.out.println("Установите " + versionType + " версию приложения для " + osName);
    }

    // task 3 Method 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Task 1
        isYearLeap(2000);
        isYearLeap(2004);
        isYearLeap(1900);
        isYearLeap(1582);
        isYearLeap(1700);
        // Method 2
        checkOsAndYear(1, 2025);
        checkOsAndYear(1, 2014);
        checkOsAndYear(0, 2025);
        checkOsAndYear(0, 2014);
        // Task 3 Method 3
        int deliveryDistance = 105;
        int daysForDelivery = calculateDeliveryDays(deliveryDistance);
        if (daysForDelivery == -1) {
            System.out.println("Доставка невозможна");
        } else {
            System.out.println("Потребуется дней " + daysForDelivery);
        }
    }
}







