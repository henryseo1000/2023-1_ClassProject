public class BasicPayCalculator { // 주급을 계산한다
    int wage = 0; // 평일 시간당 임금
    int work_time = 0; // 평일 근무 시간
    double week_wage = 0; // 주급

    BasicPayCalculator(int wage_){
        wage = wage_;
        work_time = 0;
    }

    public void addTime(int add){
        work_time += add;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setWork_time(int work_time) {
        this.work_time = work_time;
    }

    public double Calculate(){
        if(work_time <= 40){
            week_wage = wage * work_time;
        }
        else{
            week_wage = 40 * wage + (work_time - 40) * wage * 1.5;
        }
        return week_wage;
    }
}
