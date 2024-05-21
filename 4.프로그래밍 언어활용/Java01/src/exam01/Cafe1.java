package exam01;

public class Cafe1 {
    String cafeName; // 카페이름
    int americano; // 손님 수
    int money; // 카페1 수입

    public Cafe1(String cafeName) { // 카페 이름을 매개변수로 받는 생성자
        this.cafeName = cafeName;
    }

    public void take(int money) {
        this.money += money; //카페 수입 증가
        americano++; // 커피 수 증가
    }

    public void showInfo() { // 카페 정보를 출력하는 메서드
        System.out.println(cafeName + "가게의 아메리카노가" + americano + "잔 팔렸고, 수입은 " + money +" 입니다.");
    }
}

