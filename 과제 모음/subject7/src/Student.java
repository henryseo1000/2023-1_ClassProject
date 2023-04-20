public class Student {
    int stu_id = 0; // 학번
    String name = ""; // 이름
    int grade = 0; // 신청 학점수
    int max_grade = 0; // 최대 신청 학점수

    public int getStu_id() {
        return stu_id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getMax_grade() {
        return max_grade;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMax_grade(int max_grade) {
        this.max_grade = max_grade;
    }

    public String printAll(){
        return "학번 : " + stu_id + " 이름 : " + name + " 신청 학점수 : " + grade;
    }
}
