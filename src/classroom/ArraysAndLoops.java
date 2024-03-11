package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {
        // Array
        // Bread: MIlk; Eggs ; Fruits;

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7, 9, 10, 6, 5, 4};
        String[] seasons = {"Summer", "Winter", "Autumn", "Spring"};
        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        grades[0] = 2;
        System.out.println(grades[0]);

        System.out.println(Arrays.toString(grades));

        // Create empty array
        int[] emptyArray = new int[4];
        System.out.println(emptyArray);
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));

        //

        String[] name = {"Erik", "Daniel", "Sergejs", "Anna"};
        int[] gradess = {7, 9, 10, 6, 5, 4};
        String names = name[2];
        System.out.println(names);
        grades[0] = 2;
        System.out.println(gradess[0]);
        System.out.println(Arrays.toString(gradess));
        int[] emptyArray1 = new int[4];
        System.out.println(emptyArray1);
        emptyArray1[0] = 1;
        emptyArray1[1] = 2;
        emptyArray1[2] = 3;
        emptyArray1[3] = 4;
        System.out.println(Arrays.toString(emptyArray1));


        //
        String[] names1 = {"Alice", "Bob", "Charlie", "David", "Eve"};
        System.out.println(names1[0]);
        System.out.println(names1[1]);
        System.out.println(names1[2]);
        System.out.println(names1[3]);
        System.out.println(names1[4]);


        //
        double[] empthyDouble = new double[5];
        empthyDouble[0] = 1.3;
        empthyDouble[1] = 1.4;
        empthyDouble[2] = 1.7;
        empthyDouble[4] = 1.1;
        System.out.println(Arrays.toString(empthyDouble));

        // Print numbers from 0 to 10;


        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // for ->

        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }

        for (String s : shoppingList) {
            System.out.println(s);
        }

        // Print numbers from 10 to 0;

        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) {
            System.out.println(counter);
            counter = counter - 1;
        }

      for (int i = 2; i <=100 ; i++) {
          System.out.println(i + " ");
          }
        System.out.println(" ");
      for (int i = 2; i <=100; i++) {
          if(i % 2 == 0) {
              System.out.println(i + " ");
          }
      }





    }
}




















