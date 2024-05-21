package exam02;

public class Ex04 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());

        Jucier.make2(appleBox); // Apple, Fruit, Object

        //FruitBox<Grape> grapeBox = new FruitBox<>();
        FruitBox<Fruit> grapeBox = new FruitBox<Fruit>();
        grapeBox.add(new Grape());
        Jucier.make2(grapeBox);
    }
}
