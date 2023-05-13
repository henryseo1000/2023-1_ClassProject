public class Driver {
    public static void main(String[] args) {
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