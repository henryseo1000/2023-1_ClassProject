public class Driver {
    public static void main(String[] args) {
        Course c1 = new Course("알고리즘", 30, 4);
        Course c2 = new Course("자료구조", 25, 3);

        System.out.println("수강 신청전\n");
        System.out.println("교과목명\t\t최대 학생수\t현재 학생수");
        System.out.println(c1.printAll());
        System.out.println(c2.printAll());

        c1.incLimit(6);
        c2.incLimit(3);

        System.out.println("\n수강 인원 증원 후\n");
        System.out.println("교과목명\t\t최대 학생수\t현재 학생수");
        System.out.println(c1.printAll());
        System.out.println(c2.printAll());

        System.out.println("\n생성된 교과목들의 수: " + c1.getNum() + "\n");

        Student s1 = new Student(2101,"선남", 18);
        Student s2 = new Student(2102,"선녀", 21);
        Student s3 = new Student(2103,"길동", 18);

        System.out.println("학번\t\t이름\t\t신청 학점수");
        System.out.println(s1.printAll());
        System.out.println(s2.printAll());
        System.out.println(s3.printAll());
        System.out.println();

        Register r1 = new Register(c1, s1);
        Register r2 = new Register(c1, s2);
        Register r3 = new Register(c2, s2);
        Register r4 = new Register(c1, s3);
        Register r5 = new Register(c2, s3);

        System.out.println(r1.printAll());
        System.out.println(r2.printAll());
        System.out.println(r3.printAll());
        System.out.println(r4.printAll());
        System.out.println(r5.printAll());

        System.out.println("\n수강 신청후\n");
        System.out.println("교과목명\t\t최대 학생수\t현재 학생수");
        System.out.println(c1.printAll());
        System.out.println(c2.printAll());
        System.out.println();

        System.out.println("학번\t\t이름\t\t학점수");
        System.out.println(s1.printAll());
        System.out.println(s2.printAll());
        System.out.println(s3.printAll());
    }
}