package practiceCode.poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유

/*
업캐스팅의 경우 -> 객체를 생성하면 해당 타입의 상위 부모 타입은 모두 생성되기 때문에 문제 발생률 낮음
(위로만 타입을 변경할경우 메모리 상에 인스턴스가 모두 존재하기 때문에)--> 생략도 가능

다운캐스팅의 경우 -> 객체 생성시 부모 타입은 모두 함께 생성되지만 자식 타입은 생성되지 않음 --> *명시적으로 캐스팅 해야함*
 */
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); //문제 없음

        Parent parent2 = new Parent();
        //메모리상에 Child 자체가 없음

        Child child2 = (Child) parent2; //런타임 오류(실행 해야 알 수 있음..) -> ClassCastException

        child2.childMethod(); //실행 불가 : parent2를 다운캐스팅한 child2에도 Child 가 없음
    }
}
