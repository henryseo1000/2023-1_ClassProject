public class Member {
    int num;
    String name;
    int total;
    public Member(int n, String name_){
        num = n;
        name = name_;
        total = 0;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String printAll(){
        return num + "\t" + name + "\t\t" + total;
    }
}
