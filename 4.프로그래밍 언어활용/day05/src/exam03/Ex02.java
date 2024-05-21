package exam03;

import java.util.Objects;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = {new Human(), new Bird(), new Tiger()};

        for ( Animal animal : animals) {
            animal.move();

            Human human = (Human) animal;
        //    human.reading();
       // } else if (animals instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
       //     tiger.hunting();
        }
    }
}
