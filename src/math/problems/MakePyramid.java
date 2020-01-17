package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        for(int i=0; i<8; i++) {
            for(int x=0; x<10-i; x++) {
                System.out.print(" ");
            }
            for(int y=0;y<=i;y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

        }

