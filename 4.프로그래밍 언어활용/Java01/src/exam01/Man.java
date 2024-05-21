package exam01;

public class Man {
    public String ManName; // 이름
    public int Money; // 돈

    public Man(String manname, int money) { // 이름과 가진 돈을 매개변수로 받는 생성자
        this.ManName = manname;
        this.Money = money;
    }

    public void takeCafe1(Cafe1 cafe1) { // 김씨가 카페1에서 커피를 사면 지불하는 기능을 구현한 메서드
        cafe1.take(4000);

    }

    public void takeCafe2(Cafe2 cafe2){ // 이씨가 카페2에서 커피를 사면 지불하는 기능을 구현한 메서드
        cafe2.take(4500);

    }

    public void showInfo() { // 남자의 현재 정보를 출력하는 메서드
        System.out.println(ManName +"님이" + Money + "원 결제하였습니다.");
    }
}
