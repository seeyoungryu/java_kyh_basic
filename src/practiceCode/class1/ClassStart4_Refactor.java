package practiceCode.class1;

public class ClassStart4_Refactor {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

//        Student[] students = new Student[2];
//        students[0] = student1;
//        students[1] = student2;

        Student[] students = new Student[]{student1, student2};
// Student[] students = {student1, student2};     ---> 같은 의미의 배열 선언임


        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + "나이:" + students[i].age + "점수:" + students[i].grade);
        }

        System.out.println("------같은역할-------");

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name + "나이:" + s.age + "점수:" + s.grade);
        }

        System.out.println("------같은역할-------");

        for (Student s : students) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "점수:" + s.grade);
        }

    }

}
