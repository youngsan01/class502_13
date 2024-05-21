package exam02;

public class Ex02 {
    public static void main(String[] args) {
        DecorateCalculator cal1 = new DecorateCalculator();
        long result1 = cal1.factoral(10L);
        System.out.println(result1);

        DecorateCalculator cal2 = new DecorateCalculator();
        long result2 = cal1.factoral(10L);
        System.out.println(result1);
    }
}
