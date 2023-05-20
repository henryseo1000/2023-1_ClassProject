public class CD extends Account{   //정기 예금
    int initial; //원금
    CD(String n, int num, int p, double i, int init){
        super(n, num, p, i);
        initial = init;
    }
    public String printAll(){
        return super.printAll() + "\n원금: " + initial;
    }

}
