package exam01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("scores.txt"));
        //sc.useDelimiter("\r\n");
        while (sc.hasNext()){
            int score = sc.nextInt();
            System.out.println(score);
        }
    }
}
