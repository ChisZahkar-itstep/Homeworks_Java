package Homework_3;

import java.util.Scanner;

public class Homework_3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do{
            playGuessTheNumber();
        }while(repeatGame());
        Scanner close;
    }
    private static void playGuessTheNumber(){
        int status = 3;
        System.out.print("Угадайте число от 0 до 9. ");
        int hiddenNumber = (int)Math.ceil(Math.random() * 9);
        checkStatus(status);
        while (status > 0){
            int enteredNumber = scanner.nextInt();
            if (hiddenNumber == enteredNumber) {
                System.out.println("Вы отгадали!");
                break;
            } else {
                --status;
                MoreOrLess(enteredNumber, hiddenNumber);
                checkStatus(status);
            }
        }
    }
    private static void checkStatus(int status){
        System.out.println("У вас " + status + " попыток.");
    }
    private static boolean repeatGame(){
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        boolean repeat = false;
        int answer = scanner.nextInt();
        repeat = (answer == 1) ? true : false;
        return repeat;
    }
    private static void MoreOrLess(int enteredNumber, int hiddenNumber){
        String answer = (enteredNumber > hiddenNumber) ? "Неверно! Загаданное число меньше!" : "Неверно! Загаданное число больше!";
        System.out.println(answer);
    }
}
