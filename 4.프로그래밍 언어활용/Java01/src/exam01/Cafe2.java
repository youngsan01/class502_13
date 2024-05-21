package exam01;

public class Cafe2 {
    String cafeName; // 카페이름
    int latte; // 라떼 수
    int money; // 카페2 수입

    public Cafe2(String cafeName) { // 카페 이름을 매개변수로 받는 생성자
        this.cafeName = cafeName;
    }

    public void take(int money) {
        this.money += money; // 수입증가
        latte++; // 라떼 수 증가
    }

    public void showInfo() { //카페 정보를 출력하는 메서드
        System.out.println(cafeName + "가게의 라떼가" + latte + "잔팔렸고, 수입은" + money + "입니다");
    }
}
