public class Driver {
    public static void main(String[] args) {
        Course c1[] = new Course[50];
        int count = 0;

        c1[count] = new Major("자바", "CS101", "컴퓨터공학", "C");
        System.out.println(c1[count]. printAll());
        count++;

        c1[count] = new Major("이산 수학", "CS215", "컴퓨터공학", "없음");
        System.out.println(c1[count]. printAll());
        count++;

        c1[count] = new GenEdu("물리학", "PHS210", "학문기초교양");
        System.out.println(c1[count]. printAll());
        count++;

        c1[count] = new GenEdu("영어 1", "ENG101", "공통교양");
        System.out.println(c1[count]. printAll());
        count++;

        c1[count] = new Elective("테니스", "REC310");
        System.out.println(c1[count]. printAll());
        count++;
    }
}