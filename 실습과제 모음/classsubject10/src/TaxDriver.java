public class TaxDriver {
    public static void main(String[] args) {
        SalaryTaxPayer e1 = new SalaryTaxPayer("선남", 100, 3000000);
        BusinessTaxPayer b1 = new BusinessTaxPayer("선녀", 200, 120000000, 75000000);

        System.out.println(e1.printAll());
        System.out.println(b1.printAll());
    }
}