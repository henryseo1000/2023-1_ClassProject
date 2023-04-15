public class Driver {
    public static void main(String[] args) {
        ItemSales s1 = new ItemSales();
        s1.setBig_sell(10);
        s1.setBig_sale(0.3);
        s1.setPrice(1000);
        s1.receipt(1);
        s1.receipt(9);
        s1.receipt(10);
        s1.receipt(50);
    }
}