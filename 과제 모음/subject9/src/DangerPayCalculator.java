public class DangerPayCalculator extends BasicPayCalculator{ // 위험한 근무를 포함하여 주급을 계산
    int danger = 0; // 위험 근무 시간
    DangerPayCalculator(int wage_){
        super(wage_);
        danger = 0;
    }

    public void setDanger(int danger) {
        this.danger = danger;
    }

    public double Calculate(){
        if(work_time <= 40){
            week_wage = wage * work_time + danger * wage * 5;
        }
        else{
            week_wage = 40 * wage + (work_time - 40) * wage * 1.5 + danger * wage * 5;
        }
        return week_wage;
    }
}
