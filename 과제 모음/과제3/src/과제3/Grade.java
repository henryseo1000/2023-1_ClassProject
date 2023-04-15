package 과제3;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cheating = ""; //부정행위 여부를 나타내는 변수
		int attendance = 0; //출석률을 나타내는 변수
		int score = 0; //총점을 나타내는 변수
		String grade = ""; //학점을 나타내는 변수
		Scanner sc = new Scanner(System.in);
		
		//부정행위 여부를 입력받는다.
		System.out.print("부정행위 여부(true 혹은 false): ");
		cheating = sc.next();
		
		//출석률을 입력받는다.
		System.out.print("출석률(0~ 100사이의 정수값): ");
		attendance = sc.nextInt();
		
		//총점을 입력받는다.
		System.out.print("총점(0~ 100사이의 정수값): ");
		score = sc.nextInt();
		
		//만약 부정행위가 "true"라면 학점은 무조건 "F"
		if (cheating.equals("true")) {
			grade = "F";
		}
		//부정행위는 하지 않았지만 출석율이 80% 미만이면 "F"
		else if(attendance < 80){
			grade = "F";
		}
		//그 외의 경우 90점 이상이면 "A"
		else if(score >= 90) {
			grade = "A";
		}
		//그 외의 경우 80점 이상이면 "B"
		else if(score >= 80) {
			grade = "B";
		}
		//그 외의 경우 70점 이상이면 "C"
		else if(score >= 70) {
			grade = "C";
		}
		//그 외의 경우 60점 이상이면 "D"
		else if(score >= 60) {
			grade = "D";
		}
		//그 외 60점미만은 "F"
		else {
			grade = "F";
		}
		
		System.out.println("학점 = " + grade);
	}
}
