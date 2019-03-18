package Homework_6;

public class Cat extends Animal{
    public Cat(int mayRun, double mayJump) {
        super(mayRun, mayJump, maySwim);
    }
    static void swim(int swim){
        System.out.print("Коты не плавают");
    }
}
