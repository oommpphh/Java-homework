package homework;


import java.util.Random;

class Animal {
    private static final int SWIM_NO = 0;
    public static final int SWIM_YES = 1;
    public static final int SWIM_FAIL = -1;

    private String type;
    private String name;
    private float run;
    private float jump;
    private float swim;

    Animal(String type, String name, float run, float jump, float swim) {
        Random random = new Random();
        float runDiff = random.nextFloat() * 200 - 100;
        float jumpDiff = random.nextFloat() * 5 - 1;
        float swimDiff = random.nextFloat() * 5 - 2;

        this.type = type;
        this.name = name;
        this.run = run + runDiff;
        this.jump = jump + jumpDiff;
        this.swim = swim + swimDiff;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public float getRun() {
        return run;
    }

    public float getJump() {
        return jump;
    }

    public float getSwim() {
        return swim;
    }

    protected boolean run(float distance) {
        return (distance < run);
    }

    protected boolean jump(float height) {
        return (height < jump);
    }

    protected int swim(float distance) {
        return (distance < swim) ? SWIM_YES : SWIM_NO;
    }
}

class Dog extends Animal {
    Dog(String name, float run, float jump, float swim) {
        super("Dog", name, run, jump, swim);

    }
}

class Cat extends Animal {
    Cat(String name, float run, float jump, float swim) {
        super("Cat", name, run, jump, swim);
    }

    @Override
    protected int swim(float distance) {
        return SWIM_FAIL;
    }
}

public class homework6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bobik", 200, 1.51f, 1);
        Cat cat2 = new Cat("Pushok", 195, 1.72f, 1);
        Dog dog1 = new Dog("Terry", 455, 0.54f, 10);
        Dog dog2 = new Dog("Chilly", 500, 0.75f, 10);

        Animal[] myPets = new Animal[]{cat1, cat2, dog1, dog2};

        float toRun = 350;
        float toJump = 1.5f;
        float toSwim = 5;

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+  World Animal Triathlon Championships  +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("Maraphon: %.1f м. Jump: %.1f м. Swim: %.1f м.\n", toRun, toJump, toSwim);

        for (Animal myPet : myPets) {
            String eventResult;
            String eventScore;
            String nameString = "\n" + myPet.getType() + " " + myPet.getName() + ": ";

            System.out.println(nameString);

            eventResult = String.format("%.2f м. ", myPet.getRun());
            eventScore = myPet.run(toRun) ? "Offset" : "Fail";
            System.out.print("| Maraphon: ");
            System.out.println(eventResult + "Standart: " + toRun + " м. " + eventScore + ".");

            eventResult = String.format("%.2f м. ", myPet.getJump());
            eventScore = (myPet.jump(toJump)) ? "Offset" : "Fail";
            System.out.print("| Jump: ");
            System.out.println(eventResult + "Standart: " + toJump + " м. " + eventScore + ".");

            int swimResult = myPet.swim(toSwim);
            eventResult = String.format("%.2f м. ", myPet.getSwim());
            eventScore = (swimResult == Animal.SWIM_YES) ? "Offset" : "Fail";
            System.out.print("| Swim: ");
            System.out.println((swimResult == Animal.SWIM_FAIL) ? "Cats are afraid of water and don't swim." :
                    eventResult + "Standart: " + toSwim + " м. " + eventScore + ".");
        }
    }
}