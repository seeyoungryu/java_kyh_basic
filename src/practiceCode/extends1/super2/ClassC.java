package practiceCode.extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20);                  //부모가 기본생성자 없으므로 super() 이런식으로 쓰거나 생략 불가! 직접 값 전달해야함
        System.out.println("ClassC 생성자");
    }
}
