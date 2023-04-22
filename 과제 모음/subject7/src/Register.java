public class Register {
    Course Cour;
    Student Stu;

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

    public String printAll(){
        return Stu.getName() + ": " + Cour.getName() + " 수강 신청";
    }
}
