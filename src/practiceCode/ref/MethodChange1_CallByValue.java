package practiceCode.ref;

public class MethodChange1_CallByValue {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}


//메서드 호출 전: a = 10
//메서드 호출 후: a = 10