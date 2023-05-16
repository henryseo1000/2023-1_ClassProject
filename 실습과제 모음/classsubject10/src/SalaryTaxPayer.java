public class SalaryTaxPayer extends TaxPayer{ //근로소득자
    int salary; //월급

    SalaryTaxPayer(String n, int num, int s){
        super(n, num);
        salary = s;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public double ComputeTax(){
        int year_salary = salary * 12;
        double tax;

        if(year_salary > 80000000){
            tax = year_salary * 0.3;
        }
        else if(year_salary > 60000000){
            tax = year_salary * 0.2;
        }
        else if(year_salary > 40000000){
            tax = year_salary * 0.15;
        }
        else if(year_salary > 20000000){
            tax = year_salary * 0.1;
        }
        else{
            tax = year_salary * 0.05;
        }

        return tax;
    }

    @Override
    public String printAll() {
        return super.printAll() + ", 월급: " + salary + "\n" + name + "의 세금 = " + this.ComputeTax() + "\n";
    }
}
