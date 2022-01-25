package lesson2;

public class homework2 {

    public static void main(String[] args) {

        System.out.println("Задание 1 " + numbers1(2, 19));
        method2(0);
        System.out.println("Задание 3 " + numbers2( 2));
        method3("текст",9);

    }

    public static boolean numbers1(int one, int two) {
        return (one + two <= 20) && (one + two >= 10);
    }

    public static void method2(int numeric) {
        if (numeric >= 0) {
            System.out.println(numeric + " положительное");
        } else {
            System.out.println(numeric + " отрицательное");
        }
    }

    public static boolean numbers2(int three) {
        return three <= 0;
    }

    public static void method3(String value, int four) {
        for (int i = 1; i <= four; i++) {
            System.out.println("Строка номер " + i + ": " + value);
        }
    }
}
