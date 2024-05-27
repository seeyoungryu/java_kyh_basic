package practiceCode.oop1;


//*클래스에 속성과 메서드(기능)를 정의할 수 있다*
public class ValueData {
    int value;

    void add() {         //메서드는 객체를 만들어야 사용할 수 있다 (static 안붙어있음 현재)
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
