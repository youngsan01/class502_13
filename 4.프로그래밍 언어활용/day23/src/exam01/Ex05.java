package exam01;

import javax.swing.*;

public class Ex05 {
    public static void main(String[] args) throws InterruptedException{
        String message = JOptionPane.showInputDialog("메시지 입력");
        //블록킹(Blocking)
        System.out.println(message);
        for(int i = 0; i < 10; i++); {
            //System.out.println(i);
            Thread.sleep(1000); // 1초 지연
        }

    }
}
