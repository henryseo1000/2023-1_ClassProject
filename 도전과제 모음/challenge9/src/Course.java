public class Course {
    String name; //교과목명
    String Cour_num; //교과목 번호

    //교과목의 이름과 번호를 각각 넘겨 받은 값으로 초기화하면서 Course 객체를 생성
    Course(String n, String num){
        name = n;
        Cour_num = num;
    }

    //교과목의 이름을 알려준다.
    public String getName() {
        return name;
    }

    //교과목의 번호를 알려준다.
    public String getCour_num() {
        return Cour_num;
    }

    //교과목의 모든 데이터를 한꺼번에 반환
    public String printAll(){
        return "교과목명: " + name + "\n교과목 번호: " + Cour_num;
    }

    //교과목의 이름을 넘겨 받은 값으로 변경
    public void setName(String name) {
        this.name = name;
    }

    //교과목의 번호를 넘겨 받은 값으로 변경
    public void setCour_num(String cour_num) {
        Cour_num = cour_num;
    }
}
