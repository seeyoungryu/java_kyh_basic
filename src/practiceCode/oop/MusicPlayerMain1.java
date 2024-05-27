package practiceCode.oop;


//<절차지향 코드 예시>
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //켜기
        isOn = true;
        System.out.println("플레이어 시작");

        //볼륨 증가
        volume++;
        System.out.println("플레이어 볼륨" + volume);
        //볼륨 증가
        volume++;
        System.out.println("플레이어 볼륨" + volume);
        //볼륨 감소
        volume--;
        System.out.println("플레이어 볼륨" + volume);

        //현재 플레이어 상태
        System.out.println("플레이어 현재 상태 확인");
        if (isOn) {
            System.out.println("플레이어 켜져있음, 볼륨: " + volume);
        } else {
            System.out.println("플레이어 꺼져있음");
        }

        //플레이어 끄기
        isOn = false;
        System.out.println("플레이어 종료");

    }
}
