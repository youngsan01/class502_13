package exam01;

public class Result {
    public static void main(String[] args) {
        Man manKim = new Man("Kim", 4000); //김씨생성!
        Man manLee = new Man("Lee", 4500); //이씨 생성!

        Cafe1 cafe1 = new Cafe1("별다방"); // 카페1가 별다방인 카페 생성
        manKim.takeCafe1(cafe1); // 김씨가 별다방에감
        manKim.showInfo(); // 김씨 정보 출력
        cafe1.showInfo(); // 카페 정보 출력

        Cafe2 cafe2 = new Cafe2("콩다방"); // 카페2가 콩다방인 카페 생성
        manLee.takeCafe2(cafe2); // 이씨가 콩다방에감
        manLee.showInfo();//이씨 정보 출력
        cafe2.showInfo(); //카페 정보 출력
    }
}
