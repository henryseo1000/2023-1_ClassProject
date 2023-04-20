public class Driver {
    public static void main(String[] args) {
        // ItemSales 객체를 생성한다.
        ItemSales s1 = new ItemSales();

        // 대량 판매 수량은 10, 대량 판매 할인률은 30%, 판매 가격은 1000원으로 설정한다.
        s1.setBig_sell(10);
        s1.setBig_sale(0.3);
        s1.setPrice(1000);

        // 1개 판매 후
        s1.receipt(1);
        s1.printAll();

        // 9개 판매 후
        s1.receipt(9);
        s1.printAll();

        // 10개 판매 후
        s1.receipt(10);
        s1.printAll();

        // 50개 판매 후
        s1.receipt(50);
        s1.printAll();
    }
}