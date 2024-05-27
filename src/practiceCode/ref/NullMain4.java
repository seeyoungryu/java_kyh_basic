package practiceCode.ref;

public class NullMain4 {
    public static void main(String[] args) {
            /*
                public class Data {
                int value;
                }
            */
        BigData bd = new BigData();
        bd.data = new Data();

        System.out.println(bd.count); //0
        System.out.println(bd.data); //null -> practiceCode.ref.Data@28a418fc

        System.out.println(bd.data.value);
    }
}
