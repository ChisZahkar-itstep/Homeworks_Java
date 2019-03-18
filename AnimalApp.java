package Homework_6;

public class AnimalApp {

    public static void main(String[] args) {
        Dog dog1 = new Dog(600, 0.8,17);
        Dog dog2 = new Dog(600, 0.5, 9);
        Cat cat1 = new Cat(800, 0.8);
        dog1.run(100);
        dog2.run(1000);
        cat1.swim(799);
    }
}
