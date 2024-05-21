package exam02;

public enum Transportation {
    BUS(1350) {
      public int getTotal(int person){
          return getFare() * person;
      }
    };
    //SUBWAY(1450),
    //TAXI(4800);

    private final int fare;

    Transportation(int fare) {
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    public abstract int getTotal(int person);
}
