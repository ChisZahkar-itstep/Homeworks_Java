package Homework_3;

import java.util.Scanner;

public class Homework_3 {

    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int hiddenNumber = 0;
        int status = 3;
        hiddenNumber = randomNumber(hiddenNumber);
        System.out.print("Угадайте число от 0 до 9. ");
        checkStatus(status);
        for(status = 3; status > 0;){
            int enteredNumber = scanner.nextInt();
            if(hiddenNumber == enteredNumber){
                System.out.println("Вы отгадали!");
                break;
            } else{
                System.out.println("Неверно!");
                --status;
                checkStatus(status);
            }
        }
    }
    private static int randomNumber(int hiddenRandom){
        return hiddenRandom = (int)Math.ceil(Math.random() * 9);
    }
    private static void checkStatus(int status){
        System.out.println("У вас " + status + " попытки.");
    }

}
