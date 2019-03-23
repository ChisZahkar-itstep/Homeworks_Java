package Homework_2;

import java.util.Arrays;

public class Homework_2 {

    public static void main(String[] args) {
        int [] leftAndRight = {4,6,3,8,7,1,5,2,4,2};
        int n = -2;
        oneAndNull();
        stepThree();
        multipliToTwo();
        oneInDiagonal();
        minAndMax();
        System.out.println(checkBalance(leftAndRight));
        displacementElements(leftAndRight, n);  // для решения воспользовался тем же массивом
    }
    private static void oneAndNull() {
        int[] oneAndNull = {1, 0, 0, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < oneAndNull.length; ++i) {
            System.out.print(oneAndNull[i] = (oneAndNull[i] == 0) ? 1 : 0);
        }
        System.out.println();
    }
    private static void stepThree(){
        int [] stepThree = new int[8];
        int step = 0;
        for(int i = 0; i < stepThree.length; ++i){
            stepThree[i] = step;
            step += 3;;
        }
        System.out.println(Arrays.toString(stepThree));
    }
    private static void multipliToTwo(){
        int [] multipliToTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int counter = 0;
        for(int i = 0; i < multipliToTwo.length; ++i) if(multipliToTwo[i] < 6) multipliToTwo[i] *= 2;
        System.out.println(Arrays.toString(multipliToTwo));
    }
    private static void oneInDiagonal(){
        int [] [] oneInDiagonal = new int [6] [6];
        int counter = 1;  // будет увеличиваться на 1 и тем самым сдвигать единицу на 1 символ влево
        for(int i = 0; i < oneInDiagonal.length; ++i){
            for(int j = 0; j < oneInDiagonal[i].length; ++j){
                int res;
                System.out.print((res = (j == i || j == oneInDiagonal[i].length - counter) ? 1 : 0) + " ");
            }
            ++counter;
            System.out.print("\n");
        }
    }
    private static void minAndMax() {
        int[] minAndMax = {6,35,41,29,84,56,17,67,43,99};

        int max = minAndMax[0];  // переменная для хранения найденного на данный момент максимального числа
        int min = minAndMax[0];  // переменная для хранения найденного на данный момент минимального числа
        for (int i = 1; i < minAndMax.length; ++i) {
            if (max < minAndMax[i]) max = minAndMax[i];
            else if (min > minAndMax[i]) min = minAndMax[i];
        }
        System.out.println("Максимальное число в массиве " + max + ", а минимальное " + min);
    }
    private static boolean checkBalance(int [] leftAndRight){
        int sum = 0; // переменная для хранения общей суммы элементов
        int right = 0; // переменная для хранения суммы элементов правой части
        int left = 0; // переменная для хранения суммы элементов левой части{
        for(int number : leftAndRight) sum += number;
        for(int i = leftAndRight.length - 1; i >= 0; --i){
            left += leftAndRight[i];
            right = sum - left;
            if(left == right){
                return true;
            }
        }
        return false;
    }
    private static void displacementElements(int [] displacement, int n){
        if(n < 0){
            for(int i = (n * -1); i <= displacement.length - 1; ++i){
                displacement[i + n] = displacement[i];
                displacement[i] = 0;  // на место смещённых элементов поставил 0
            }
        }else {
            for(int i = displacement.length - n - 1; i >= 0; --i) {
                displacement[i + n] = displacement[i];
                displacement[i] = 0; // аналогично
            }
        }
        System.out.println(Arrays.toString(displacement));
    }
}