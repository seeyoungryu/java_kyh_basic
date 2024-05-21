package practiceCode.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;   //학생을 담을 변순 선언
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + "나이 : " + student1.age + "점수: " + student1.grade);
        System.out.println("이름: " + student2.name + "나이 : " + student2.age + "점수: " + student2.grade);

    }

}
