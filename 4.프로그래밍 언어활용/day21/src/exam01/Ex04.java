package exam01;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("score.txt");
             DataInputStream dis = new DataInputStream(fis)) {
             int total = 0, cnt = 0;
             try {
                 while (true){
                     int score = dis.readInt();
                     total += score;
                     cnt++;
                 }
                 



            while (true) {
                int score = dis.readInt();
                System.out.println(score);
            }
        } catch (EOFException e) { // 파일을 다 읽은 상태

        }
    } catch (IOException e) {
            e.printStackTrace();
        }
}
