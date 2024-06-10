package practiceCode.poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        //Dog,Cat,Caw 는 모두 Ainimal 의 자식이므로 Animal 타입임
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        Animal[] animalArr = {dog, cat, caw, duck};
        //같은 코드 : Animal[] animalArr = new Animal[]{dog, cat, caw, duck};

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
