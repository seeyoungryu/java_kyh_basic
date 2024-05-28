package practiceCode.construct;


public class MemberInit {
    String name;
    int age;
    int grade;

    //추가

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

    /* this 키워드 (현재 클래스에서 의미(?)) - this.name=name;
    initMember메서드 파라미터의 name 이 아니고
    현재 클래스의 멤버변수(필드값)을 의미함 - 자기 자신의 인스턴스 ~

    --> 멤버변수보다 매개변수가 코드 블록의 더 안쪽에 있기 때문에(범위상 가까운 스코프) 매개변수가 우선순위를 가지므로 .. 멤버변수임을 명시!
     */
}
