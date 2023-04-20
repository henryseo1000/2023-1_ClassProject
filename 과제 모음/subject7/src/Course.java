public class Course {
    String name = ""; // 교과목명
    int limit = 0; // 최대 수강 인원 수
    int num_student = 0; // 수강 인원 수
    int grade = 0; // 학점수
    int num = 0; // Course 객체 수

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void init(){
        num_student = 0;
        Course c1 = new Course();
        num++;
    }

    public String getName() {
        return name;
    }
    public int getLimit() {
        return limit;
    }
    public int getNum_student() {
        return num_student;
    }
    public int getGrade() {
        return grade;
    }
    public int getNum() {
        return num;
    }

    public String printAll(){
        return "교과목명: " + name + " 최대 수강 인원수: " + limit + " 수강 인원수: " + num_student;
    }

    public void incLimit(int num){
        limit += num;
    }
}
