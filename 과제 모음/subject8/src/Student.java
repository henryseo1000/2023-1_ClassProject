public class Student {
    int id; //학번
    String name; //이름
    String[] subject; //수강 과목 목록
    int max; //목록의 최대 크기
    int num_sub; //과목들의 수

    //학생의 학번, 이름을 넘겨 받은 값으로 초기화
    Student(int id_, String name_){
        id = id_;
        name = name_;
        num_sub = 0;
        max = 10;

        subject = new String[max];
    }

    //수강 과목 목록을 반환
    public String subject_List(){
        String list = "";
        for(int i = 0; i < subject.length; i++){
            if(subject[i] != null) {
                if (i != 0) {
                    list = list + " " + subject[i];
                } else {
                    list = list + subject[i];
                }
            }
        }
        return list;
    }

    //학생의 수강 과목 목록에 새 과목을 추가할 수 있어야 한다.
    public void add_subject(String subject_){
        if(num_sub == max){
            System.out.println("과목 목록이 모두 찼습니다.");
        }
        else{
            num_sub ++;
            subject[num_sub - 1] = subject_;
        }
    }
}
