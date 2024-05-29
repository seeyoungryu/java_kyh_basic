package practiceCode.static1;

public class Data3 {
    public static int count; //static --> 메서드 영역에서 관리되는.. static 변수를 사용해서 공용 변수를 관리
    public String name;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
