package Cross;

import java.util.Random;
import java.util.Scanner;

public class Cross {

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerStep();
            printField();
            if(checkWin(PLAYER_DOT)) {
                System.out.println("Player WIN!");
                break;
            }
            if(isDraw()) {
                System.out.println("DRAW");
                break;
            }

            aiStep();
            printField();
            if(checkWin(AI_DOT)) {
                System.out.println("SKYNET WIN!");
                break;
            }
            if(isDraw()) {
                System.out.println("DRAW");
                break;
            }
        }
    }
    static int SIZE_X = 5;
    static int SIZE_Y = 5;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static char PLAYER_DOT = 'X';
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    // заполнить поле
    private static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    // метод для вывода на консоль поля
    private static void printField() {
        System.out.println("    1 2 3 4 5 -> X");
        System.out.println("   -----------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print((i+1) + "  |");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("Y  -----------");
    }

    // метод для установки символа
    private static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    // проверка валидности ячейки
    private static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    // ход человека
    private static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X Y (1 - 3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y,x));
        setSym(y, x, PLAYER_DOT);
    }

    // ход ПК
    private static void aiStep() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellValid(y,x));
        setSym(y, x, AI_DOT);
    }

    /*
     * если не встретили пустую ячейку
     * это значит что все поле заполнено
     * */
    private static boolean isDraw() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if(field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char sym) {
        int countVert = 0;
        int countDiag = 0;
        int countGoriz = 0;
        int keyX = 0;
        int keyY = 0;
        for(int i = 0; i < SIZE_X; ++i){
            for(int j = 0; j < SIZE_Y; ++j){ // проверка элементов рядом по диагонали и вертикали
                if(field[i][j] == sym && (i == 0 || (i == keyX + 1 && j == keyY + 1) || (i == keyX + 1 && j == keyY))){
                    keyX = i;
                    keyY = j;
                    ++countDiag;
                    ++countVert;
                } else if(field[i][j] == sym){
                    ++countGoriz;
                }
                if(countDiag == 4 || countGoriz == 4 || countVert == 4){
                    return true;
                }
            }
            countGoriz = 0;
        }
        return false;
    }
}
