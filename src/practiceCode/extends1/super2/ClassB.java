package practiceCode.extends1.super2;

public class ClassB extends ClassA {


    /* 자바에서
    -정의된 생성자가 없으면 기본생성자 자동으로..
    -정의된 생성자가 있는 경우엔 기본생성자 자동으로 만들지 않는다
     */
    public ClassB(int a) {
        this(a, 0); //내 생성자 로직을 내가 호출함 --> 나의 다른 생성자 호출해줘!
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
