import java.util.Scanner;

public class Student {
    String name_ = ""; // 학생 이름
    int subject_score = 0; // 과제 점수
    int test_score = 0; // 시험 점수

    public void setName(String name) {
        name_ = name;
    }

    public void setSubject_score(int score) {
        subject_score = score;
    }

    public void setTest_score(int score) {
        test_score = score;
    }


    public double getscore() {
        Scanner sc = new Scanner(System.in);

        System.out.print(name_ + "의 과제 점수를 입력하라: ");
        subject_score = sc.nextInt();

        while(true) {
            if (subject_score < 0 || 100 < subject_score) {
                System.out.println("과제 점수가 0보다 작거나 100보다 크다.");
            }
            else {
                break;
            }

            System.out.print(name_ + "의 과제 점수를 다시 입력하라: ");
            subject_score = sc.nextInt();
        }

        System.out.print(name_ + "의 시험 점수를 입력하라: ");
        test_score = sc.nextInt();

        while(true) {
            if (test_score < 0 || 100 < test_score) {
                System.out.println("시험 점수가 0보다 작거나 100보다 크다.");
            }
            else {
                break;
            }

            System.out.print(name_ + "의 시험 점수를 다시 입력하라: ");
            test_score = sc.nextInt();
        }

        return subject_score * 0.4 + test_score * 0.6;
    }

    // 학점을 산출해주는 함수
    public void getgrade(){
        if (total >= 90){
            System.out.println(name_ + "의 총점은 " + total + "이고 학점은 A이다.");
        }
        else if(total >= 80){
            System.out.println(name_ + "의 총점은 " + total + "이고 학점은 B이다.");
        }
        else if(total >= 70){
            System.out.println(name_ + "의 총점은 " + total + "이고 학점은 C이다.");
        }
        else if(total >= 60){
            System.out.println(name_ + "의 총점은 " + total + "이고 학점은 D이다.");
        }
        else {
            System.out.println(name_ + "의 총점은 " + total + "이고 학점은 F이다.");
        }
    }

    public void getInfo(){
        if (total >= 90){
            System.out.println(name_ + "의 총점은 " + total + "이고 학점은 A이다.");
        }
        else if(total >= 80){
            System.out.println(name_ + "의 총점은 " + total + "이고 학점은 B이다.");
        }
        else if(total >= 70){
            System.out.println(name_ + "의 총점은 " + total + "이고 학점은 C이다.");
        }
        else if(total >= 60){
            System.out.println(name_ + "의 총점은 " + total + "이고 학점은 D이다.");
        }
        else {
            System.out.println(name_ + "의 총점은 " + total + "이고 학점은 F이다.");
        }
    }
}