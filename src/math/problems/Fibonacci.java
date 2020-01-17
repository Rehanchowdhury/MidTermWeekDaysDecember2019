package math.problems;

public class Fibonacci {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        public static void main(String[] args) {
            int n = 40, t1 = 0, t2 = 1;
           System.out.print("First " + n + " terms: ");

            for (int i = 1; i <= n; ++i)
            {
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
                System.out.print(t1 + " + ");
            }
        }
    }









