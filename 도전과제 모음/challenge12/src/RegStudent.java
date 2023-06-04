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
    CheckboxGroup cg1;
    Checkbox c1, c2, c3, c4, c5, c6;
    Choice ch1;
    JTextArea ta1;
    JPanel p1, p2, p3, p4, p5, p6, p7, p8;

    public RegStudent(){
        stu_num = 0;
        slist = new Student[50];

        GridBagConstraints g1 = new GridBagConstraints();
        ButtonListener bl = new ButtonListener();

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();
        p8 = new JPanel();

        p1.setBackground(Color.YELLOW);
        p2.setBackground(Color.YELLOW);
        p3.setBackground(Color.YELLOW);
        p4.setBackground(Color.YELLOW);
        p5.setBackground(Color.YELLOW);
        p6.setBackground(Color.YELLOW);
        p7.setBackground(Color.YELLOW);
        p8.setBackground(Color.YELLOW);

        cg1 = new CheckboxGroup();

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

        ch1 = new Choice();
        ch1.add("학과 선택");
        ch1.add("컴퓨터공학과");
        ch1.add("전자공학과");
        ch1.add("정보통신공학");

        b1 = new JButton("저장");
        b2 = new JButton("종료");

        ta1 = new JTextArea();

        JScrollPane scrollPane = new JScrollPane();

        setLayout(new GridLayout(2,1));
        add(p1);
        add(p2);

        p1.setLayout(new GridLayout(5,1));
        p1.add(p4);
        p1.add(p5);
        p1.add(p6);
        p1.add(p7);
        p1.add(p8);

        p4.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        p4.add(l1); //성명
        tf1.setColumns(15);

        p4.add(tf1);

        p4.add(l2); //성별
        p4.add(c1);
        p4.add(c2);

        p5.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        p5.add(l3); //학번
        tf2.setColumns(8);
        p5.add(tf2);

        p5.add(l4); //전화번호
        tf3.setColumns(13);
        p5.add(tf3);

        p6.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        p6.add(l5); //주소
        tf4.setColumns(27);
        p6.add(tf4);

        p7.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        p7.add(l6); //학과명
        p7.add(ch1);
        ch1.setSize(15,3);

        p8.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        p8.add(l7, BorderLayout.WEST); //취미
        p8.add(c3);
        p8.add(c4);
        p8.add(c5);
        p8.add(c6);

        p2.setLayout(new BorderLayout());
        p2.add(l8, BorderLayout.NORTH); //자기소개

        p2.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setViewportView(ta1);

        p3.add(b1, BorderLayout.CENTER);
        p3.add(b2, BorderLayout.CENTER);

        p2.add(p3, BorderLayout.PAGE_END);

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
                else if(!c1.getState() && !c2.getState()){
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

                    if(c1.getState()){
                        sex = c1.getLabel();
                    }
                    else{
                        sex = c2.getLabel();
                    }

                    p_num = tf3.getText();
                    addr = tf4.getText();

                    major = ch1.getSelectedItem();

                    hobby = "";
                    if(c3.getState()){
                        hobby += " 운동";
                    }
                    if(c4.getState()){
                        hobby += " 음악감상";
                    }
                    if(c5.getState()){
                        hobby += " 영화";
                    }
                    if(c6.getState()){
                        hobby += " 여행";
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

        c1.setState(false);
        c2.setState(false);

        ta1.setText("");

        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
    }
}
