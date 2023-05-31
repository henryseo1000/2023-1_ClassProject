import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HexDriver {
    public static void main(String[] args) {
        HexPanel p1 = new HexPanel();
        JFrame f1 = new JFrame();

        f1.add(p1);
        f1.setSize(300,100);
        f1.setTitle("16 진수 변환");
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
}