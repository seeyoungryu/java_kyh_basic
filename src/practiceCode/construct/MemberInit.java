package practiceCode.construct;


public class MemberInit {
    String name;
    int age;
    int grade;

    /* 기본생성자 --> 매개변수가 없는 생성자
     <    MemberInit(){}   >
      - 클래스에 생성자가 하나도 없으면 자바 컴파일러는 기본 생성자를 자동으로 만들어줌
      - but 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않음
     */


    // <MethodInitMain2 에 정의되었던 메서드>
    //    *static* void initMember(MemberInit member, String name, int age, int grade) {
    //        member.name = name;
    //        member.age = age;
    //        member.grade = grade;
    //    }
    void initMember(String name, int age, int grade) {   //이 메서드는 객체의 초기값을 설정하는 역할을 한다!
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /* this 키워드 (자기 자신의 인스턴를 의미)
    initMember메서드 파라미터의 name 이 아니고
    현재 클래스의 멤버변수(필드값)을 의미함

    --> 멤버변수보다 매개변수가 코드 블록의 더 안쪽에 있기 때문에(범위상 가까운 스코프) 매개변수가 우선순위를 가지므로 .. 멤버변수임을 명시!
     */
}
