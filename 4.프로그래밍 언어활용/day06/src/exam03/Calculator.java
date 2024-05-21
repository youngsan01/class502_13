package exam03;

public interface Calculator { // interface = 메서드(설계, 추상메서드만) public abstract int add(...);
    int num = 10; // public static final 자동 추가
    int add(int num1, int num2); // public abstract 자동으로 추가
}
