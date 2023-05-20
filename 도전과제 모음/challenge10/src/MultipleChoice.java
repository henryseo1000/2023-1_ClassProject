import java.util.Scanner;

public class MultipleChoice extends TestQuestion{
    String[] list;
    //readQuestion
    //toString
    public void readQuestion(){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        list = new String[num];
        sc.nextLine();
        problem = sc.nextLine();

        for(int i = 0; i < num; i++){
            list[i] = sc.nextLine();
        }
    }

    public String toString(){
        String print = "";
        print += problem + "\n";

        for(int i = 0; i < list.length; i++){
            print += "\t" + (char)('a'+ i) + ". " + list[i] + "\n";
        }

        return print;
    }
}
