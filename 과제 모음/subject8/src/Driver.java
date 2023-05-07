import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Professor[] plist = new Professor[50];
        Student[] slist = new Student[50];

        inputProInfo(plist);
        inputStudInfo(slist);
        registerCourses(slist);
        printResult(slist);
    }

    //교수의 이름, 소속 학과명과 교과목명을 입력받는다. 강의할 교수가 없을때까지 계속한다.
    public static void inputProInfo(Professor[] p){
        Scanner sc = new Scanner(System.in);
        boolean add = true;
        String answer = "";
        int count = 0;

        while(add) {
            System.out.print("교수 이름을 입력하세요: ");
            String name = sc.next();
            System.out.print("학과명을 입력하세요: ");
            String major = sc.next();
            System.out.print("교과목명을 입력하세요: ");
            String subject = sc.next();

            p[count] = new Professor(name, major, subject);

            System.out.print("추가할 교수가 더 있나요?(Yes or No): ");
            answer = sc.next();

            if(answer.equals("No")){
                add = false;
            }

            count ++;
        }
        System.out.println();
    }

    //교수들의 강의 과목들을 수강하는 학생의 이름과 학번을 입력받고, 수강할 학생이 없을 때까지 계속한다.
    public static void inputStudInfo(Student[] s){
        Scanner sc = new Scanner(System.in);
        boolean add = true;
        String answer = "";
        int count = 0;

        while(add) {
            System.out.print("학생 이름을 입력하세요: ");
            String name = sc.next();
            System.out.print("학번을 입력하세요: ");
            int id = sc.nextInt();

            s[count] = new Student(id, name);

            System.out.print("추가할 학생이 더 있나요?(Yes or No): ");
            answer = sc.next();

            if(answer.equals("No")){
                add = false;
            }

            count ++;
        }
        System.out.println();
    }

    //각 학생마다 수강 신청할 교과목명을 입력받는다. 이는 추가할 교과목이 없을떄까지 계속한다.
    public static void registerCourses(Student[] s){
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String subject = "";

        for(int i = 0; i < s.length; i++){
            if(s[i] != null) {
                while (true) {
                    System.out.print(s[i].name + "이 수강 신청할 교과목명을 입력하세요: ");
                    subject = sc.next();
                    s[i].add_subject(subject);

                    System.out.print("추가할 교과목이 더 있나요?(Yes or No): ");
                    answer = sc.next();

                    if (answer.equals("No")) {
                        break;
                    }
                }
            }
        }

        System.out.println();
    }

    //각 학생이 수강신청한 과목들을 이름과 학번을 같이 출력한다.
    public static void printResult(Student[] s){
        System.out.println("이름\t\t학번\t\t수강과목들");
        for(int i = 0; i < s.length; i++){
            if(s[i] != null) {
                System.out.println(s[i].name + "\t" + s[i].id + "\t" + s[i].subject_List());
            }
        }
    }
}