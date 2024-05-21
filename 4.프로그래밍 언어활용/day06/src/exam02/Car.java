package exam02;

public abstract class Car {
    public abstract void start();
    public abstract void press();
    public abstract void turnoff();

    public void run() { // 템플릿 메서드 패턴, final
        start(); // 절차
        press(); // 절차
        turnoff(); // 절차
    }
}
