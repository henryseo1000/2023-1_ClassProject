import java.util.Scanner;

public class Essay extends TestQuestion{
    int answer_line;
    public void readQuestion(){
        Scanner sc = new Scanner(System.in);
        answer_line = sc.nextInt();
        sc.nextLine();
        problem = sc.nextLine();
    }
    public String toString(){
        String print = "";
        print += problem + "\n";
        for(int i = 0; i < answer_line; i++){
            print += "___________________________________________________\n";
        }
        return print;
    }
}
