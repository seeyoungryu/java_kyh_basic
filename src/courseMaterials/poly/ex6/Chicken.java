package courseMaterials.poly.ex6;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("꼬기오");
    }

    @Override
    public void fly() {
        System.out.println("닭 날기");
    }
}
