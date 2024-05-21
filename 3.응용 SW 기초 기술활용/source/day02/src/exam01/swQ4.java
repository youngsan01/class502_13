package exam01;

public class swQ4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println("단,========");
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
        }
    }
}