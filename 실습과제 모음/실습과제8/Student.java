package 실습과제8;
//출석부에 포함되는 학생들을 나타낸다.
public class Student {
	int ID; //학번
	String name; //이름
	
	//학번과 이름을 각각 주어진 값으로 초기화한다.
	public Student(int ID, String name) {
		this.ID=ID;
		this.name=name;
		
	}
	
	//학번과 이름을 출력한다.
	public void printAll() {
		System.out.println(ID + "의 이름: " + name);
	}
	
	

}
