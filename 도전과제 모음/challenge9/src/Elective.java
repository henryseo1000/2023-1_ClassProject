public class Elective extends Course{

    Elective(String n, String num){
        super(n, num);
    }
    public String printAll(){
        return "선택 과목: \n" + super.printAll() + "\n";
    }
}
