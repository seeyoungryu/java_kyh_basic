package practiceCode.final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data();

        //참조 대상의 값은 변경 가능

        System.out.println(data);
        data.value = 10;
        System.out.println(data);
        System.out.println(data.value);
        System.out.println(data);

        data.value = 20;
        System.out.println(data);
        System.out.println(data.value);
        System.out.println(data);
        System.out.println(data.value);
    }
}


/*practiceCode.final1.Data@2f92e0f4
practiceCode.final1.Data@2f92e0f4
10
practiceCode.final1.Data@2f92e0f4
practiceCode.final1.Data@2f92e0f4
20
practiceCode.final1.Data@2f92e0f4
20
*/

//참조 대상만 변경 불가 (주소값=참조값 동일)