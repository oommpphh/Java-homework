package Lesson06.online;

import Lesson06.online.models.Car;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.01.2022
 */

public class Toyota extends Car {

    private int countDoor;

    public Toyota(String model, String color, int maxSpeed, float acceleration, int countDoor, int countFuel) {
        super(model, color, maxSpeed, acceleration, countFuel);
        this.countDoor = countDoor;
    }

    public Toyota(String model, int countDoor, int something) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("Moved");
    }

    @Override
    public void voice() {
        System.out.println(model + " beep-beep");
    }

    @Override
    public void goToCity(int distance) {
        countFuel -= distance / 100 * 2;
        System.out.println(model + " current fuel: " + countFuel);
    }

    public void doSomething() {
        System.out.println("doSomething");
    }
}
