public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte x = 127;
        short i = 128;
        int y = 32768;
        long a = 2147483648L;
        float b = (float) 1.4;
        double c = 0.77777777;
        System.out.println("Значение переменной х " + "с типом " + "byte " + "ровно " + x);
        System.out.println("Значение переменной i " + "с типом " + "short " + "ровно " + i);
        System.out.println("Значение переменной y " + "с типом " + "int " + "ровно " + y);
        System.out.println("Значение переменной a " + "с типом " + "long " + "ровно " + a);
        System.out.println("Значение переменной b " + "с типом " + "float " + "ровно " + b);
        System.out.println("Значение переменной c " + "с типом " + "double " + "ровно " + c);
        // перечтиал задание и решил только объявить переменные и не давать им значения как указано в задаче
        byte х1;
        short i1;
        int y1;
        long a1;
        float b1;
        double c1;
        System.out.println("Значение переменной х1 " + "с типом " + "byte " + "ровно от -128 до 127");
        System.out.println("Значение переменной i1 " + "с типом " + "short " + "ровно от -32 768 до 32 767");
        System.out.println("Значение переменной y1 " + "с типом " + "int " + "ровно от -2 147 483 648 до 2 147 483 647");
        System.out.println("Значение переменной a1 " + "с типом " + "long " + "ровно от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807");
        System.out.println("Значение переменной b1 " + "с типом " + "float " + "ровно от -3.4Е+38 до 3.4Е+38");
        System.out.println("Значение переменной c1 " + "с типом " + "double " + "ровно от -1.7Е+308 до 1.7Е+308");
        // Если я правильно понял, то второй варинат выполнения задачи правильный (наверное)
        // Задача 2
        float x2 = 27.12f;
        long i2 = 987678965549L;
        float y2 = 2.786f;
        short a2 = 569;
        short b2 = -159;
        short c2 = 27897;
        byte d = 67;
        // Задача 3
        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int totalPages = 480;
        int pagesPerStudent = totalPages/(teacher1+teacher2+teacher3);
        System.out.println("На каждого ученика рассчитано "+ pagesPerStudent +" листов бумаги.");
        // Задача 4
        int bottlesInTwoMine = 16;
        int timeInMin = 2;
        int bottlesPerMin = bottlesInTwoMine / timeInMin;
        int timeInMin20 = 20;
        int totalBottlesInTwentyMin = timeInMin20 * bottlesPerMin;
        System.out.println("За " + timeInMin20 + " минут машина произвела " + totalBottlesInTwentyMin + " штук бутылок.");
        int timeDayMin = 24 * 60;
        int totalBottlesOneDay = timeDayMin * bottlesPerMin;
        System.out.println("За сутки машина произвела " + totalBottlesOneDay + " штук бутылок.");
        int timeThreeDay = timeDayMin * 3;
        int totalBottlesThreeDay = timeThreeDay * bottlesPerMin;
        System.out.println("За 3 дня машина произвела " + totalBottlesThreeDay + " штук бутылок.");
        int timeOneMonth = timeDayMin * 30;
        int totalBottlesOneMonth = timeOneMonth * bottlesPerMin;
        System.out.println("За 1 месяц машина произвела " + totalBottlesOneMonth + " штук бутылок."); // Если брать 30 дней в месяце, а не 28 или 31
        // Задача 5
        int totalCan = 120;
        int whiteCanPerClass = 2;
        int brownCanPerClass = 4;
        int canPerClass = whiteCanPerClass + brownCanPerClass; //всего банок на один класс
        int totalClasses = totalCan / canPerClass; // всего классов в школе
        int totalBrownCan = totalClasses * brownCanPerClass; //всего коричневых банок краски куплено
        int totalWhiteCan = totalClasses * whiteCanPerClass; // всего белых банок краски куплено
        System.out.println("В школе, где " +totalClasses + " классов, нужно " + totalWhiteCan + " банок белой краски и " + totalBrownCan + " банок коричневой краски.");
        // Задача 6
        int banana = 5;
        int weightBanana = 80;
        int weightBananas = banana * weightBanana;
        int volumeMilk = 200;
        int weightPerVolume100 = 105;
        int weightMilk = weightPerVolume100 * volumeMilk / 100; // делим на 100 , так как вес указан на 100 грамм, а у нас 200 грамм
        int ice = 2;
        int weightOneIce = 100;
        int weightIce = ice * weightOneIce;
        int egg = 4;
        int weightEgg = 70;
        int totalWeightEgg = egg * weightEgg;
        int totalFood = (weightBananas + weightMilk + totalWeightEgg + weightIce);
        float totalFoodKg = (float) (totalFood / 1000);
        System.out.println("Общий вес спортзавтрака составит " + totalFood + " грамм или " + totalFoodKg + " киллограм." );
        // Задача 7
        int weightNeedToLose = 7;
        float weightLose1 = 0.25F;
        float weightLose2 = 0.5F;
        int daysToLoseWeight1 = (int) (weightNeedToLose / weightLose1);
        int daysToLoseWeight2 = (int) (weightNeedToLose / weightLose2);
        System.out.println("Если спортсмен будет терять по " + weightLose1 + " кг в день, то потребуется " + daysToLoseWeight1 +" дней." +
                " А если по " +weightLose2 + " кг в день ,то потребуется " + daysToLoseWeight2 + " дней.");
        //Задача 8
        int employeeSalary1 = 67760;
        int employeeSalary2 = 83690;
        int employeeSalary3 = 76230;
        int increasedEmployeeSalary1 = (int) (employeeSalary1 * 1.1);
        int increasedEmployeeSalary2 = (int) (employeeSalary2 * 1.1);
        int increasedEmployeeSalary3 = (int) (employeeSalary3 * 1.1);
        int employeeSalaryYearBefore1 = employeeSalary1 * 12;
        int employeeSalaryYearBefore2 = employeeSalary2 * 12;
        int employeeSalaryYearBefore3 = employeeSalary3 * 12;
        int employeeSalaryYearNow1 = increasedEmployeeSalary1 * 12;
        int employeeSalaryYearNow2 = increasedEmployeeSalary2 * 12;
        int employeeSalaryYearNow3 = increasedEmployeeSalary3 * 12;
        int differenceYear1 =employeeSalaryYearNow1%employeeSalaryYearBefore1;
        int differenceYear2 =employeeSalaryYearNow2%employeeSalaryYearBefore2;
        int differenceYear3 =employeeSalaryYearNow3%employeeSalaryYearBefore3;
        System.out.println("Маша теперь получает " +(increasedEmployeeSalary1) + " рублей в месяц." +
                " Годовой доход вырос на " + differenceYear1 + " рублей.");
        System.out.println("Денис теперь получает " +(increasedEmployeeSalary2) + " рублей в месяц." +
                " Годовой доход вырос на " + differenceYear2 + " рублей.");
        System.out.println("Кристина теперь получает " +(increasedEmployeeSalary3) + " рублей в месяц." +
                " Годовой доход вырос на " + differenceYear3 + " рублей.");
            }
}