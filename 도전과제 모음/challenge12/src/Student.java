public class Student {
    int id;
    String name;
    String sex;
    String p_num;
    String addr;
    String major;
    String hobby;
    String intro;

    public Student(int i, String n, String s, String p, String a, String m, String h, String in){
        id = i;
        name = n;
        sex = s;
        p_num = p;
        addr = a;
        major = m;
        hobby = h;
        intro = in;
    }

    public void printAll(){
        System.out.println(id + "\t" + name + "\t" + sex + "\t" + p_num + "\t" + addr + "\t" + major + "\t" + hobby + "\t" + intro);
    }
}
