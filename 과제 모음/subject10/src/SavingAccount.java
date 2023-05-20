public class SavingAccount extends Account{ //정기 적금
    int not; //월불입액

    SavingAccount(String n, int num, int p, double i, int no){
        super(n,num,p,i);
        not = no;
    }
    public int Calculate(){
        return (int)(not * period + not * interest_rate / 12 * period * (period + 1) / 2);
    }
    public String printAll(){
        return super.printAll() + "\n월입불액: " + not;
    }
}
