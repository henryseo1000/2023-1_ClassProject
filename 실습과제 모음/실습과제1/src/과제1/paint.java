package 과제1;
import java.util.Scanner;

public class paint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double row, col, hei;
		
		System.out.print("사무실의 가로 길이를 입력하세요: ");
		row = sc.nextDouble();
		
		System.out.print("사무실의 세로 길이를 입력하세요: ");
		col = sc.nextDouble();
		
		System.out.print("사무실의 높이를 입력하세요: ");
		hei = sc.nextDouble();
		
		System.out.println("가로: " + row);
		System.out.println("세로: " + col);
		System.out.println("높이: " + hei);
		
		System.out.println("총 면적: " + (row * col + 2 * (col * hei + row * hei)));
		System.out.println("페인트 통수: " + ((row * col + 2 * (col * hei + row * hei)) / 500));
	}
}
