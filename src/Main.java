import java.util.Arrays; // почему это появилось когда я ввел Arrays.toString и что это значит?

public class Main {
    public static void main(String[] args) {
        //task 1
        // 1 массив
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        // 2 массив
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        // 3 массив
        int[] arr3 = {99, 69, 39};
        //task 2
        System.out.println("Задача 2");
        // вывел значение 1 массива
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        // вывел значение 2 массива
        System.out.println();
        System.out.print(arr2[0]);
        for (int i = 1; i < arr2.length; i++) {
            System.out.print(", " + arr2[i]);
        }
        // вывел значение 3 массива
        System.out.println();
        System.out.print(arr3[0]);
        for (int i = 1; i < arr3.length; i++) {
            System.out.print(", " + arr3[i]);
        }
        System.out.println();
        //task 3
        System.out.println("Задача 3");
        // вывел значение 1 массива в обратном порядке
        System.out.print(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            System.out.print(", " + arr[i]);
        }
        // вывел значение 2 массива в обратном порядке
        System.out.println();
        System.out.print(arr2[arr.length - 1]);
        for (int i = arr2.length - 2; i >= 0; i--) {
            System.out.print(", " + arr2[i]);
        }
        // вывел значение 3 массива вы обратном порядке
        System.out.println();
        System.out.print(arr3[arr.length - 1]);
        for (int i = arr3.length - 2; i >= 0; i--) {
            System.out.print(", " + arr3[i]);
        }
        System.out.println();
        // task 4
        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}







