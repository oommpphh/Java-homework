package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Banana");
        System.out.println("Orange");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = 15;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 101;
        if (value <=0) {
            System.out.println("Красный");
        } else if (value <=1 | value<=100) {
            System.out.println("Жёлтый");
        } else if (value >=101) {
            System.out.println("Зелёный");
        }

    }
    public static void compareNumbers() {
        int a = 9;
        int b = 15;
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
