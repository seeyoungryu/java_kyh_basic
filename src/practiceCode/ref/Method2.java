package practiceCode.ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 77);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        //반환타입 Student 인 메소드
        Student student = new Student();
        System.out.println("student 참조값" + student);

        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
        /*
        객체를 생성하는 부분도 이 메서드 안에 포함시켜버림
        -> - 메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 메서드 밖에서 사용할 수 있게 돌려줘야 함
        -> 그래야 메서드 밖에서 이 객체를 사용할 수 있음
        -> 메서드는 호출결과를 반환(리턴)할 수 있으므로 이 기능을 사용해서 만들어진 객체의 참조값을 메서드 밖으로 반환함
         */
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + "나이:" + student.age + "성적:" + student.grade);

    }


}
