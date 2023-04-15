package 도전과제1;
import java.util.Scanner;

public class charge {
	public static void main(String[] args) {
		int price = 0;
		int how_much = 0;
		int left = 0;
		int list[] = {500, 100, 50, 10, 5, 1};
		
		System.out.print("물건의 가격<1,000원 이하>을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		
		price = sc.nextInt();
		left = 1000 - price;
		System.out.println(price + "원 짜리 뭄건을 샀고 1,000원을 내셨습니다.");
		System.out.println("거스름돈은 " + left + "원입니다.");
		System.out.println("거스름돈의 내역은 다음과 같습니다:\n");
		
		for(int i = 0; i < 6; i++) {
			how_much = left / list[i];
			left = left % list[i];
			System.out.println(list[i] + "원 짜리 동전 갯수 = " + how_much);
		}
	}
}
