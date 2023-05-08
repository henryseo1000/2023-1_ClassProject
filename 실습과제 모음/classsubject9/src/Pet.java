public class Pet {
    String name; //이름
    int age; //나이

    Pet(){
        name = "하루";
        age = 3;
    }

    Pet(String name_, int age_){
        name = name_;
        age = age_;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String printAll(){
        return "이름: " + name + " 나이: " + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
