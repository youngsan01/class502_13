package exam01;

public enum Transportation {
    BUS(1400), //상수
    SUBWAY(4500), //상수
    TAXI(1300); // 상수

    private final int fare;

    Transportation(int fare) {
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    //   public abstract int getTotal(int person);
}
