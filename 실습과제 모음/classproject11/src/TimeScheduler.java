import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeScheduler {
    public static void main(String[] args) {
        Student s_list[] = new Student[6];
        int time;
        int num;
        String name;
        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        System.out.println("상담 시간 예약하기");
        System.out.println("가능한 상담시간: 오후 1시, 2시, 3시, 4시, 5시, 6시\n");

        while(true){
            System.out.print("학생의 학번을 입력하세요: ");
            num = sc.nextInt();

            System.out.print("학생의 이름을 입력하세요: ");
            name = sc.next();

            while(true) {
                try {
                    System.out.print("원하는 상담시간(1, 2, 3, 4, 5, 6, 중 선택): ");
                    time = sc.nextInt();

                    if (time > 6 || time < 1) {
                        throw new InvalidTimeException("선택한 시간이 범위 밖에 있음");
                    }
                    if (s_list[time - 1] != null) {
                        throw new TimeInUseException("선택한 시간은 이미 예약됨");
                    }

                    s_list[time - 1] = new Student(num, name);
                    break;

                } catch (InputMismatchException e) {
                    System.out.print("예외 처리함: ");
                    System.out.println("시간은 정수여야 합니다");
                    sc.next();
                } catch (InvalidTimeException e) {
                    System.out.print("예외 처리함: ");
                    System.out.println(e.getMessage());
                } catch (TimeInUseException e) {
                    System.out.print("예외 처리함: ");
                    System.out.println(e.getMessage());
                }
            }

            for(int i = 0 ; i < 6; i++){
                if (s_list[i] == null){
                    break;
                }
                else if (i == 5){
                    valid = true;
                }
            }

            if(valid){
                break;
            }
        }

        System.out.println("\n상담 시간 예약 목록\n");

        System.out.println("상담 시간\t\t\t학번\t\t이름");
        for(int i = 0 ; i < 6; i++){
            System.out.println("  " + (i + 1) + "\t\t\t\t" + s_list[i].getNum() + "\t\t" +s_list[i]. getName());
        }
    }
}