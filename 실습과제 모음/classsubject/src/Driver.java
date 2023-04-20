import java.util.Scanner;

public class Driver {
    public static void main(String[] args) { // 메인 메소드
        Concert c1 = new Concert("가수왕", 100, 10000, 20000); // 콘서트 객체 생성
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        String answer = ""; // 대답 저장하는 문자열

        System.out.println("콘서트 판매 프로그램을 시작합니다\n"); // 프로그램 시작을 알림

        while (true){
            if(c1.isAvailable()) { // 인터넷 판매 여부 판단
                System.out.print("인터넷 판매이면 S, 현장 판매로 바꾸려면 V, 판매를 종료하려면 F를 입력하세요: "); // 인터넷 판매 상태일 때 안내 문구 출력
                answer = sc.next(); // 대답 입력 받기
                if (answer.equals("S")) { // S일 때 sell 메소드 호출
                    c1.sell();
                } else if (answer.equals("V")) { // V일 때 인터넷 판매 가능 여부를 false로 바꾸고 남은 티켓 수 출력
                    c1.setAvailable(false);
                } else if (answer.equals("F")) { // F일 때 남은 티켓 수 출력 후 반복문 탈출
                    System.out.println("남은 티켓들의 수: " + c1.left_ticket() + "\n");
                    break;
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
            else { // 인터넷 판매 상태가 아닐 때 안내 문구 출력
                System.out.print("현장 판매이면 S, 판매를 종료하려면 F를 입력하세요: ");
                answer = sc.next(); // 대답 입력받기
                if (answer.equals("S")) { // S일 경우 sell 메소드를 호출
                    c1.sell();
                } else if (answer.equals("F")) { // F일 경우 남은 티켓 출력 후 반복문 탈출
                    System.out.println("남은 티켓들의 수: " + c1.left_ticket() + "\n");
                    break;
                } else { // 그 외는 잘못 입력하셨습니다를 출력하고 남은 티켓 출력
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
            System.out.println("남은 티켓들의 수: " + c1.left_ticket() + "\n");
        }
        c1.result();
    }
}