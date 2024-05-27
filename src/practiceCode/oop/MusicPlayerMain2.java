package practiceCode.oop;


//기능 모듈화

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //켜기
        on(data);

        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //상태 확인
        showStauts(data);
        //플레이어 끄기
        off(data);

        showStauts(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("플레이어 시작");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("플레이어 종료");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("플레이어 볼륨: " + data.volume);
    }

    static void showStauts(MusicPlayerData data) {
        System.out.println("플레이어 현재 상태 확인");
        if (data.isOn) {
            System.out.println("플레이어 켜져있음, 볼륨: " + data.volume);
        } else {
            System.out.println("플레이어 꺼져있음");
        }
    }


}
