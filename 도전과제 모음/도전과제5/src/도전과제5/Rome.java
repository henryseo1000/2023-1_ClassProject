package 도전과제5;

import java.util.Scanner;

public class Rome {

	public static void main(String[] args) {
		String num = ""; // 로마 문자열을 입력 받아 저장한다.
		int result = 0; // 10진수로 변환된 결과를 저장한다.
		Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체
		
		while(true) {
			// 로마 문자열을 입력받는다.
			System.out.print("로마 숫자를 입력하세요: ");
			num = sc.next();
			result = RomeToNum2(num);
			
			// 문제의 조건. 입력받은 숫자가 1 미만이거나 5000 이상이면 잘못 입력되었다고 출력하고 다시 입력을 받는다.
			if(result < 1 || 5000 <= result) {
				System.out.println("잘못 입력된 로마 숫자");
			}
			// 제대로 입력된 경우는 10진수와 8진수로 각각 출력한다.
			else {
				System.out.println("10진수로 변환한 숫자: " + result);
				System.out.println("8진수로 변환한 숫자: " + NumToOct(result));
				break;
			}
		}
	}
	
	// 문자 하나를 입력받아 10진수로 변환하는 알고리즘
	public static int RomeToNum1(char num) {
		if(num == 'I') {
			return 1;
		}
		else if(num == 'V') {
			return 5;
		}
		else if(num == 'X') {
			return 10;
		}
		else if(num == 'L') {
			return 50;
		}
		else if(num == 'C') {
			return 100;
		}
		else if(num == 'D') {
			return 500;
		}
		else if(num == 'M') {
			return 1000;
		}
		else {
			return -1;
		}
	}
	
	// 로마 문자열 전체를 입력받아 10진수로 변환하는 알고리즘
	public static int RomeToNum2(String num) {
		int result = 0; // 변환 결과를 저장하는 변수
		
		// String 객체의 경우 첫 문자가 0부터 시작하여 끝까지 가므로 각 글자마다 반복문을 돌린다.
		for(int i = 0; i < num.length(); i++) {
			// 이때, 자신과 옆의 문자열을 비교하여 오른쪽의 문자가 나타내는 값이 크다면 오른쪽 문자에서 왼쪽 문자를 뺀다. 이때, 값이 넘어가지 않게 주의한다.
			if((i <= num.length() - 2) && RomeToNum1(num.charAt(i)) < RomeToNum1(num.charAt(i+1))) {
				result += RomeToNum1(num.charAt(i+1)) - RomeToNum1(num.charAt(i));
				i += 2;
			}
			else {
				result += RomeToNum1(num.charAt(i));
			}
		}
		
		return result;
	}
	
	// 10진수를 입력받아 8진수로 변환한다.
	public static String NumToOct(int num) {
		String result = "";
		
		// num이 0이 될때까지 8로 나누고 나머지를 result 문자열에 하나씩 붙여준다.
		while(num != 0) {

			result = num % 8 + result;
			
			num = num / 8;
			
		}
		return result;
	}
}
