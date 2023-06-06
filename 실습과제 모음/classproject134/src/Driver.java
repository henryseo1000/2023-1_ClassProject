public class Driver {
    public static void main(String[] args) {
        Item it1 = new Item("노트북", 200000, 100);
        Item it2 = new Item("컴퓨터", 500000, 50);

        System.out.println("주문 전\n");
        System.out.println("상품명\t가격\t\t현 재고");
        System.out.println(it1.printAll());
        System.out.println(it2.printAll());

        Member mem1 = new Member(2101, "선남");
        Member mem2 = new Member(2102, "선녀");
        Member mem3 = new Member(2103, "길동");

        System.out.println("\n번호\t\t이름\t\t총 구매금액");

        System.out.println(mem1.printAll());
        System.out.println(mem2.printAll());
        System.out.println(mem3.printAll());

        Order ord1 = new Order(mem1, it1, 10);
        Order ord2 = new Order(mem2, it1, 20);
        Order ord3 = new Order(mem2, it2, 30);
        Order ord4 = new Order(mem3, it1, 5);
        Order ord5 = new Order(mem3, it2, 15);

        System.out.println("\n" + ord1.printAll());
        System.out.println(ord2.printAll());
        System.out.println(ord3.printAll());
        System.out.println(ord4.printAll());
        System.out.println(ord5.printAll());

        System.out.println("\n주문 후\n");
        System.out.println("상품명\t가격\t\t현 재고");
        System.out.println(it1.printAll());
        System.out.println(it2.printAll());

        it1.incLeft(20);
        it2.incLeft(30);

        System.out.println("\n재고 추가후\n");
        System.out.println("상품명\t가격\t\t현 재고");
        System.out.println(it1.printAll());
        System.out.println(it2.printAll());

        System.out.println("\n번호\t\t이름\t\t총 구매금액");

        System.out.println(mem1.printAll());
        System.out.println(mem2.printAll());
        System.out.println(mem3.printAll());
    }
}