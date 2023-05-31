import javax.swing.*;

public class Guess {
    public static void main(String[] args) {
        //원래는 frame을 따로 생성해주어야 하지만 GuessPanel이 JFrame을 상속하므로 여기서는 변수 하나로 충분하다.
        GuessPanel g1 = new GuessPanel();
        g1.setVisible(true);
    }
}