package practiceCode.construct.ex;

public class Book {

    String title; //제목
    String author; //저자
    int page; //페이지 수

    //코드 완성

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book() {
        this("", "", 0);
    }
    // - 기능: 이 생성자는 매개변수 없이 호출될 때 사용됨
    // 내부적으로 this("", "", 0);을 호출하여,
    // 빈 문자열 두 개와 0을 매개변수로 가지는 다른 생성자를 호출
    // - this 키워드를 사용한 생성자 호출은 항상 생성자의 첫 번째 문장에 위치해야 함

    Book(String title, String author) {
        this(title, author, 0);
    }


    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
