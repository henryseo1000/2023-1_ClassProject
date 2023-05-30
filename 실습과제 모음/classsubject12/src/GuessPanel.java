import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessPanel extends JFrame {
    JButton button1, button2;
    JLabel label1, label2, label3;
    int num = 0;
    Container contentPane;
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            button1.setVisible(false);
            button2.setVisible(false);

            if(event.getSource() == button1 && num % 2 == 1){
                contentPane.add(label2);
            }
            else if (event.getSource() == button1 && num % 2 == 0) {
                contentPane.add(label1);
            }
            else if (event.getSource() == button2 && num % 2 == 1) {
                contentPane.add(label2);
            }
            else if (event.getSource() == button2 && num % 2 == 0) {
                contentPane.add(label1);
            }

            contentPane.add(label3);
        }
    }
    public GuessPanel() {
        Random ran = new Random();
        contentPane = getContentPane();
        setTitle("홀짝 맞추기 게임"); //프레임의 제목 설정
        setSize(240, 100); //프레임의 크기 설정
        contentPane.setLayout(new FlowLayout()); //배치 관리자 설정

        num = ran.nextInt(100 + 1);

        button1 = new JButton("짝수");
        button2 = new JButton("홀수");
        label1 = new JLabel("맞았습니다.");
        label2 = new JLabel("틀렸습니다.");
        label3 = new JLabel("비밀번호 = " + num);

        ButtonListener listener = new ButtonListener();
        button1.addActionListener(listener);
        button2.addActionListener(listener);

        //컴포넌트 생성 및 추가
        contentPane.add(button1);
        contentPane.add(button2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
