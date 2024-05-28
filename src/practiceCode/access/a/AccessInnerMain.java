package practiceCode.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 (가능)
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 (가능)
        data.defaultField = 2;
        data.defaultMethod();

        //pivate 호출 (불가)

        //innerAccess() 호출 (?)
        data.innerAccess(); //->내부호출로 됨..
    }
}
