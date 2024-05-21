package practiceCode.ref;

public class VarChange1 {
    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;

        Data dataB = dataA;

        System.out.println("dataA 의 참조값: " + dataA);
        System.out.println("dataB 의 참조값: " + dataB);
//        dataA 의 참조값: practiceCode.ref.Data@28a418fc
//        dataB 의 참조값: practiceCode.ref.Data@28a418fc
        System.out.println(dataA.value);
        System.out.println(dataB.value);


    }
}
