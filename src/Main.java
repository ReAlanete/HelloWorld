import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        // решение через for each
        int[] expenses = {55, 77, 22, 11, 33};
        int expensesMonth = 0;
        for (int expense : expenses) {
            expensesMonth += expense;
        }
        System.out.println("Сумма трат за месяц составила " + expensesMonth + " рублей.");
        // Task 2
        // нахождение максимума
        System.out.println("Task 2");
        int[] expensesWeek = Arrays.copyOf(expenses, expenses.length);
        int expensesMax = -1;
        for (int current : expensesWeek) {
            if (current > expensesMax) {
                expensesMax = current;
            }
        }
        // нахождение минимума
        int expensesMin = expensesWeek[0];
        for (int current : expensesWeek) {
            if (current < expensesMin) {
                expensesMin = current;
            }
        }
        // решение через Arrays.sort (решение для себя)
        Arrays.sort(expensesWeek);
        System.out.println(expensesWeek[0] + " min");
        System.out.println(expensesWeek[expensesWeek.length - 1] + " max");
        System.out.println("Минимальная сумма трат за неделю составила " + expensesMin + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + expensesMax + " рублей.");
        // Task 3
        System.out.println("Task 3");
        int[] expensesWeek2 = Arrays.copyOf(expenses, expenses.length);
        int totalExpenses = 0;
        for (int expense : expensesWeek2) {
            totalExpenses += expense;
        }
        float expensesAverage = (float) totalExpenses / expensesWeek2.length;
        System.out.println("Средняя сумма трат за месяц составила " + expensesAverage + " рублей.");
        // Task 4
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
        }
    }
}






