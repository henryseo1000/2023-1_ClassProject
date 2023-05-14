public class Driver {
    public static void main(String[] args) {
        //(1)	평일 시간당 임금이 8,000원인 OverPayCalculator 객체를 생성한다.
        //(2)	OverPayCalculator 객체의 평일 추가 근무시간을 50만큼 늘린다.
        //(3)	OverPayCalculator 객체의 토요일 근무 시간을 6으로 변경한다.
        //(4)	OverPayCalculator 객체의 일요일 근무 시간을 2로 변경한다.
        //(5)	OverPayCalculator 객체의 주급을 출력한다.
        //(6)	평일 시간당 임금이 10,000원인 DangerPayCalculator 객체를 생성한다.
        //(7)	DangerPayCalculator 객체의 평일 추가 근무시간을 36만큼 늘린다.
        //(8)	DangerPayCalculator 객체의 위험 근무 시간을 6으로 변경한다.
        //(9)	DangerPayCalculator 객체의 주급을 출력한다.

        OverPayCalculator c1 = new OverPayCalculator(8000);
        c1.addTime(50);
        c1.setSaturday(6);
        c1.setSunday(2);

        System.out.print("주말 근무 직원의 주급: ");
        System.out.println(c1.Calculate());

        DangerPayCalculator d1 = new DangerPayCalculator(10000);
        d1.addTime(36);
        d1.setDanger(6);
        d1.Calculate();

        System.out.print("위험 근무 직원의 주급: ");
        System.out.println(d1.Calculate());
    }
}