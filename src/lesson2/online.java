package lesson2;

<<<<<<< HEAD
/**ё
=======
/**
>>>>>>> origin/master
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 15.01.2022
 */

public class online {
    public static int valueFromClass = 10;

    public static void main(String[] args) {
//        int valueFromMethod = 19;
//        System.out.println(valueFromMethod);
//
//        studySwitch();
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);
//        System.out.println(7);

//        for (int i = 1; i <= 7; i += 2) {
//            System.out.println(i);
//        }

//        System.out.println("Result = " + myMath(2, 10));


//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j < ; j++) {
//                for (int k = 0; k < ; k++) {
//                    for (int l = 0; l < ; l++) {
//                        for (int m = 0; m < ; m++) {
//                            for (int n = 0; n < ; n++) {
//                                for (int o = 0; o < ; o++) {
//                                    for (int p = 0; p < ; p++) {
//                                        for (int q = 0; q < ; q++) {
//
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }

//        table(10, 10);
//        int a = 10;
//
//        while (a < 10) {
//            a++;
//            if (a == 5 || a == 7) {
//                continue;
//            }
//
//            if (a == 9) {
//                break;
//            }
//            System.out.print(a + " ");
//        }

        int b = 0;

        do {
            b++;
            if (b == 4 || b == 8) {
                continue;
            }
            if (b == 9) {
                break;
            }
            System.out.print(b + " ");
        } while (b < 10);

//        int abc = 0;

//        for (int i = abc, j = abc, k = abc; i < 10; i++, j++, k--) {
//            int ab1 = 10;
//            int ab2 = 15;
//        }
    }

    public static int myMath(int base, int signature) {
        int result = base;
        for (int i = 1; i < signature; i++) {
            result = result * base;
        }
        return result;
    }

    public static void table(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }


//    private static void studySwitch() {
//        String nameRecipient = "Boris";
//
//        if (nameRecipient == "Alex") {
//            int valueFromBlockIf = 19;
//            System.out.println(valueFromBlockIf);
//            System.out.println("Give letter to Alex");
//        } else if (nameRecipient == "Boris") {
//            System.out.println("Give letter to Boris");
//        } else if (nameRecipient == "Olga") {
//            System.out.println("Give letter to Olga");
//        } else {
//            System.out.println("Go out office");
//        }
//
//        System.out.println("*********");
//
//        switch (nameRecipient) {
//            case "Alex":
//                System.out.println("Give letter to Alex");
//                break;
//            case "Boris":
//                System.out.println("Give letter to Boris");
//                break;
//            case "Olga":
//                System.out.println("Give letter to Olga");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }
//    }
}
