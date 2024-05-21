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

        //dataA 변경
        dataA.value = 20;
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        //dataB 변경
        dataB.value = 200;
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

    }
}


/* Data dataB = dataA 라고 했을 때, 자바는 "변수에 들어있는 값"을 복사해서 사용하는데,
여기서 변수에 들어있는 값 -> 이 *참조값* 이므로 그 참조값이 복사되는 것임! --> 같은 객체 인스턴스를 참조
 */