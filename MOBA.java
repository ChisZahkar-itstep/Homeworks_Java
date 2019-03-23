package MOBA;

import java.util.Scanner;

public class MOBA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continueGame;
        boolean isStep;
        int round = 0;
//        warrior 150-50; assassin - 110-80; healer - 90-20 heal-20
        Hero[] team1 = {new Warrior(150,150,"Боец1",50),
                        new Assasin(110, 110, "Ассассин1",80),
                        new Healer(90, 90,"Лекарь1", 20)};
        Hero[] team2 = {new Warrior(150,150,"Боец2",50),
                        new Healer(90, 90,"Лекарь2", 20),
                        new Assasin(110, 110, "Ассассин2",80)};
        do {
            ++round;
            System.out.println("Раунд: " + round);
            for(int i = 0; i < team1.length; ++i){
                if(team1[i].condition){
                    isStep = team1[i].healing(team1);
                    if(isStep){
                        team1[i].hit(team2);
                    }
                }
                if(team2[i].condition){
                    isStep = team2[i].healing(team2);
                    if(isStep){
                        team2[i].hit(team1);
                    }
                }
            }
            infoTeam(team1);
            infoTeam(team2);
            if(isWin(team1)){
                System.out.println("Команда 2 выиграла!");
                break;
            }else if(isWin(team2)){
                System.out.println("Команда 1 выиграла!");
                break;
            }
            System.out.println("Продолжить игру? Да - 1/Нет - 0");
            continueGame = scanner.nextInt();
        }while(continueGame == 1);
    }
    static boolean isWin(Hero[] team){
        int count = 0;
        for(int i = 0; i < team.length; ++i){
            if(!team[i].condition){
                ++count;
                if(count == team.length){
                    return true;
                }
            }
        }
        return false;
    }
    static void infoTeam(Hero[] team){
        for(int i = 0; i < team.length; ++i){
            if(team[i].condition) {
                System.out.println(team[i].type + " Health: " + team[i].health + " Damage: " + team[i].damage);
            } else{
                System.out.println(team[i].type + " погиб в неравной схватке");
            }
        }
        System.out.println("------------------------------------------------");
    }
}
