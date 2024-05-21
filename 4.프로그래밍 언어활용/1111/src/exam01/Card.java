package exam01;

public class Card {
    private static int nextCardNumber = 1000; // 다음 할당될 카드 번호
    private int cardNumber; // 카드 고유 번호

    public Card() {
        this.cardNumber = nextCardNumber++; // 다음 카드 번호 할당 후 증가
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        Card card4 = new Card();


        System.out.println("카드 1의 번호: " + card1.getCardNumber());
        System.out.println("카드 2의 번호: " + card2.getCardNumber());
        System.out.println("카드 3의 번호: " + card3.getCardNumber());
        System.out.println("카드 4의 번호: " + card4.getCardNumber());

    }
}
