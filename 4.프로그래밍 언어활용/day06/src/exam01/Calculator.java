package exam01;

public abstract class Calculator {
    int num = 10; // 공통적인 자원

    public Calculator() {
        System.out.println("Calculator 생성자!");
    }

    public abstract int add(int num1, int num2);

    public final void commonMethod() { // 기능 공유, 공통적인 기능, 공통적인 자원 공유가능

    }
}
