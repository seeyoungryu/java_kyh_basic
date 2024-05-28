package practiceCode.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        this.nameField = nameParameter;
        //현재 매개변수에 해당 변수의 이름 x 이므로 자동으로 멤버변수로 매칭됨 -> nameField = nameParameter; 라고만 써도 무방한 상태임 지금은
    }
}
