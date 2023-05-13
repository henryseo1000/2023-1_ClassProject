public class Course {
    String name; //교과목명
    String Cour_num; //교과목 번호

    Course(String n, String num){
        name = n;
        Cour_num = num;
    }

    public String getName() {
        return name;
    }

    public String getCour_num() {
        return Cour_num;
    }

    public String printAll(){
        return "교과목명: " + name + "\n교과목 번호: " + Cour_num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCour_num(String cour_num) {
        Cour_num = cour_num;
    }
}
