package Homework_5;

import jdk.internal.cmm.SystemResourcePressureImpl;

public class Lesnik {
    static String input = "5 1 5 2 2 4 1 4 5 1 5 3 2 4 4 4 5 1 3 4 2 2 1 2 4 4 4 5 4 3 5 4 4 5 5 1 4 1 5 3 1 4 5 3 3 4 2 2 4 4 5 5 1 1 1 4 5 5 " +
            "4 4 2 4 3 1 3 3 1 1 3 1 3 4 4 3 2 2 1 3 4 4 2 3 4 2 4 4 1 4 4 4 2 1 2 4 1 5 2 2 5 4 2 2 3 1 5 5 3 5 3 1 4 5 4 2 1 3" +
            " 1 2 1 4 1 3 4 2 2 5 2 3 1 1 2 3 3 4 4 2 4 1 2 2 2 5 1 5 1 2 2 1 3 3 4 3 5 3 5 1 2 1 3 3 2 4 1 4 3 5 1 2 1 2 3 2 1 3" +
            " 2 2 4 3 2 1 5 1 4 5 4 4 5 5 4 2 3 5 1 3 4 3 2 4 5 2 5 2 4 1 4 5 2 3 3 4 4 3 5 2 2 3 5 1 2 4 3 4 4 3 2 2 1 4 5 5 1 5" +
            " 2 4 5 5 4 2 2 1 5 1 3 4 2 4 2 2 4 3 5 2 2 4 4 4 5 5 2 5 5 2 5 1 1 5 5 4 1 2 4 1 2 2 5 4 5 1 5 4 4 5 5 5 3 3 4 3 3 5" +
            " 3 2 2 2 2 2 1 2 5 2 3 4 3 5 5 2 4 5 3 4 3 1 3 2 1 1 5 4 4 2 3 1 3 4 2 4 1 3 5 1 5 3 5 2 3 4 4 1 3 1 5 5 1 2 2 1 3 1" +
            " 5 1 2 2 1 5 1 3 3 2 1 3 2 5 1 1 2 3 5 5 4 3 1 3 3 1 5 4 2 3 4";
    static String[] strNumbers = input.split(" ");
    static int lengthString = strNumbers.length - 1;
    static  int[] numbers = strToInt();
//    static int diapMin = minNumber();
    static int diapMax = maxNumber();
    static int[][] result = new int[diapMax][1];

    public static void output() {
        for (int j = 0; j < diapMax; ++j) {
            int counter = 0;
            for (int i = 0; i < numbers.length; ++i) {
                if(numbers[i] == j + 1){
                    result[j][0] = ++counter;
                }
            }
            System.out.print((j + 1) + " -> " + result[j][0] + "; ");
        }
    }
    private static int minNumber(){
        int min = numbers[0];
        for (int i = 1; i < numbers.length; ++i) {
            if(min > numbers[i]) min = numbers[i];
        }
        return min;
    }

    private static int maxNumber(){
        int max = numbers[0];
        for (int i = 1; i < numbers.length; ++i) {
            if (max < numbers[i]) max = numbers[i];
        }
        return max;
    }

    private static int[] strToInt(){
        int[] numbers = new int[strNumbers.length];
        for(int i = 0; i <= lengthString; ++i){
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        return numbers;
    }
}
