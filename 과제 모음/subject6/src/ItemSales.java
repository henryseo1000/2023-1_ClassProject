public class ItemSales {
    int sell = 0; // 판매 수량
    double price = 0; // 판매 가격
    int big_sell = 0; // 대량 판매 수량
    double big_sale = 0; // 대량 판매 할인률
    double total_sell = 0; // 총 판매 금액
    double total_sale = 0; // 총 할인 금액

    public int getSell(){
        return sell;
    }
    public double getPrice(){
        return price;
    }
    public int getBig_sell(){
        return big_sell;
    }
    public double getBig_sale(){
        return big_sale;
    }
    public double getTotal_sell(){
        return total_sell;
    }
    public double getTotal_sale(){
        return total_sale;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setBig_sell(int big_sell) {
        this.big_sell = big_sell;
    }
    public void setBig_sale(double big_sale) {
        this.big_sale = big_sale;
    }
    public void setTotal_sell(double total_sell) {
        this.total_sell = total_sell;
    }
    public void setTotal_sale(double total_sale) {
        this.total_sale = total_sale;
    }

    public void receipt(int N){
        if(N == 1){
            System.out.println("도시락 한 개를 팔았다.");
        }
        else{
            System.out.println("도시락 " + N + " 개를 팔았다.");
        }

        sell += N;

        if (N >= big_sell) {
            total_sale += price * N * big_sale;
            total_sell += price * N * (1 - big_sale);
            System.out.println("할인율이 적용되어 판매 가격은 " + price * N * big_sale + "원이다.");
        }
        else {
            total_sell += price * N;
            System.out.println("할인율이 적용되지 않아 판매 가격은 " + price * N + "원이다.");
        }

        System.out.println("\n누적 판매 수량 = " + sell + "개, " + "누적 판매 금액 = " + total_sell + "원, " + "누적 할인 금액 = " + total_sale + "원\n");
    }
}
