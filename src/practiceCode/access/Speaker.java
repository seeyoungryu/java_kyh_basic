package practiceCode.access;

public class Speaker {


    private int volume;
    /*
    private 접근 제어자
    - 이 필드에 대한 모든 외부호출을 막는다
    - 현재 클래스 내부에서만 이 필드를 호출 가능하다

    cf) int volume -> default(package-private) : 같은 패키지 안에서의 호출 허용

    * 접근 제어자의 사용 위치 : 필드(멤버변수),메서드,생성자 -- 일부 클래스 레벨
     */


    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
