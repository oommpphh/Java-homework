package lesson3;

import java.util.Arrays;

public class homework3 {

    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        int[] array01 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(chenging(array01)));

        System.out.println("Задание 2: ");
        int[] arr2 = new int[100];
        System.out.println("Было:" + Arrays.toString(arr2));
        createArr(arr2, 1, 1);
        System.out.println("Стало: " + Arrays.toString(arr2));

        System.out.println("Задание 3: ");
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifierForArrayes(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));

        System.out.println("Задание 4: ");
        createSquareArray(4);

        System.out.println("Задание 5: ");
        printArrayInConsole(retLenArr(5, 10));

        System.out.println("Заданеи 6: ");
        int[] minMaxArray = {2, 4, 22, 13, 51, 100, 166, 351, 6, 2, 86, 5, 3};
        System.out.println(minInArray(minMaxArray));
        System.out.println(maxInArray(minMaxArray));

    }

    public static int[] chenging(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    public static void createArr(int[] array, int step, int shift) {
        for (int i = 0; i < 100; i++) {
            array[i] = shift + i * step;
        }
    }

    public static void modifierForArrayes(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void createSquareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }
    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    public static int minInArray(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    public static int maxInArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
}

