package practiceCode.poly.basic;

/*
<다형성 핵심>
-다형적 참조: 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 있는 기능
-메서드 오버라이딩: 기존 기능을 하위 타입에서 새로운 기능으로 재정의
 */
public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();  //부모 타입에 자식 객체 만듦
        poly.parentMethod();

        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다.

        //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //* 부모: 자식타입 참조 가능, 자식 기능 호출 불가 <-> 자식: 부모타입 참조 불가, 부모 기능 호출 가능 *
    }
}
