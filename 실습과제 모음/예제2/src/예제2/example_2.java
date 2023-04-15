package 예제2;
import java.util.Scanner;
import java.util.Random;

public class example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		String birthdate;
		int index;
		
		System.out.print("생년월일을 입력하세요(yyyy/mm/dd) : ");
		birthdate = scan.next();
		
		
		int number;
		Random generator = new Random();
		number = generator.nextInt(10) + 201000;
		
		
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birthdate);
		System.out.println("학번 : " + number);
	}

}
