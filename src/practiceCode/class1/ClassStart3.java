package practiceCode.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;   //학생을 담을 변수 선언
        student1 = new Student();      // Student 클래스를 사용해서 *실제* 메모리에 *실제* 인스턴스(객체 -> studnet1 )를 만듦
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // Student 클래스를 사용해서 *실제* 메모리에 *실제* 인스턴스(객체 -> studnet2 )를 만듦
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + "나이 : " + student1.age + "점수: " + student1.grade);
        System.out.println("이름: " + student2.name + "나이 : " + student2.age + "점수: " + student2.grade);

        System.out.println("참조 경로 출력");
        System.out.println(student1);
        System.out.println(student2);

    }

}
