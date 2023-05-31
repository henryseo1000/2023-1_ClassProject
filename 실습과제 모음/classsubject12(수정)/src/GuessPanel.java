import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GuessPanel{
    JButton button1, button2; //짝수와 홀수 버튼 2개
    JLabel label1, label2, label3; //맞고 틀림, 비밀번호를 알려주는 레이블 3개
    int num = 0; //랜덤 번호
    JPanel contentPane; //컨테이너 객체
    private class ButtonListener implements ActionListener{ //버튼에 달아줄 리스너 객체(내부 클래스)
        public void actionPerformed(ActionEvent event){ //ActionListener의 actionPerformed를 활용
            //버튼을 누르는 순간에는 버튼이 사라진다.
            button1.setVisible(false);
            button2.setVisible(false);

            //num의 값에 따라 컨테이너에 추가해야 할 레이블이 달라진다.
            if(event.getSource() == button1 && num % 2 == 1){
                contentPane.add(label2);
            }
            else if (event.getSource() == button1 && num % 2 == 0) {
                contentPane.add(label1);
            }
            else if (event.getSource() == button2 && num % 2 == 1) {
                contentPane.add(label1);
            }
            else if (event.getSource() == button2 && num % 2 == 0) {
                contentPane.add(label2);
            }

            //비밀번호를 출력한다.
            contentPane.add(label3);
        }
    }
    public GuessPanel() {// 생성자 메소드
        Random ran = new Random();
        contentPane = new JPanel();
        //contentPane. //프레임의 제목 설정
        //contentPane
        contentPane.setLayout(new FlowLayout()); //배치 관리자 설정

        num = ran.nextInt(100 + 1); //랜덤한 정수 생성 (0 ~ 101까지)

        //각 버튼과 레이블에 글자를 넣는다.
        button1 = new JButton("짝수");
        button2 = new JButton("홀수");
        label1 = new JLabel("맞았습니다.");
        label2 = new JLabel("틀렸습니다.");
        label3 = new JLabel("비밀번호 = " + num);

        //버튼 2개에 모두 리스너를 달아준다.
        ButtonListener listener = new ButtonListener();
        button1.addActionListener(listener);
        button2.addActionListener(listener);

        //컴포넌트 생성 및 추가
        contentPane.add(button1);
        contentPane.add(button2);
    }
}
