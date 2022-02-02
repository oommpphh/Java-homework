package Lesson06.online;

import Lesson06.online.models.Car;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.01.2022
 */

public class Mazda extends Car {

//    private String model;

    public Mazda(String model, String color, int maxSpeed, float acceleration, int countFuel) {
        super(model, color, maxSpeed, acceleration, countFuel);
    }

    @Override
    public void voice() {
        System.out.println(model + " beep-beep-beep");
    }

    @Override
    public void goToCity(int distance) {
        countFuel -= distance / 50 * 2;
        System.out.println(model + " current fuel: " + countFuel);
    }


}
