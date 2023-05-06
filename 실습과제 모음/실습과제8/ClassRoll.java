package 실습과제8;

public class ClassRoll {
	String subject; // 교과목명
	int num; // 출석부에 포함된 학생들의 수
	int max; // 크기(출석부에 포함될 수 있는 최대 학생 수)
	Student[] students; // 학생들의 배열

	//교과목명과 크기를 각각 주어진 값으로 초기화한다.
	public ClassRoll(String subject, int max) {
		this.subject = subject;
		this.max = max;
		this.num = 0;
		this.students = new Student[max];
	}

	// 주어진 학생을 출석부에 추가한다.
	public void plusStudent(Student s) {
		
		//출석부가 꽉 찬 경우 메세지를 출력한다.
		if (num == max) {
			System.out.println("출석부의 크기 부족으로 추가할 수 없습니다.");
		
		//주어진 학생을 출석부의 맨 뒤에 추가한다.
		} else {
			students[num] = s;
			num++;
		}
	}

	// 주어진 학번을 가진 학생의 출석부내의 위치(index)를 알려 준다.
	public int findIndex(int ID) {
		for (int i = 0; i < num; i++) {
			
			//주어진 학생의 위치를 반환한다.
			if (students[i].ID == ID) {
				return i;
			
				
			} 
			
		}
		//주어진 학생이 출석부에 없다면 -1을 반환한다.
		return -1;

	}

	// 주어진 학번을 가진 학생을 출석부에서 찾아서 이름을 알려 준다.
	public Student findName(int ID) {
		
		//주어진 학번을 가진 학생이 출석부에 없다면 메세지를 출력한다.
		if (findIndex(ID) == -1) {
			System.out.println("주어진 학생이 출석부에 없습니다.");
		
		//주어진 학생의 객체를 반환한다.
		} else {
			return students[findIndex(ID)];
		}
		return null;
	}

}
