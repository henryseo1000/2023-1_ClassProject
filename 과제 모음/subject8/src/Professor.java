public class Professor {
    String name; // 이름
    String major; // 소속 학과
    String subject; // 강의 과목

    Professor(String name_, String major_, String subject_){
        name = name_;
        major = major_;
        subject = subject_;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getSubject() {
        return subject;
    }
}
