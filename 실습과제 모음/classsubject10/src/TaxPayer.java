public abstract class TaxPayer { //납세자
    String name;
    int number;

    TaxPayer(String n, int num){
        name = n;
        number = num;
    }
    public abstract double ComputeTax();

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String printAll(){
        return "이름: " + name + ", 번호: " + number;
    }
}
