import java.util.Random;

public class PairOfDice {

    int num1 = 0;
    int num2 = 0;
    PairOfDice(){
        num1 = 1;
        num2 = 1;
    }

    void rollTwo(){
        Random r1 = new Random();
        num1 = r1.nextInt(6) + 1;
        num2 = r1.nextInt(6) + 1;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
