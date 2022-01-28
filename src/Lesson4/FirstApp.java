package Lesson04.online;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 22.01.2022
 */

public class FirstApp {

    public static int fieldSizeH;
    public static int fieldSizeW;
    public static char[][] field;

    public static char playerChar = 'X';
    public static char pcChar = 'O';
    public static char emptyChar = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        setupFieldSize();
        createField(fieldSizeH, fieldSizeW);
        currentStatusField();

        while (true) {

            turnX();
            currentStatusField();

            if (checkWinPosition(playerChar)) {
                System.out.println(playerChar + " is win!");
                break;
            }

            if (checkFullField()) {
                System.out.println("Draw");
                break;
            }

            turnO();
            currentStatusField();
            if (checkWinPosition(pcChar)) {
                System.out.println(pcChar + " is win!");
                break;
            }

            if (checkFullField()) {
                System.out.println("Draw");
                break;
            }
        }

        System.out.println("Game over!");
    }

    public static void setupFieldSize() {
        fieldSizeH = getValueFromUser("Enter field size") + 1;
        fieldSizeW = fieldSizeH;
    }

    public static void turnX() {

        int x;
        int y;

        do {
            x = getValueFromUser("Enter your turn X");
            y = getValueFromUser("Enter your turn Y");
        } while (!checkTurnPlayer(y, x) || !checkEmptyFieldCell(y, x));

        field[y][x] = playerChar;

    }

    public static void turnO() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldSizeW);  //random > nextInt > [0;3)
            y = random.nextInt(fieldSizeH);
        } while (!checkEmptyFieldCell(y, x));

        field[y][x] = pcChar;

    }

    public static int getValueFromUser(String msg) {
        System.out.print(msg + " > ");
        return scanner.nextInt() - 1;
    }

    public static void createField(int height, int wight) {
        field = new char[height][wight];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < wight; x++) {
                field[y][x] = emptyChar;
            }
        }
    }

    public static void currentStatusField() {
        System.out.println("=== FIELD ===");
        for (int y = 0; y < fieldSizeH; y++) {
            for (int x = 0; x < fieldSizeW; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("=============");
    }

    public static boolean checkEmptyFieldCell(int y, int x) {
        return field[y][x] == emptyChar;
    }

    public static boolean checkTurnPlayer(int y, int x) {
        return x >= 0 && x < fieldSizeW && y >= 0 && y < fieldSizeH;
    }

    public static boolean checkWinPosition(char checkChar) {
        if (field[0][0] == checkChar && field[0][1] == checkChar && field[0][2] == checkChar) return true;
        if (field[1][0] == checkChar && field[1][1] == checkChar && field[1][2] == checkChar) return true;
        if (field[2][0] == checkChar && field[2][1] == checkChar && field[2][2] == checkChar) return true;

        if (field[0][0] == checkChar && field[1][0] == checkChar && field[2][0] == checkChar) return true;
        if (field[0][1] == checkChar && field[1][1] == checkChar && field[2][1] == checkChar) return true;
        if (field[0][2] == checkChar && field[1][2] == checkChar && field[2][2] == checkChar) return true;

        if (field[0][0] == checkChar && field[1][1] == checkChar && field[2][2] == checkChar) return true;
        if (field[0][2] == checkChar && field[1][1] == checkChar && field[2][0] == checkChar) return true;

        return false;
    }

    public static boolean checkFullField() {
        for (int y = 0; y < fieldSizeH; y++) {
            for (int x = 0; x < fieldSizeW; x++) {
                if (field[y][x] == emptyChar) {
                    return false;
                }
            }
        }
        return true;
    }


}
