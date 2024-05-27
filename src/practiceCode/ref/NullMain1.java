package practiceCode.ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1.data=" + data);
        //결과값: 1.data=null -> null : 참조할 수 있는 객체가 없다는 뜻
        data = new Data();
        System.out.println("2.data=" + data);
        data = null;
        System.out.println("2.data=" + data);
    }
}
