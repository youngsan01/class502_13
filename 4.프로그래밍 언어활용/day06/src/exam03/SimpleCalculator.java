package exam03;

public class SimpleCalculator implements Calculator {

    public int add(int num1, int num2) { // public밖에 추가 안됨;
        return num1 + num2;
    }
}
