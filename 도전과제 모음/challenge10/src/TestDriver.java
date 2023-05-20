import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String answer = "";

        num = sc.nextInt();

        TestQuestion[] t_list = new TestQuestion[num];

        for(int i = 0; i < num; i++){
            answer = sc.next();
            if(answer.equals("e")){
                t_list[i] = new Essay();
                t_list[i].readQuestion();
            }
            else if(answer.equals("m")){
                t_list[i] = new MultipleChoice();
                t_list[i].readQuestion();
            }
        }

        for(int i = 0; i < num; i++){
            System.out.print((i + 1) + ". ");
            System.out.println(t_list[i].toString());
        }
    }
}