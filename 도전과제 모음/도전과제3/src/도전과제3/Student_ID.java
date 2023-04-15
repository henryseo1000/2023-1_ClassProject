package 도전과제3;
import java.util.Scanner;

public class Student_ID {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//년도, 순번, 학번, 입학 유형 변수를 선언한다.
		String year, num, stu_id, category;
		boolean valid = true; // 학번이 맞는지 참과 거짓을 나타낸다. 기본값은 무조건 true여야 한다.
		Scanner sc =  new Scanner(System.in);
		
		//"학번은?" 글자를 출력하고 입력을 받는다.
		System.out.print("학번은? ");
		stu_id = sc.next();
		year = stu_id.substring(2,4);
		category = stu_id.substring(4,5);
		num = stu_id.substring(5);
		
		//입학년도, 유형, 순번을 출력한다.
		System.out.println("입학 연도: " + year);
		System.out.println("입학 유형: " + category);
		System.out.println("입학 순번: " + num);
		
		//만약 길이가 8이 아니면 틀린 이유를 출력하고 valid를 false로 만든다.
		if(stu_id.length() != 8) {
			System.out.println("틀린 이유: 길이가 8이 아니다.");
			valid = false;
		}
		//학번의 1,2번째 글자가 60이 아니면 틀린 이유를 출력하고 valid를 false로 만든다.
		if(!stu_id.substring(0,2).equals("60")) {
			System.out.println("틀린 이유: 60으로 시작하지 않는다.");
			valid = false;
		}
		//category가 "2" 또는 "5"가 아니면 틀린 이유를 출력하고 valid를 false로 만든다.
		if(!category.equals("2") && !category.equals("5")){
			System.out.println("틀린 이유: 입학 유형");
			valid = false;
		}
		//순번이 1000 이상이거나(길이가 3이 아니거나) "000"이면 틀린 이유를 출력하고 valid를 false로 만든다.
		if(3 != num.length() || num.equals("000")) {
			System.out.println("틀린 이유: 입학 순번");
			valid = false;
		}
		//valid가 true이면 학번이 맞다고 출력하고, 아니라면 아무것도 출력하지 않는다.
		if(valid) {
			System.out.println("학번이 맞다.");
		}
	}

}
