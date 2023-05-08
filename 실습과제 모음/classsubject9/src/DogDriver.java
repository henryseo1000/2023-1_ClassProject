import java.util.Scanner;

public class DogDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog d1 = new Dog();
        Dog d2;
        String name = "";
        int age = 0;
        String kind = "";
        String vaccination = "";

        d1.setVaccination(true);

        System.out.print("개의 이름을 입력하세요: ");
        name = sc.next();
        System.out.print("개의 나이를 입력하세요: ");
        age = sc.nextInt();
        System.out.print("개의 품종을 입력하세요: ");
        kind = sc.next();

        d2 = new Dog(name, age, kind);

        System.out.print("예방주사를 맞았나요(예 혹은 아니오)?: ");
        vaccination = sc.next();

        if(vaccination.equals("예")){
            d2.setVaccination(true);
        }
        else{
            d2.setVaccination(false);
        }

        System.out.println(d1.print());
        System.out.println(d2.print());

        System.out.println("다음 개들은 두 살이 넘었으나 예방주사를 맞지 않았다: ");
        if ((!d1.vaccination) && (d1.getAge() > 2)){
            System.out.println(d1.printAll());
        }
        if ((!d2.vaccination) && (d2.getAge() > 2)){
            System.out.println(d2.printAll());
        }
    }
}