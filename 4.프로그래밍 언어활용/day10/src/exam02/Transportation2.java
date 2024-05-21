package exam02;

public abstract class Transportation2 /*extends java.lang.Enum*/ {
    private static final Transportation2 BUS = new Transportation2(){};
    private static final Transportation2 SUBWAY = new Transportation2(){};
    private static final Transportation2 TAXI= new Transportation2(){};

    private Transportation2() {}
}
