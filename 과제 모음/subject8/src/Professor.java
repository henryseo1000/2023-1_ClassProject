public class Professor {
    String name; //이름
    String major; //소속 학과
    String subject; //강의 과목

    //이름, 소속 학과와 강의 과목을 각각 넘겨받은 값으로 초기화하면서 객체 생성
    Professor(String name_, String major_, String subject_){
        name = name_;
        major = major_;
        subject = subject_;
    }

    //이름을 알려준다.
    public String getName() {
        return name;
    }

    //소속 학과를 알려준다.
    public String getMajor() {
        return major;
    }

    //강의 과목을 알려준다.
    public String getSubject() {
        return subject;
    }
}
