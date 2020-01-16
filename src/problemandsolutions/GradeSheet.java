package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {


    // Write a Java program that determines a student’s grade.
        // The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
     //   the following rules:
    //-  if the average score >=90% =>grade=A
    //-  if the average score >= 70% and <90% => grade=B
    //-  if the average score>=50% and <70% =>grade=C
    //-  if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your quiz score please");
                int quizScore=scanner.nextInt();
        System.out.println("Enter your midterm score please");
                int midterm=scanner.nextInt();
        System.out.println("Enter your final  score please");
                int finalScore=scanner.nextInt();
                int avg=(quizScore+midterm+finalScore)/3;


                System.out.print("The student Grade is: ");
                if(avg>=90){
                    System.out.print("A");
                } else if(avg>=70 && avg<90){
                    System.out.print("B");
                } else if(avg>=50 && avg<70){
                    System.out.print("C");
                } else{
                    System.out.print("F");
                }
            }
        }




