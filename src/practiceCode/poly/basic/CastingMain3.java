package practiceCode.poly.basic;

//upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //원래는 부모가 자식 담을때도 이렇게 해야맞겠지만! 업캐스팅은 생략 가능, 생략 권장
        Parent parent2 = child; //--> 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
