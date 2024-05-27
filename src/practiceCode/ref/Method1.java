package practiceCode.ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();   //x001(참조값예시)
//        student1.age = 15;
//        student1.grade = 90;
//        student1.name = "학생1";
        initStudent(student1, "학생1", 10, 87);
//        initStudent(x001(참조값예시), "학생1", 10, 87);
//        x001(참조값예시).age = 15;
//        x001(참조값예시).grade = 90;
//        x001(참조값예시).name = "학생1";

        Student student2 = new Student();
//        student2.age = 16;
//        student2.grade = 80;
//        student2.name = "학생2";
        initStudent(student2, "학생2", 17, 60);

        //메서드로 내용 출력하기!

        printStudent(student1);
        printStudent(student2);

    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + "나이:" + student.age + "성적:" + student.grade);

    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}
