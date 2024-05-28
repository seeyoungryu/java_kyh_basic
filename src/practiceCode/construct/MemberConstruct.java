package practiceCode.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    /*
    생성자 (객체 초기화를 위한 메서드라고 생각하면 됨)
    - 클래스 이름과 같다(->첫 글자도 대문자로 시작함)
    - 반환타입이 없다

    ! ! !  객체를 생성할ㄷ 때 직접 정의한 생성자가 있었다면
    -> 직접 정의한 생성자를 반드시 호출한다 - 강제 ! ! !

     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    //추가 - 생성자 오버라이딩
    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }
}
