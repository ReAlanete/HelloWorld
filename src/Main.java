public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {

            month++;
            total = total + salary;
            total = total + total / 100;
                        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }
        // Task 2
        System.out.println("Task 2");
        int i = 1;
        for (; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        i = 11;
        while (i > 1) {
            i--;
            System.out.print(i + " ");
        }
        // Task 3 Решение через while
        System.out.println(" ");
        System.out.println("Task 3");
        int populationCountryY = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int year = 2000;
        System.out.println("Год " + year + " численность населения составляет " + populationCountryY + ".");
        while (year < 2010) {
            int populationIncrease = (fertilityPerThousand - mortalityPerThousand) * populationCountryY / 1000;
            populationCountryY = populationCountryY + populationIncrease;
            year++;
            System.out.println("Год " + year + " численность населения составляет " + populationCountryY + ".");
        }
        // Task 3 Решение через for (решение для себя)
        int populationCountryY1 = 12_000_000;
        int fertilityPerThousand1 = 17;
        int mortalityPerThousand1 = 8;
        int year1 = 2000;
        System.out.println("Год " + year1 + " численность населения составляет " + populationCountryY1 + ".");
        for (int i1 = 0; i1 < 10; i1++) {
            int populationIncrease1 = (fertilityPerThousand1 - mortalityPerThousand1) * populationCountryY1 / 1000;
            populationCountryY1 = populationCountryY1 + populationIncrease1;
            year1++;
            System.out.println("Год " + year1 + " численность населения составляет " + populationCountryY1 + ".");
        }
        // Task 4/5
        System.out.println("Task 4/5");
        int salary1 = 15_000;
        int total1 = 0;
        float salary2 = salary1 * 0.07F;
        int month1 = 1;
        System.out.println("Месяц " + month1 + ", сумма накоплений равна " + salary1 + " рублей.");

        while (total1 < 12_000_000) {
            month1++;
            total1 = total1 + salary1;
            total1 = (int) (total1 + (salary2));

            if (month1 % 6 == 0)
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + total1 + " рублей.");
        }
        // Task 6
        System.out.println("Task 6");
        int salary3 = 15_000;
        int total3 = 0;
        float salary4 = salary3 * 0.07F;
        int month3 = 1;
        System.out.println("Месяц " + month3 + ", сумма накоплений равна " + salary3 + " рублей.");

        while (month3 < 108) {
            month3++;
            total3 = total3 + salary3;
            total3 = (int) (total3 + (salary4));
            if (month3 % 6 == 0)
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + total3 + " рублей.");
        }
        // Task 7
        System.out.println("Task 7");
        int firstFriday = 2;
        for (; firstFriday < 31; firstFriday += 7) {
            System.out.println("Сегодня пятница, " + firstFriday + " число. Необходимо подготовить отчет.");
        }
        // Task 8
        System.out.println("Task 8");
        int currentYear = 2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int period = 79;
        for (; startYear <= endYear; startYear++) {
            if (startYear % period == 0) {
                System.out.println(startYear);
            }
        }
    }
}




