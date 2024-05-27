package practiceCode.ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bd = new BigData();
        System.out.println(bd.count); //0
        System.out.println(bd.data); //null

        System.out.println(bd.data.value);
    }
}
