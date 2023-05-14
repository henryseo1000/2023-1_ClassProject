public class DangerPayCalculator extends BasicPayCalculator{ // 위험한 근무를 포함하여 주급을 계산
    int danger = 0; // 위험 근무 시간

    //평일 시간당 임금을 주어진 값으로 초기화하고
    //평일 근무 시간과 위험 근무 시간을 각각 0으로 초기화하면서 DangerPayCalculator 객체를 생성
    DangerPayCalculator(int wage_){
        super(wage_);
        danger = 0;
    }

    //위험 근무 직원의 위험 근무 시간을 주어진 값으로 변경할 수 있어야 한다.
    public void setDanger(int danger) {
        this.danger = danger;
    }

    //위험 근무 직원의 주급을 계산해야 한다.
    //위험 근무 직원이 위험한 일을 수행하면 시간당 임금이 평일 시간당 임금의 5배이다.
    public double Calculate(){
        double week_wage = 0; // 주급
        if(work_time <= 40){
            week_wage = wage * work_time + danger * wage * 5;
        }
        else{
            week_wage = 40 * wage + (work_time - 40) * wage * 1.5 + danger * wage * 5;
        }
        return week_wage;
    }
}
