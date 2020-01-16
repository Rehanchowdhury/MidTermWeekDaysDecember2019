package problemandsolutions;
import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Input first number: ");
        int num1 = in.nextInt();

        System.out.println("Input second number: ");
        int num2 = in.nextInt();


        System.out.println("The adding value is " + (num1 + num2));

        System.out.println("The subtract value is " + (num1 - num2));

        System.out.println("The multiply value is " + (num1 * num2));

        System.out.println("The division value is " +   (num1 / num2));




    }
}

