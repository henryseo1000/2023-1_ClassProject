public class Major extends Course{
    String major; //전공
    String previous; //선수 과목
    Major(String n, String num, String m, String p){
        super(n, num);
        major = m;
        previous = p;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getMajor() {
        return major;
    }

    public String getPrevious() {
        return previous;
    }

    public String printAll(){
        return super.printAll() + "\n전공: " + major + "\n선수과목: " + previous + "\n";
    }
}
