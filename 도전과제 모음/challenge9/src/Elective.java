public class Elective extends Course{   //Course에게 상속을 받는다.

    //선택 과목의 이름과 번호를 각각 넘겨 받은 값으로 초기화하면서 Elective 객체를 생성
    Elective(String n, String num){
        super(n, num);
    }

    //선택 과목의 모든 데이터를 알려준다.
    public String printAll(){
        return "선택 과목: \n" + super.printAll() + "\n";
    }
}
