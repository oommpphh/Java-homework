package Lesson05.online.models;

import Lesson05.online.Coordinate;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 26.01.2022
 */

public class Gamer {

    private String name;
    private int age;
    private float speed;
    private String color;

    Coordinate coordinate = new Coordinate();
    Weapon weapon = new Weapon();

    public Gamer() {
        System.out.println("Hello i'm constructor");
        run();
    }

    public Gamer(String name) {
        this.name = name;
    }

    public Gamer(String name, int age, float speed, String color) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.color = color;
    }

    int xFromGamerClass;
    int yFromGamerClass;

    public static void doSomething() {
        System.out.println("doSomething");
    }

    public void run() {
        System.out.println(name + " run ...");
        speak();
    }

    private void speak() {
        System.out.println(name + " speak");
    }

    void welcome(String nameOpponent) {
        System.out.println("Hello " + nameOpponent);
    }

    int getSum(int a, int b) {
        return a + b;
    }

//    //Getter
//    public int getAge() {
//        return age;
//    }
//
//    public String getColor() {
//        return color;
//    }

    //Setter
    public void setColor(String color) {
        this.color = color;
    }

    public class Weapon {
        int damage;
        String color;
        Bullet bullet = new Bullet();

        void fire() {
            System.out.println("This weapon get fire");
        }

        public class Bullet {
            int speed;

            void hello() {
                System.out.println("Hello");
            }
        }
    }

}
