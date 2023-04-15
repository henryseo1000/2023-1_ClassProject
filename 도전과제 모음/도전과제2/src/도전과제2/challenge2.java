package 도전과제2;
import java.util.Scanner;

public class challenge2 {

	public static void main(String[] args) {
		// 변수 목록
		String binary = ""; //이진수를 입력받는 변수
		String octal = ""; //8진수를 저장하는 변수
		Scanner sc = new Scanner(System.in); // 입력을 받는 Scanner 객체
		int value = 0; // 8진수 변환한 값을 한 자리씩 저장하는 변수
		int index = 0; // 문자열의 번지수를 나타내는 변수
		
		// 입력 문구 출력 후 이진수를 문자열로 입력받는다.
		System.out.print("12 비트(bit)의 이진수를 입력하세요: ");
		binary = sc.next();
		
		//index가 끝까지 도달할 때까지 3자리씩 끊어서 계산한다.
		for (index = 0; index < binary.length(); index++) {		
			// 끊어 읽은 세 자리수중 첫 번째 자리수의 글자에 4를 곱하고 번지수를 1 증가시킨다.
			value += 4 * (binary.charAt(index) - '0');
			index ++;
			
			// 끊어 읽은 세 자리수중 두 번째 자리수의 글자에 4를 곱하고 번지수를 1 증가시킨다.
			value += 2 * (binary.charAt(index) - '0');
			index ++;
			
			// 끊어 읽은 세 자리수중 세 번째 자리수의 글자에 4를 곱하고 번지수를 1 증가시킨다.
			value += 1 * (binary.charAt(index) - '0');
			
			//octal 변수에 value 값을 옆으로 하나씩 추가한다.
			octal = octal + value;
			
			//세자리를 읽었으므로 변수 값을 초기화한다.
			value = 0;
		}
		
		//이진수와 팔진수를 각각 출력한다.
		System.out.println("이진수 " + binary + "에 대응하는 8진수는 " + octal + " 이다.");
	}

}
