public class OverPayCalculator extends BasicPayCalculator{  //주말 근무를 포함하여 주급을 계산
    int saturday = 0; // 토요일 근무 시간
    int sunday = 0; // 일요일 근무 시간
    OverPayCalculator(int wage_){
        super(wage_);
        saturday = 0;
        sunday = 0;
    }

    public void setSaturday(int saturday) {
        this.saturday = saturday;
    }

    public void setSunday(int sunday) {
        this.sunday = sunday;
    }

    public double Calculate(){
        if(work_time <= 40){
            week_wage = wage * work_time + saturday * wage * 2 + sunday * wage * 3;
        }
        else{
            week_wage = 40 * wage + (work_time - 40) * wage * 1.5 + saturday * wage * 2 + sunday * wage * 3;
        }
        return week_wage;
    }
}
