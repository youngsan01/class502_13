package exam01;

public class QQQ2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            int roomNo = i % 10;
            System.out.printf("학생%d, 방 번호%d%n",i, roomNo);
        }
    }
}
