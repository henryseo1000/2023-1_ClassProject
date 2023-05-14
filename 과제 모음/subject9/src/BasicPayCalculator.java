public class BasicPayCalculator { // 주급을 계산한다
    int wage = 0; // 평일 시간당 임금
    int work_time = 0; // 평일 근무 시간

    //평일 시간당 임금을 주어진 값으로 초기화하고 평일 근무 시간은 0으로 초기화하면서 BasicPayCalculator 객체를 생성
    BasicPayCalculator(int wage_){
        wage = wage_;
        work_time = 0;
    }

    //직원의 평일 추가 근무시간을 넘겨 받아 평일 근무시간에 더할 수 있어야 한다.
    public void addTime(int add){
        work_time += add;
    }

    //평일 시간당 임금을 주어진 값으로 변경
    public void setWage(int wage) {
        this.wage = wage;
    }

    //평일 근무 시간을 주어진 값으로 변경
    public void setWork_time(int work_time) {
        this.work_time = work_time;
    }

    //매주 평일 근무시간이 40 시간 이하이면 평일 시간당 임금 * 근무 시간이다.
    //매주 평일 근무시간이 40 시간을 초과하면 40 * 평일 시간당 임금 + (평일 근무 시간 – 40) * 평일 시간당 임금 * 1.5 이다.
    public double Calculate(){
        double week_wage = 0; // 주급
        if(work_time <= 40){
            week_wage = wage * work_time;
        }
        else{
            week_wage = 40 * wage + (work_time - 40) * wage * 1.5;
        }
        return week_wage;
    }
}
