public class Student {
    int stu_id = 0; // 학번
    String name = ""; // 이름
    int grade = 0; // 신청 학점수
    int max_grade = 0; // 최대 신청 학점수

    // 객체를 생성할 때 학번, 이름, 최대 신청 학점수를 받아 초기화한다.
    // 이때 신청 학점수는 처음에 0이다.
    Student(int id_, String name_, int max_){
        stu_id = id_;
        name = name_;
        max_grade = max_;
        grade = 0;
    }

    // 학번 반환
    public int getStu_id() {
        return stu_id;
    }

    // 이름 반환
    public String getName() {
        return name;
    }

    // 신청 학점수를 반환
    public int getGrade() {
        return grade;
    }

    // 최대 신청 학점수를 반환
    public int getMax_grade() {
        return max_grade;
    }

    // 학번을 주어진 값으로 변경
    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    // 이름을 주어진 값으로 변경
    public void setName(String name) {
        this.name = name;
    }

    // 최대 신청 학점수를 주어진 값으로 변경
    public void setMax_grade(int max_grade) {
        this.max_grade = max_grade;
    }

    // 신청 학점수를 주어진 값으로 변경
    public void setGrade(int grade_) {
        this.grade = grade_;
    }

    // 객체의 데이터를 문자열의 형태로 반환
    public String printAll(){
        return stu_id + "\t" + name + "\t\t" + grade;
    }
}
