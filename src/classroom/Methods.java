package classroom;

public class Methods {
    public static void main(String[] args) {
        calculateSum(44, 20);

        printTextMultiplies("hello", 10);
        printTextMultiplies("my name is erik", 5);
    }
    public static int calculateSum(int x, int y) {
        int z = x + y;
        return z;
    }
    public static void printTextMultiplies(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }

    }
    public static void printAllValuesFromStringArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);

        }
    }
    // Task: Create method that accept int aarray and returns of numbers;

    }
