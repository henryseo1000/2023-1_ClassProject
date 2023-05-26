import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int income[];
        double max = 0;
        int index = 0;
        int count = 0;

        System.out.print("가구들의 수를 입력하세요: ");
        num = sc.nextInt();

        income = new int[num];

        try {
            System.out.print("각 가구의 가구 소득을 입력하세요: ");
            for (int i = 0; i < num; i++) {
                index = i;
                income[i] = sc.nextInt();
                if(income[i] < 0){
                    throw new IllegalArgumentException((i + 1) + "번째 가구 소득이 음수이다");
                }
                if (income[i] > max) {
                    max = income[i];
                }
            }
            System.out.println("최대 가구 소득: " + max);
            System.out.println("최대 가구 소득의 10%: " + max * 0.1);

            for (int i = 0; i < num; i++) {
                if (income[i] < max * 0.1){
                    count ++;
                }
            }

            System.out.println("가구들의 수: " + count);
        }
        catch(InputMismatchException e){
            System.out.println((index + 1) + "번째 가구 소득이 숫자가 아니다");
            for (int i = 0; i < index; i++) {
                System.out.print(income[i] + " ");
            }

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}