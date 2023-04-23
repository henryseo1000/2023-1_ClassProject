public class Register {
    Course Cour;
    Student Stu;

    // 학생과 교과목을 각각 주어진 값으로 초기화
    // 이 때 교과목의 수강 인원수가 최대 수강 인원수보다 작다면 수강 인원수를 1만큼 증가시키고 아니라면 ‘정원이 차서 수강 신청할 수 없다.’를 출력해야 한다.
    // 또한 학생의 신청 학점수에 교과목의 학점수를 더한 값이 학생의 최대 신청 학점수보다 작거나 같다면 학생의 신청 학점수를 갱신하고 아니라면 ‘학점 초과로 수강 신청할 수 없다.’를 출력해야 한다.
    Register(Course c, Student s){
        Cour = c;
        Stu = s;

        if(c.getNum_student() < c.getLimit()){
            c.inc(1);
        }
        else {
            System.out.println("정원이 차서 수강 신청할 수 없다.");
        }
        if(s.getGrade() + c.getGrade() <= s.getMax_grade()){
            s.setGrade(s.getGrade() + c.getGrade());
        }
        else {
            System.out.println("학점 초과로 수강 신청할 수 없다.");
        }
    }

    // 객체의 학생 이름, 교과목명과 '수강 신청' 글자를 문자열의 형태로 반환한다.
    public String printAll(){
        return Stu.getName() + ": " + Cour.getName() + " 수강 신청";
    }
}
