package 실습과제8;

import java.util.Scanner;

//출석부를 관리한다.
public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//교과목명을 입력 받는다.
		System.out.print("교과목명을 입력하세요: ");
		String subject = scan.nextLine();
		
		//교과목명이 입력 받은 교과목명이고 크기가 10인 ClassRoll객체를 생성한다.
		ClassRoll c = new ClassRoll(subject, 10);
		Student s;
		int ID;

		while (true) {
			//원하는 연산을 입력 받는다.
			System.out.print("원하는 연산을 선택하세요: ");
			System.out.println("(1) 추가 (2) 찾기 (3) 종료");
			int choice = scan.nextInt();
			scan.nextLine(); 

			//원하는 연산이 (1) 추가일 경우
			if (choice == 1) {
				//추가하는 학생의 학번을 입력 받는다.
				System.out.print("추가하는 학생의 학번을 입력하세요: ");
				ID = scan.nextInt();
				scan.nextLine(); 
				
				//추가하는 학생의 이름을 입력 받는다.
				System.out.print("추가하는 학생의 이름을 입력하세요: ");
				String name = scan.nextLine();
				
				//학번이 입력받은 학번이고 이름이 입력받은 이름인 Student객체를 생성한다.
				s = new Student(ID, name);
				
				//주어진 학생을 출석부에 추가한다.
				c.plusStudent(s);
			
			//원하는 연산이 (2) 찾기일 경우
			} else if (choice == 2) {
				//찾는 학생의 학번을 입력 받는다.
				System.out.print("찾는 학생의 학번을 입력하세요: ");
				ID = scan.nextInt();
				scan.nextLine(); 
				
				//주어진 학번을 가진 학생의 이름을 찾는다.
				s = c.findName(ID);
				
				if (s != null) {
					//학번과 이름을 한꺼번에 출력한다.
					s.printAll();
				}
			
			//원하는 연산이 (3) 종료일 경우
			} else if (choice == 3) {
				break;
			}
		}

	}

}
