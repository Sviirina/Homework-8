import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1, 2");
        //Задание 1
        System.out.println("Задание 1");
        int [] number = new int[3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        for (int i = 0; i < number.length ; i++) {
            System.out.print(number[i]);
            if (i != number.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        double [] number2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < number2.length ; i++) {
            System.out.print(number2[i]);
            if (i != number2.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        int [] number3 = {45, 256, 4, 15741, 1};
        for (int i = 0; i < number3.length ; i++) {
            System.out.print(number3[i]);
            if (i != number3.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        System.out.println("Задание 1");
        int [] number4 = new int[3];
        number4 [0] = 1;
        number4 [1] = 2;
        number4 [2] = 3;
        for (int i = number4.length -1; i >= 0 ; i--) {
            System.out.print(number4[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        double [] number5 = {1.57, 7.654, 9.986};
        for (int i = number5.length -1; i >= 0 ; i--) {
            System.out.print(number5[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        int [] number6 = {45, 256, 4, 15741, 1};
        for (int i = number6.length -1; i >= 0 ; i--) {
            System.out.print(number6[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        int [] number7 = {1, 2, 3};
        for (int i = 0; i < number7.length; i++) {
            if (number7[i] % 2 != 0) {
                number7[i] += 1;
            }
        }
        System.out.println(Arrays.toString(number7));

    }
}