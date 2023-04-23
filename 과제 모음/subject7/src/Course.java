public class Course {
    String name = ""; // 교과목명
    int limit = 0; // 최대 수강 인원 수
    int num_student = 0; // 수강 인원 수
    int grade = 0; // 학점수
    static int num = 0; // Course 객체 수

    // 교과목명, 최대 수강 인원수와 학점수를 각각 주어진 값으로 초기화하고 수강 인원수를 0으로 초기화하면서 Course 객체를 생성한다.
    // 또한 Course 객체가 생성될 때마다 Course 객체들의 수를 1만큼 증가시켜야 한다.
    Course(String name_, int limit_, int grade_){
        name = name_;
        limit = limit_;
        grade = grade_;
        num_student = 0;
        num++;
    }

    // 교과목명을 주어진 값으로 변경한다.
    public void setName(String name) {
        this.name = name;
    }

    // 학점수를 주어진 값으로 변경한다.
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // 최대 수강 인원수를 주어진 값으로 변경한다.
    public void setLimit(int limit) {
        this.limit = limit;
    }

    // 교과목명을 반환
    public String getName() {
        return name;
    }

    // 최대 수강 인원수 반환
    public int getLimit() {
        return limit;
    }

    // 수강 인원수 반환
    public int getNum_student() {
        return num_student;
    }

    // 학점수 반환
    public int getGrade() {
        return grade;
    }

    // 생성된 객체 수 반환
    public int getNum() {
        return num;
    }

    // 객체의 데이터를 한꺼번에 문자열의 형태로 반환한다.
    public String printAll(){
        return name + "\t\t" + limit + "\t\t\t" + num_student;
    }

    // 수강 인원수를 주어진 값만큼 증가시킨다.
    public void inc(int num){
        num_student += num;
    }

    // 최대 수강 인원수를 주어진 값만큼 증가시킨다.
    public void incLimit(int num){
        limit += num;
    }
}
