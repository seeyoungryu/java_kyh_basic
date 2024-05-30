package practiceCode.extends1.super2;
//최상위 부모 클래스
//초기화는 최상위 부모부터 이루어진다 (자식 생성자의 첫줄에서 부모의 생성자를 호출해야하기 때문이다.
//실행순서 : ClassA -> ClassB -> ClassC

public class ClassA {

    public ClassA() {
        System.out.println("ClassA 생성자");
    }
}
