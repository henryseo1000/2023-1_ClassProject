public class Driver {
    public static void main(String[] args) {
        CD1 c1 = new CD1("선남", 100, 12, 0.05, 10000000);
        CD2 c2 = new CD2("선녀", 200, 12, 0.05, 10000000);
        SavingAccount s1 = new SavingAccount("길동", 300, 12, 0.05, 100000);

        System.out.println("정기예금(단리)");
        System.out.println(c1.printAll());
        System.out.print("원리금: ");
        System.out.println(c1.Calculate() + "\n");

        System.out.println("정기예금(복리)");
        System.out.println(c2.printAll());
        System.out.print("원리금: ");
        System.out.println(c2.Calculate() + "\n");


        System.out.println("정기적금");
        System.out.println(s1.printAll());
        System.out.print("원리금: ");
        System.out.println(s1.Calculate() + "\n");
    }
}