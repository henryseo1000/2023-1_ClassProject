public class Dog extends Pet{
    String kind; //품종
    boolean vaccination; //예방접종 여부

    Dog(){
        kind = "진돗개";
        vaccination = false;
    }
    Dog(String name_, int age_, String kind_){
        name = name_;
        age = age_;
        kind = kind_;
        vaccination = false;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setVaccination(boolean vaccination) {
        this.vaccination = vaccination;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String print(){
        if (vaccination) {
            return "이름: " + name + "\n나이: " + age + "\n품종: " + kind + "\n예방주사를 맞았다\n";
        }
        else{
            return "이름: " + name + "\n나이: " + age + "\n품종: " + kind + "\n예방주사를 맞지 않았았다\n";
        }
    }
}
