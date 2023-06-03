import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HexPanel extends JPanel {
    JLabel label1, label2;
    JTextField textfield;
    JButton button;
    int num;
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String str = textfield.getText();
            int num = Integer.parseInt(str);

            label2.setText(toHex(num));
            label2.setVisible(true);
        }
    }
    public HexPanel(){
        label1 = new JLabel("양의 정수를 입력하세요");
        label2 = new JLabel("");

        textfield = new JTextField(10);
        button = new JButton("16진수로 변환");

        num = 0;

        this.add(label1);
        this.add(textfield);
        this.add(button);
        this.add(label2);

        button.addActionListener(new ButtonListener());

        label2.setVisible(false);
    }

    public String toHex(int num){
        int left = 0;
        String answer = "";

        while(num != 0){
            left = num % 16;
            num = num / 16;

            if(left == 10){
                answer = "A" + answer;
            }
            else if(left == 11){
                answer = "B" + answer;
            }
            else if(left == 12){
                answer = "C" + answer;
            }
            else if(left == 13){
                answer = "D" + answer;
            }
            else if(left == 14){
                answer = "E" + answer;
            }
            else if(left == 15){
                answer = "F" + answer;
            }
            else{
                answer = left + answer;
            }
        }
        return answer;
    }
}
