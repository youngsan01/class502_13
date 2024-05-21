package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileInputStream fos = new FileInputStream("test1.txt")) {
            for (char ch = 'A'; ch <= 'Z'; ch++){
              //  fos.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
