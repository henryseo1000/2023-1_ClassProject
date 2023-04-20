public class ItemSales {
    int sell = 0; // 판매 수량
    double price = 0; // 판매 가격
    int big_sell = 0; // 대량 판매 수량
    double big_sale = 0; // 대량 판매 할인률
    double total_sell = 0; // 총 판매 금액
    double total_sale = 0; // 총 할인 금액

    public int getSell(){
        return sell;
    } // 판매 수량을 반환한다.
    public double getPrice(){
        return price;
    } // 판매 가격을 반환한다.
    public int getBig_sell(){
        return big_sell;
    } // 대량 판매 수량을 반환한다.
    public double getBig_sale(){
        return big_sale;
    } // 대량 판매 할인률을 반환한다.
    public double getTotal_sell(){
        return total_sell;
    } // 총 판매 금액을 반환한다.
    public double getTotal_sale(){
        return total_sale;
    } // 총 할인 금액을 반환한다.

    public void setSell(int sell) {
        this.sell = sell;
    } // 판매 수량을 설정한다.
    public void setPrice(int price) {
        this.price = price;
    } // 판매 가격을 설정한다.
    public void setBig_sell(int big_sell) {
        this.big_sell = big_sell;
    } // 대량 판매 수량을 설정한다.
    public void setBig_sale(double big_sale) {
        this.big_sale = big_sale;
    } // 대량 판매 할인률을 설정한다.
    public void setTotal_sell(double total_sell) {
        this.total_sell = total_sell;
    } // 총 판매 금액을 설정한다.
    public void setTotal_sale(double total_sale) {
        this.total_sale = total_sale;
    } // 총 할인 금액을 설정한다.

    // 판매 내역 작성 메소드
    public void receipt(int N){

        // 1개인 경우는 '한 개', 그 외는 숫자로 개수를 표시한다.
        if(N == 1){
            System.out.println("도시락 한 개를 팔았다.");
        }
        else{
            System.out.println("도시락 " + N + " 개를 팔았다.");
        }

        // 판매 개수에 N을 더해준다.
        sell += N;

        // N이 대량 판매 개수 이상일 경우와 아닐 경우 - 할인을 하고 안하고의 차이
        if (N >= big_sell) {
            // 할인될 경우 할인된 가격을 총 가격에 더하고 할인된 만큼의 가격을 할인 누적 가격에 더해준다.
            total_sale += price * N * big_sale;
            total_sell += price * N * (1 - big_sale);
            System.out.println("할인율이 적용되어 판매 가격은 " + price * N * big_sale + "원이다.");
        }
        else {
            total_sell += price * N;
            System.out.println("할인율이 적용되지 않아 판매 가격은 " + price * N + "원이다.");
        }
    }

    // 객체 상태를 출력하는 메소드
    public void printAll(){
        System.out.println("\n누적 판매 수량 = " + sell + "개, " + "누적 판매 금액 = " + total_sell + "원, " + "누적 할인 금액 = " + total_sale + "원\n");
    }
}
