public class GenEdu extends Course{ // Course에게 상속 받음
    String classification; //이수구분

    // 교양 과목의 이름, 번호와 이수구분을 각각 넘겨 받은 값으로 초기화하면서 GenEdu 객체를 생성
    GenEdu(String n, String num, String c){
        super(n, num);
        classification = c;
    }

    // 이수 구분을 주어진 값으로 변경
    public void setClassification(String classification) {
        this.classification = classification;
    }

    // 이수 구분을 알려줌
    public String getClassification() {
        return classification;
    }

    // 교양 과목의 모든 데이터를 알려준다.
    public String printAll(){
        return super.printAll() + "\n이수구분: " + classification + "\n";
    }
}
