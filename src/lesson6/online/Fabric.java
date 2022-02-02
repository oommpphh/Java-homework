package Lesson06.online;

import Lesson06.online.models.Car;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.01.2022
 */

public class Fabric {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Toyota", "White", 150, 1.5f, 4, 200);
        Mazda mazda = new Mazda("Mazda", "Red", 250, 3.1f, 400);
        Jeep jeep = new Jeep("Jeep", "Black", 120, 1.4f, 2, 300, 700);

        Mark2 mark2 = new Mark2("Mark2", "Yellow", 900, 50.4f, 6, 766);

//        mark2.move();
//        mark2.goToCity(450);
//        mark2.voice();
//        mark2.passengers();
//        mark2.doSomething();


//        Toyota toyota2 = new Toyota("Toyota2", 4, 999);
//        toyota.move();
//        mazda.move();

//        mazda.voice();
//        mazda.goToCity(240);
//        jeep.loading(450);
//        toyota.refueling(150);
//
//        toyota.passengers();
//        mazda.passengers();
//        jeep.passengers();

        Car[] garage = {toyota, mark2, mazda, jeep};
//        ((Jeep)garage[3]).loading(15.4f);
//        garage[3].move();
        for (int i = 0; i < garage.length; i++) {
//            garage[i].move();
//            garage[i].refueling(150);
            if (garage[i] instanceof Toyota) {
                ((Toyota)garage[i]).doSomething();
            }
        }

    }

}
