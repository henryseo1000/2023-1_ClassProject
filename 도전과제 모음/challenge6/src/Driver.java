// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Driver {
    public static void main(String[] args) {

        // 첫 번째 텔레비전 객체
        Television t1 = new Television();
        t1.setName("삼성"); // 브랜드 이름 '삼성'
        t1.setOn(true);
        t1.setChannel(1); // 채널 번호를 1로 세팅
        t1.setVolume(6); // 음량을 6으로 세팅
        t1.printAll();
        t1.decChannel(); // 채널 번호 1 감소
        t1.incVolume(); // 음량 1 증가
        t1.printAll();

        // 두 번쨰 텔레비전 객체
        Television t2 = new Television();
        t2.setName("엘지"); // 브랜드 이름 '엘지'
        t2.setOn(true);
        t2.setChannel(98); // 채널 번호를 98로 세팅
        t2.setVolume(12); // 음량을 12로 세팅
        t2.printAll();
        t2.incChannel(); // 채널 번호 1 증가
        t2.incVolume(); // 음량 1 증가
        t2.printAll();
    }
}