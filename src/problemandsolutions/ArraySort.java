package problemandsolutions;


import java.util.Scanner;

public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.


    static class BubbleSortExample {
        public static void main(String []args) {
            int num, a, b, temp;
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the number of integers to sort");
            num = input.nextInt();

            int array[] = new int[num];

            System.out.println("Enter " + num + " integers ");

            for (a = 0; a < num; a++)
                array[a] = input.nextInt();

            for (a = 0; a < ( num - 1 ); a++) {
            for (b = 0; b < num - a - 1; b++) {
                if (array[b] > array[b + 1]) {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
            }

            System.out.println("Sorted list of integers");

            for (a = 0; a < num; a++)
                System.out.println(array[a]);
        }
    }







}
