package practiceCode.quiz;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = 5.0;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = 4.0;

        System.out.println("영화 제목:" + inception.title + " ,평점:" + inception.review);
        System.out.println("영화 제목:" + aboutTime.title + " ,평점:" + aboutTime.review);

    }
}
