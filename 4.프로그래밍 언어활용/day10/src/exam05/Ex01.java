package exam05;

import exam03.A;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        appleBox.setItem(new Apple());
       // appleBox.setItem(new Grape());

        Apple apple = appleBox.getItem();
        System.out.println(apple.get());



    }
}
