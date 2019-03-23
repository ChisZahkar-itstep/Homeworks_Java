package Homework_1;

public class Main {

    public static void main(String[] args) {
        byte b = 1;
        short s = 32500;
        int i = 20000000;
        long l = 2000000000;
        float f = 3.14f;
        double d = 12.3456789;
        char c = '$';
        boolean  bool = true;
        System.out.println("Задание 3 " + calculate(20,30,40,50));
        System.out.println("Задание 4 " + task10and20(7,9));
        System.out.print("Задание 5 ");
        isPositiveOrNegative(-23);
        System.out.print("\n");
        System.out.println("Задание 6 " + isNegative(123));
        helloName("Захар");
        isYearLeap(1945);

    }
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    public static boolean task10and20(int x1, int x2) {
        if((x1 + x2) >= 10 && (x1 + x2) <= 20){
            return true;
        }
        return false;
    }
    public static void isPositiveOrNegative(int x) {
        String str = (x >= 0) ? "Положительное" : "Отрицательное";
        System.out.print(str);
    }
    public static boolean isNegative(int x) {
        boolean result = (x < 0) ? true : false;
        return result;
    }
    public static void helloName(String str){
        System.out.println("Привет, " + str);
    }
    public static void isYearLeap(int year){
        if((year % 4) == 0) {
            if((year % 100) == 0){
                if((year % 400) == 0){
                    System.out.println("Високосный");
                } else {
                    System.out.println("Не високосный"); }
            } else {
                System.out.println("Високосный");
            }
        } else {
            System.out.println("Не високосный");
        }
    }
}