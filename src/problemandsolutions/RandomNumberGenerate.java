package problemandsolutions;


import java.util.Random;

public class RandomNumberGenerate {

    public static void main(String[] args) {
        Random rNum = new Random();
        int num = 0;
        while (true) {
            num = rNum.nextInt(9);
            if (num != 0) break;
        }
        System.out.println(num);
    }
}




