import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        double total_male, total_female;
        Student male = new Student();
        Student female = new Student();

        male.setName("선남");
        female.setName("선녀");

        male.getgrade();
        female.getgrade();
    }
}
