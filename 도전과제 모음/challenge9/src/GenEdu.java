public class GenEdu extends Course{
    String classification; //이수구분
    GenEdu(String n, String num, String c){
        super(n, num);
        classification = c;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public String printAll(){
        return super.printAll() + "\n이수구분: " + classification + "\n";
    }
}
