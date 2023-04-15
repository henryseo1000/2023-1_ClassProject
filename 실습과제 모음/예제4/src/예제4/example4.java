package 예제4;

import java.util.Scanner;
import java.util.Random;

public class example4 {

	public static void main(String[] args) {
		// 1. 사용한 변수 목록
		Random random = new Random(); // 랜덤 객체
		Scanner sc = new Scanner(System.in); // 입력 받기 위한 객체
		int answer, guess, num; // 정답, 추측, 횟수
		String yesno = ""; // 게임을 계속할지를 저장하는 변수
		
		// 2. 추측과 횟수는 0으로 초기화, 정답은 1 ~100까지의 정수를 넣는다.
		guess = 0;
		num = 0;
		answer = random.nextInt(100) + 1;
		
		//3. 무한 반복문을 돌린다.
		while (true) {
			System.out.print("추측한 숫자를 입력하세요(종료를 원하면 -99):");
			guess = sc.nextInt();
			
			//추측과 답이 맞을 경우, 맞다고 출력하고, 횟수를 1 증가시킨 후 출력하고, 계속할지를 물어본다.
			if (guess == answer) {
				System.out.println("추측한 숫자가 맞다");
				num++;
				System.out.println("추측한 횟수: " + num);
				System.out.print("계속하기를 원하는가?(예 혹은 아니오):");
				yesno = sc.next();
				// 만약 예로 대답하면 횟수를 초기화하고, 랜덤 변수를 새로 넣는다. 만약 아니오로 대답하면, 반복문을 종료한다.
				if (yesno.equals("예")) {
					num = 0; // 횟수 초기화
					answer = random.nextInt(100) + 1; // 다시 랜덤한 숫자 넣기
				}
				else {
					break;
				}
			}
			// 대답에 -99가 입력될 경우 지금까지 횟수를 그대로 출력하고, 계속할지를 물어본다. 
			else if(guess == -99) {
				System.out.println("추측한 횟수: " + num);
				System.out.print("계속하기를 원하는가?(예 혹은 아니오):");
				yesno = sc.next();
				// 만약 예로 대답하면 횟수를 초기화하고, 랜덤 변수를 새로 넣는다. 만약 아니오로 대답하면, 반복문을 종료한다.
				if (yesno.equals("예")) {
					num = 0; // 횟수 초기화
					answer = random.nextInt(100) + 1;
				}
				else {
					break;
				}
			}
			// 만약 추측이 정답보다 크다면 크다고 출력하고, 입력 횟수를 1 증가시킨다.
			else if (guess > answer){
				System.out.println("추측한 숫자가 크다");
				num++;
			}
			// 그 외에는 추측이 정답보다 작은 경우이므로 작다고 출력하고, 입력횟수를 1 증가시킨다.
			else {
				System.out.println("추측한 숫자가 작다");
				num++;
			}
		}
	}

}
