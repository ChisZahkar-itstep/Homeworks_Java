package Homework_6;

public class Animal {
    static int mayRun;
    static int maySwim;
    static double mayJump;
    static boolean result;
    public Animal(int mayRun, double mayJump, int maySwim) {
        this.mayRun = mayRun;
        this.mayJump = mayJump;
        this.maySwim = maySwim;
    }
    static void run(int run){
        System.out.print("run: ");
        result = (mayRun >= run) ? true : false;
        System.out.println(result);
    }
    static void swim(int swim){
        System.out.print("swim: ");
        result = (maySwim >= swim) ? true : false;
        System.out.println(result);
    }
    static void jump(double jump){
        System.out.print("jump: ");
        result = (mayJump >= jump) ? true : false;
        System.out.println(result);
    }
}
