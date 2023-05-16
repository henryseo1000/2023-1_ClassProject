public class BusinessTaxPayer extends TaxPayer{ //사업소득자
    int total_take; //총매출액
    int total_expense; //총비용

    BusinessTaxPayer(String n, int num, int t, int e){
        super(n, num);
        total_take = t;
        total_expense = e;
    }
    public void setTotal_take(int total_take) {
        this.total_take = total_take;
    }

    public void setTotal_expense(int total_expense) {
        this.total_expense = total_expense;
    }

    public int getTotal_take() {
        return total_take;
    }

    public int getTotal_expense() {
        return total_expense;
    }

    public double ComputeTax(){
        int taxation = total_take - total_expense;
        double tax;
        if(taxation > 40000000){
            tax = taxation * 0.2;
        }
        else if(taxation > 0){
            tax = taxation * 0.1;
        }
        else{
            tax = 0;
        }
        return tax;
    }

    @Override
    public String printAll() {
        return super.printAll() + ", 총매출액: " + total_take + ", 총비용: " + total_expense + "\n" + name + "의 세금 = " + this.ComputeTax() + "\n";
    }
}
