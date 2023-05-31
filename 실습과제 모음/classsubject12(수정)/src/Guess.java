import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Guess {
    public static void main(String[] args) {
        //원래는 frame을 따로 생성해주어야 하지만 GuessPanel이 JFrame을 상속하므로 여기서는 변수 하나로 충분하다.
        JFrame f1 = new JFrame();
        GuessPanel g1 = new GuessPanel();

        f1.setTitle("홀짝 맞추기 게임");
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1.setSize(240, 100); //프레임의 크기 설정
        f1.add(g1.contentPane);
        f1.setVisible(true);
    }
}