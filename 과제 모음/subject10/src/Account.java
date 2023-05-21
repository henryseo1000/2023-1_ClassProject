public abstract class Account {  //예적금 통장
    String name; //계좌 이름
    int Account_num; //계좌 번호
    int period; //계약 기관
    double interest_rate; //연이율

    // 객체 생성
    Account(String n, int num, int p, double i){
        name = n;
        Account_num = num;
        period = p;
        interest_rate = i;
    }

    // 예적금 유형이 결정되기 전에는 이자 계산 불가(추상 클래스)
    public abstract int Calculate();

    // 통장 정보 출력
    public String printAll(){
        return "예금주 이름: " + name + "\n계좌번호: " + Account_num + "\n계약기간: " + period + "\n연이율: " + interest_rate;
    }
}
