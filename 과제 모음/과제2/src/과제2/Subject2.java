package 과제2;
import java.util.Scanner;

public class Subject2 {

	public static void main(String[] args) {
		// Scanner 변수 선언
		Scanner sc = new Scanner(System.in);
		
		// 반지름과 높이 정수 변수 선언
		int r, h;
		
		// 부피와 표면적 실수 변수 선언
		double volume, area;
		
		// 반지름과 높이를 입력받는다.
		System.out.print("원의 반지름을 입력하세요 :");
		r = sc.nextInt();
		System.out.print("원뿔의 높이를 입력하세요 :");
		h = sc.nextInt();	
		
		// 부피와 표면적을 계산한다.
		volume = 3.14 * r * r * h / 3;
		area = 3.14 * r * Math.sqrt(r * r + h * h) + 3.14 * r * r;
		
		// 원의 반지름, 높이, 부피, 표면적을 출력한다.
		System.out.println("원의 반지름 = " + r);
		System.out.println("원뿔의 높이 = " + h);
		System.out.println("원뿔의 부피 = " + volume);
		System.out.println("원뿔의 표면적 = " + area);
	}

}
