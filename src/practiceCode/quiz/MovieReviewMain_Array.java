package practiceCode.quiz;

public class MovieReviewMain_Array {

    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];


        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = 5.0;
        movieReviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = 4.0;
        movieReviews[1] = aboutTime;


        System.out.println("영화 제목:" + inception.title + " ,평점:" + inception.review);
        System.out.println("영화 제목:" + aboutTime.title + " ,평점:" + aboutTime.review);

        System.out.println("for-each");

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목:" + movieReview.title + " ,평점:" + movieReview.review);
        }


    }
}
