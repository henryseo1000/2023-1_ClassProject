import jdk.jfr.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegStudent extends JFrame {
    int stu_num;
    Student[] slist;
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField tf1, tf2, tf3, tf4;
    JRadioButton rb1, rb2;
    CheckboxGroup cg1, cg2;
    Checkbox c1, c2, c3, c4, c5, c6;
    Choice ch1;
    JTextArea ta1;
    JPanel p1, p2, p3, p4, p5, p6, p7;

    public RegStudent(){
        stu_num = 0;
        slist = new Student[50];

        GridBagConstraints g1 = new GridBagConstraints();
        ButtonListener bl = new ButtonListener();
        ButtonGroup bg = new ButtonGroup();

        p1 = new JPanel(new GridLayout(1,5,10,10));
        p2 = new JPanel(new GridLayout(1,4,10,10));
        p3 = new JPanel(new GridLayout(1,2,10,10));
        p4 = new JPanel(new GridLayout(1,2,10,10));
        p5 = new JPanel(new GridLayout(1,5,10,10));
        p6 = new JPanel(new GridLayout(2,1,1,1));
        p7 = new JPanel();


        cg1 = new CheckboxGroup();
        cg2 = new CheckboxGroup();

        l1 = new JLabel("성명");
        l2 = new JLabel("성별");
        l3 = new JLabel("학번");
        l4 = new JLabel("전화번호");
        l5 = new JLabel("주소");
        l6 = new JLabel("학과명");
        l7 = new JLabel("취미");
        l8 = new JLabel("자기소개");

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();

        c1 = new Checkbox("남", false, cg1);
        c2 = new Checkbox("여", false, cg1);
        c3 = new Checkbox("운동", false);
        c4 = new Checkbox("음악감상", false);
        c5 = new Checkbox("영화", false);
        c6 = new Checkbox("여행", false);

        rb1 = new JRadioButton("남");
        rb2 = new JRadioButton("여");

        ch1 = new Choice();
        ch1.add("학과 선택");
        ch1.add("컴퓨터공학과");
        ch1.add("전자공학과");
        ch1.add("정보통신공학");

        b1 = new JButton("저장");
        b2 = new JButton("종료");

        ta1 = new JTextArea();

        bg.add(rb1);
        bg.add(rb2);

        JScrollPane scrollPane = new JScrollPane();

        setLayout(new GridLayout(7,1));
        add(p1);
        add(p2, BorderLayout.AFTER_LAST_LINE);
        add(p3, BorderLayout.AFTER_LAST_LINE);
        add(p4, BorderLayout.AFTER_LAST_LINE);
        add(p5, BorderLayout.AFTER_LAST_LINE);
        add(p6, BorderLayout.AFTER_LAST_LINE);
        add(p7, BorderLayout.AFTER_LAST_LINE);

        p1.add(l1); //성명
        tf1.setColumns(3);

        p1.add(tf1);

        p1.add(l2); //성별
        p1.add(rb1);
        p1.add(rb2);

        p2.add(l3); //학번
        tf2.setColumns(8);
        p2.add(tf2);

        p2.add(l4); //전화번호
        tf3.setColumns(13);
        p2.add(tf3);

        p3.add(l5); //주소
        tf4.setColumns(20);
        p3.add(tf4);

        p4.add(l6); //학과명
        p4.add(ch1, BorderLayout.CENTER);

        p5.add(l7); //취미
        p5.add(c3);
        p5.add(c4);
        p5.add(c5);
        p5.add(c6);

        p6.add(l8); //자기소개
        p6.add(scrollPane);
        scrollPane.setViewportView(ta1);

        p7.add(b1, BorderLayout.CENTER);
        p7.add(b2, BorderLayout.CENTER);

        b1.addActionListener(bl);
        b2.addActionListener(bl);

        setTitle("학생 등록");
        getContentPane().setBackground(Color.YELLOW);
        setSize(400, 600);
        setLocation(400, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == b1){
                if(tf1.getText().isBlank()){
                    JOptionPane.showMessageDialog(null, "이름을 입력하세요");
                }
                else if(!rb1.isSelected() && !rb2.isSelected()){
                    JOptionPane.showMessageDialog(null, "성별을 선택해 주세요");
                }
                else if(tf2.getText().isBlank() || tf2.getText().length() != 8){
                    JOptionPane.showMessageDialog(null, "학번이 틀렸습니다");
                }
                else if(tf3.getText().isBlank() || tf3.getText().length() != 13){
                    JOptionPane.showMessageDialog(null, "전화번호가 틀렸습니다");
                }
                else if(tf4.getText().isBlank()){
                    JOptionPane.showMessageDialog(null, "주소를 입력하세요");
                }
                else if(ch1.getSelectedItem() == ch1.getItem(0)){
                    JOptionPane.showMessageDialog(null, "학과를 하나 선택하세요");
                }
                else if(checkedBox() < 2){
                    JOptionPane.showMessageDialog(null, "취미를 두개 이상 선택하세요");
                }
                else {
                    String id, name, sex, p_num, addr, major, hobby, intro;
                    id = tf2.getText();
                    name = tf1.getText();

                    if(rb1.isSelected()){
                        sex = rb1.getText();
                    }
                    else{
                        sex = rb2.getText();
                    }

                    p_num = tf3.getText();
                    addr = tf4.getText();

                    major = ch1.getSelectedItem();

                    hobby = "";
                    if(c3.getState()){
                        hobby += "운동";
                    }
                    if(c4.getState()){
                        hobby += "음악감상";
                    }
                    if(c5.getState()){
                        hobby += "영화";
                    }
                    if(c6.getState()){
                        hobby += "여행";
                    }

                    intro = ta1.getText();

                    slist[stu_num] = new Student(id, name, sex, p_num, addr, major, hobby, intro);
                    stu_num++;
                    init();
                }
            }
            else if(event.getSource() == b2){
                printAll();
                System.exit(0);
            }
        }
    }

    public int getStu_num() {
        return stu_num;
    }

    public int checkedBox(){
        int count = 0;
        if(c3.getState()){
            count ++;
        }
        if(c4.getState()){
            count ++;
        }
        if(c5.getState()){
            count ++;
        }
        if(c6.getState()){
            count ++;
        }
        return count;
    }
    public void printAll(){
        System.out.println("학번\t\t\t이름\t\t성별\t\t전화번호\t\t주소\t\t학과\t\t\t취미\t\t자기소개");
        for(int i = 0; i < stu_num; i++){
            slist[i].printAll();
        }
    }

    public void init(){
        ch1.select(0);

        c1.setState(false);
        c2.setState(false);
        c3.setState(false);
        c4.setState(false);
        c5.setState(false);
        c6.setState(false);

        rb1.setSelected(false);
        rb2.setSelected(false);

        ta1.setText("");

        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
    }
}
