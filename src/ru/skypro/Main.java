package ru.skypro;

public class Main {

    public static void main ( String[] args ) {
        int[] arr = generateRandomArray();
        //Задание 1
        int sumTotal = 0;
        for(int sumDay : arr){
            sumTotal += sumDay;
        }
        System.out.println("Сумма трат за месяц составила "+ sumTotal +" рублей");

        //Задание 2
        int maxSpend = 0;
        int minSpend = 200_000;
        for(int spend: arr){
            if(spend>maxSpend){
                maxSpend = spend;
            }
            if(spend<minSpend){
                minSpend = spend;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ minSpend + " рублей."+
                "Максимальная сумма трат за день составила " + maxSpend + " рублей");

        //Задание 3
        float averageSpend = (float)sumTotal/(arr.length);
        System.out.println("Средняя сумма трат за месяц составила " + averageSpend + " рублей");

        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length-1;i>-1;i--){
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
