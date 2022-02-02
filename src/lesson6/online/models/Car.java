package Lesson06.online.models;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.01.2022
 */

public abstract class Car {

    protected String model;
    protected String color;
    protected int maxSpeed;
    protected float acceleration;
    protected int countFuel;

    public Car(String model, String color, int maxSpeed, float acceleration, int countFuel) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.countFuel = countFuel;
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void move() {
        System.out.println(model + " has moved with speed " + maxSpeed);
    }

    public void refueling(int count) {
        countFuel += count;
//        System.out.println("Hello");
        System.out.println("Refueling :" + count + " l. Current fuel: " + countFuel);
    }

    public void passengers() {
        System.out.println(model + " transopt passengers");
    }

    public abstract void voice();

    public abstract void goToCity(int distance);


}
