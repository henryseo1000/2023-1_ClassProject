public class OverPayCalculator extends BasicPayCalculator{  //주말 근무를 포함하여 주급을 계산
    int saturday = 0; // 토요일 근무 시간
    int sunday = 0; // 일요일 근무 시간

    //평일 시간당 임금을 주어진 값으로 초기화하고 평일 근무 시간,
    //토요일 근무 시간과 일요일 근무 시간을 각각 0으로 초기화하면서 OverPayCalculator 객체를 생성
    OverPayCalculator(int wage_){
        super(wage_);
        saturday = 0;
        sunday = 0;
    }

    //토요일 근무 시간을 주어진 값으로 변경
    public void setSaturday(int saturday) {
        this.saturday = saturday;
    }

    //일요일 근무 시간을 주어진 값으로 변경
    public void setSunday(int sunday) {
        this.sunday = sunday;
    }

    //토요일에 근무하면 시간당 임금이 평일보다 2배이고 일요일에 근무하면 시간당 임금이 평일보다 3배이다.
    public double Calculate(){
        double week_wage = 0; // 주급
        if(work_time <= 40){
            week_wage = wage * work_time + saturday * wage * 2 + sunday * wage * 3;
        }
        else{
            week_wage = 40 * wage + (work_time - 40) * wage * 1.5 + saturday * wage * 2 + sunday * wage * 3;
        }
        return week_wage;
    }
}
