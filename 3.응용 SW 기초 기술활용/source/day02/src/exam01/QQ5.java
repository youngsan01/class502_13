package exam01;

public class QQ5 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단======");
            for (int j =2; j <=9; j++) {
                if( i > j ) {
                    continue;
                }

                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
        }
    }
}
