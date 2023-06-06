public class Order {
    Member m1;
    Item i1;
    int order_num;
    static int count = 0;
    public Order(Member m, Item i, int n){
        m1 = m;
        i1 = i;
        order_num = n;

        if(n <= i.getLeft()){
            i.decLeft(n);
            m.setTotal(m.getTotal() + n * i.getPrice());
        }
        else{
            System.out.println("재고가 부족하여 주문을 처리할 수 없다.");
        }

        count++;
    }
    public String printAll(){
        return m1.getName() + ": " + i1.getName() + " " + order_num + "개 주문한다.";
    }

    public static int getCount() {
        return count;
    }
}
