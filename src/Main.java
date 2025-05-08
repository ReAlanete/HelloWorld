public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 25;
        boolean ageLegal =  age >= 18;
        if (ageLegal){
            System.out.println("Если возраст человека равен " + age +", то он совершеннолетний."); }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");}
        //Возможно я не правильно понял задачу, поэтому напишу "второе понимание"
        if (age < 18) {System.out.println("Если возраст человека равен " + age +", то он не достиг совершеннолетия, нужно немного подождать."); }
        else  {System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");}
        System.out.println("Задача 2");
        int degrees = -25;
        if (degrees <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");}
        else {System.out.println("Сегодня тепло, можно идти без шапки.");}
        System.out.println("Задача 3");
        int speed = 61;
        boolean speedToHigh = speed > 59;
        if (speedToHigh) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");}
        else {System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");}
        System.out.println("Задача 4");
        int age1 = 20;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 +", то ему нужно ходить в детский сад.");}
        else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 +", то ему нужно ходить в школу.");}
        else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 +", то его место в университете.");}
        else  {
            System.out.println("Если возраст человека равен " + age1 +", то ему пора ходить на работу.");}

        System.out.println("Задача 5");
        int age2 = 14;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 +", то ему нельзя кататься на аттракционе.");}
        else if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 +", то ему можно кататься на аттракционе в сопровождении вхрослого.");}
        else  {
            System.out.println("Если возраст ребенка равен " + age2 +", то ему можно кататься на аттракционе без сопровождения вхрослого.");}
        System.out.println("Задача 6");
        int allPlaces = 102;
        int seatPlaces = 60;
        int passengers = 80;
        if (passengers <= seatPlaces) {
            System.out.println("Если в вагоне " + passengers + " пассажира, то в вагоне есть сидячие места.");}
        else if (passengers >= seatPlaces && passengers <= allPlaces) {
            System.out.println("Если в вагоне " + passengers + " пассажира, то в вагоне остались только стоячие места.");}
        else {
            System.out.println("Если в вагоне " + passengers + " пассажира, то мест в вагоне нет.");}
        System.out.println("Задача 7");
        int one = 5;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one);}
        else if (two > one && two > three) {
            System.out.println(two);}
        else {
            System.out.println(three);
        }
    }
}