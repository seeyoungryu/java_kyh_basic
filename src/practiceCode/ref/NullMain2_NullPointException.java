package practiceCode.ref;

public class NullMain2_NullPointException {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointException (예외) 발생
        System.out.println("data=" + data.value);
        // -> Cannot assign field "value" because "data" is null
    }
}
