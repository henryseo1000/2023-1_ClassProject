package 도전과제4;
import java.util.Scanner;

public class Rome {

	public static void main(String[] args) {
		int year;
		int num1, num2, num3, num4;
		int count = 1;
		int num = 1000;
		String symbol = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요: ");
		year = sc.nextInt();
		
		num1 = year / 1000;
		num2 = year % 1000 / 100;
		num3 = year % 1000 % 100 / 10;
		num4 = year % 1000 % 100 % 10;
		
		System.out.print("로마 숫자로 표현한 연도 = ");
		num = num1;
		if (num )
	}

}
