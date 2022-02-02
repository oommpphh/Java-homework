package Lesson06.online;

import Lesson06.online.models.Car;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.01.2022
 */

public class Jeep extends Car {

    private int countDoor;
    private float maxCargo;
    private float currentCargo;

    public Jeep(String model, String color, int maxSpeed, float acceleration, int countDoor, int countFuel, float maxCargo) {
        super(model, color, maxSpeed, acceleration, countFuel);
        this.countDoor = countDoor;
        this.maxCargo = maxCargo;
        this.currentCargo = 0;
    }

    @Override
    public void voice() {
        System.out.println(model + " beeeeeeeeeeeeeeeeeeeeeeeep");
    }

    @Override
    public void goToCity(int distance) {
        countFuel -= distance / 75 * 2;
        System.out.println(model + " current fuel: " + countFuel);
    }

    public void loading(float countCargo) {
        if (currentCargo + countCargo < maxCargo) {
            currentCargo += countCargo;
            System.out.println("Cargo " + countCargo + " success");
        } else {
            System.out.println("Not enough cargo");
        }
    }

}
