package homeworks;

import org.w3c.dom.ls.LSOutput;

public class ArrayUtil {
    public static void main(String[] args) {
        // Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
// Խնդիր 2 — Տպել առաջին էլեմենտը
        System.out.println("First element: " + numbers[0]);

// Խնդիր 3 — Տպել վերջին էլեմենտը
        System.out.println("Las element: " + numbers[numbers.length - 1]);

        //Խնդիր 4 — Տպել զանգվածի երկարությունը
        System.out.println("Array length: " + numbers.length);

        // Խնդիր 5 — Գտնել ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);

        //Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
        int length = numbers.length;
        if (length <=2) {
            System.out.println("Can't print middle values");
        }

    }
}