package Homework_5;

public class Workers {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Workers(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void workersInfo(){
        System.out.println(fullName + " " + position + " " + email + " " + phoneNumber + " " + salary + " " + age);
    }
}
