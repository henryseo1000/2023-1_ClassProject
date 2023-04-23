import java.util.Random;

public class PairOfDice {
    int num1 = 1; // 첫 번째 주사위면
    int num2 = 1; // 두 번째 주사위면

    // 객체를 만들면서 두 주사위면을 1로 초기화한다.
    PairOfDice(){
        num1 = 1;
        num2 = 1;
    }

    // 두 주사위를 동시에 던진다.
    void rollTwo(){
        Random r1 = new Random(); // 랜덤 객체를 생성한다.
        num1 = r1.nextInt(6) + 1; // 1~6까지의 랜덤 숫수
        num2 = r1.nextInt(6) + 1;
    }

    // 첫 번째 주사위면을 반환한다.
    public int getNum1() {
        return num1;
    }

    // 두 번째 주사위면을 반환한다.
    public int getNum2() {
        return num2;
    }
}
