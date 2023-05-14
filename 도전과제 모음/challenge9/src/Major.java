public class Major extends Course{  //Course에게 상속을 받는다
    String major; //전공
    String previous; //선수 과목

    //전공 과목의 이름, 번호, 전공과 선수 과목을 각각 넘겨 받은 값으로 초기화하면서 Major 객체를 생성
    Major(String n, String num, String m, String p){
        super(n, num);
        major = m;
        previous = p;
    }

    //전공을 넘겨받은 값으로 설정한다.
    public void setMajor(String major) {
        this.major = major;
    }

    //선수 과목을 넘겨받은 값으로 설정한다.
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    //전공을 반환한다.
    public String getMajor() {
        return major;
    }

    //선수과목을 반환한다.
    public String getPrevious() {
        return previous;
    }

    //전공과목의 모든 데이터를 알려준다.
    public String printAll(){
        return super.printAll() + "\n전공: " + major + "\n선수과목: " + previous + "\n";
    }
}
