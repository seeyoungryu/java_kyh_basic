package practiceCode.class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1;   //학생을 담을 변수 선언
        student1 = new Student();      // Student 클래스(설계도)를 사용해서 *실제* 메모리에 *실제* 인스턴스(객체 -> studnet1 )를 만듦
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // Student 클래스를 사용해서 *실제* 메모리에 *실제* 인스턴스(객체 -> studnet2 )를 만듦
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        //배열이 참조값을 가지게 됨 ->  참조값을 통해 해당 인스턴스에 접근 할 수 있게 됨 (변수에는 값 자체가 들어있는게 아니고 참조값이 복사되어 들어있는 것임!)
        // *변수에는 인스턴스 자체가 들어가는게 아니고 참조값만 복사되어 들어가는것임

        /* 제일 중요한 개념!
        자바에서 대입은 항상 변수에 들어있는 값을 복사해서 전달한다!
         */
//
//        System.out.println("이름: " + student1.name + "나이 : " + student1.age + "점수: " + student1.grade);
//        System.out.println("이름: " + student2.name + "나이 : " + student2.age + "점수: " + student2.grade);

        System.out.println("이름: " + students[0].name + "나이 : " + students[0].age + "점수: " + students[0].grade);
        System.out.println("이름: " + students[1].name + "나이 : " + students[1].age + "점수: " + students[1].grade);

        System.out.println("참조 경로 출력");
        System.out.println(student1);
        System.out.println(student2);

    }

}
