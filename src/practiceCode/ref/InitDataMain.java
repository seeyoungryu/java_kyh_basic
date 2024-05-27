package practiceCode.ref;

public class InitDataMain {
    public static void main(String[] args) {
        InitData data = new InitData();

        System.out.println("value1=" + data.value1); //인스턴스 -> 자동 초기화됨
        System.out.println("value2=" + data.value2);
    }
}
