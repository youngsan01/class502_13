package exam02;

public class DecorateCalculator {

    private ImplCalculator calculator = new ImplCalculator();

    public long factoral(long num) {
        long stime = System.nanoTime(); // 공통 추가 기능
        try {
            long result = calculator.factorial(num); // 핵심 기능을 대신 수행

            return result;
        } finally {
            long etime = System.nanoTime(); // 공통 추가 기능
            System.out.printf("걸린시간: %d%n", etime - stime);
        }

        //long result = calculator.factorial(num);


    }
}
