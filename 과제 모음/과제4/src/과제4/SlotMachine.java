package 과제4;
import java.util.Scanner;
import java.util.Random;

public class SlotMachine {

	public static void main(String[] args) {
		int num1, num2, num3;
		String yesno = "";
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			num1 = ran.nextInt(9) + 1;
			num2 = ran.nextInt(9) + 1;
			num3 = ran.nextInt(9) + 1;
			
			System.out.println("숫자들: " + num1 + "\t" + num2 + "\t" + num3);
			
			if(num1 == num2 && num2 == num3) {
				System.out.println("1등 당첨");
			}
			else if(num1 == num2 || num2 == num3 || num1 == num3) {
				System.out.println("2등 당첨");
			}
			else {
				System.out.println("꽝");
			}
			
			System.out.print("게임 계속?(예 혹은 아니오): ");
			yesno = sc.next();
			
			if(yesno.equals("아니오")) {
				break;
			}
		}
	}

}
