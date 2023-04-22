import java.util.Scanner;

public class Concert {
    String singer = ""; // 가수명
    int limit = 0; // 수용 최대 인원
    int sold_ticket = 0; // 총 팔린 티켓
    int online_price = 0; // 인터넷 가격
    int original_price = 0; // 현장 판매 가격
    int total_sold = 0; // 총 판매 가격
    boolean available = true; // 인터넷 판매 가능 여부

    // 가수 이름, 수용인원, 인터넷과 현장 티켓 가격으로 객체 생성
    Concert(String name, int people, int price1, int price2) {
        singer = name;
        limit = people;
        online_price = price1;
        original_price = price2;
    }

    // 인터넷 판매에서 현장 판매로 변경
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // 총 팔린 티켓 수 반환
    public int getSold_ticket() {
        return sold_ticket;
    }

    // 총 판매 금액 반환
    public int getTotal_sold() {
        return total_sold;
    }

    // 인터넷 판매 가능 여부를 알려줌
    public boolean isAvailable() {
        return available;
    }

    // 남은 티켓 수 반환
    public int left_ticket() {
        return limit - sold_ticket;
    }

    // 최종 판매 보고서 : 팔린 티켓 수와 총 판매 금액을 알려주어야 한다.
    public void result() {
        System.out.println("최종 판매 보고서\n");
        System.out.println(singer + " 콘서트 티켓 판매 내역:");
        System.out.println("팔린 티켓 수: " + sold_ticket + " 총 판매 금액 " + total_sold);
    }

    // 티켓 개수를 입력받아 판다.
    public void sell() {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("파는 티켓들 수는? <최대 " + left_ticket() + "> ");
        num = sc.nextInt();

        if (!sellTicket(num)) {
            System.out.println("죄송합니다, 판매를 완료할 수 없습니다");
        } else {
            ticketPrice(num);
            sold_ticket += num; // 판매 기록 갱신
        }
    }

    // 정수를 입력 받고 판매 가능한 개수인지 리턴한다.
    public boolean sellTicket(int num) {
        if (num > left_ticket()) {
            return false;
        } else {
            return true;
        }
    }

    // 티켓들의 총 가격을 출력한다.
    public void ticketPrice(int num) {
        total_sold += num * online_price;
        if (available) {
            System.out.println("티켓들의 총 가격 = " + num * online_price);
        } else {
            System.out.println("티켓들의 총 가격 = " + num * original_price);
        }
    }
}
