package Homework_4;

import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        culc();
    }
    private static void culc() {
        String[] str;
        int sum = 0;
        do {
            str = scanner.nextLine().split(" ");
        } while (isValid(str));
        for (int i = 0; i < str.length; ++i) {
            if (str[i].equals("/")) {
                int n1 = Integer.parseInt(str[i - 1]);
                int n2 = Integer.parseInt(str[i + 1]);
                if (n2 == 0) {
                    System.out.println("Делить на 0 нельзя");
                    i = str.length - 1;
                    break;
                }
                sum = n1 / n2;
            } else if (str[i].equals("*")) {
                int n1 = Integer.parseInt(str[i - 1]);
                int n2 = Integer.parseInt(str[i + 1]);
                sum = n1 * n2;
            }
        }
        for (int i = 0; i < str.length; ++i) {
            if (str[i].equals("+")) {
                if (i - 1 == 0) {
                    int n1 = Integer.parseInt(str[i - 1]);
                    sum = sum + n1;
                } else {
                    int n1 = Integer.parseInt(str[i + 1]);
                    sum = sum + n1;
                }
            } else if (str[i].equals("-")) {
                if (i - 1 == 0) {
                    int n1 = Integer.parseInt(str[i - 1]);
                    sum = sum - n1;
                } else {
                    int n1 = Integer.parseInt(str[i + 1]);
                    sum = sum - n1;
                }
            }
        }
        System.out.println(sum);
    }
    private static boolean isValid(String[] str) {
        boolean flag = true;
        try{
            do{
                for (int i = 0; i < str.length; ++i) {
                    if(i % 2 == 0){
                        int a = Integer.parseInt(str[i]);
                    }else if(i % 2 == 1 && str[i].equals("+") || str[i].equals("-") || str[i].equals("*") || str[i].equals("/")){
                        continue;
                    }else{
                        System.out.println("Вводятся только цифры и знаки оператора (+ - * /) через пробел!!!");
                        return true;
                    }
                    if(i == str.length - 1){
                        flag = false;
                    }
                }

            }while(flag);
        } catch(Exception e) {
            System.out.println("Вводятся только цифры и знаки оператора (+ - * /) через пробел!!!");
            return true;
        }
        return false;
    }
}