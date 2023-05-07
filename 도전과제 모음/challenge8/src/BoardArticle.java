public class BoardArticle {
    String writer; //작성자
    String Title; //제목
    String password; //암호
    String email; //이메일 주소
    String article; //내용

    //작성자, 제목, 암호, 이메일 주소, 내용을 각각 주어진 값으로 초기화하면서 객체를 생성한다.
    BoardArticle(String w, String t, String p, String e, String a){
        writer = w;
        Title = t;
        password = p;
        email = e;
        article = a;
    }

    //암호를 제외한 모든 정보를 알려준다.
    public String except_password(){
        return "작성자: " + writer + ", 이메일: " + email + ", 제목: " + Title + ", 글 내용: " + article;
    }

    //작성자를 주어진 값으로 변경한다.
    public void setWriter(String writer) {
        this.writer = writer;
    }

    //제목을 주어진 값으로 변경한다.
    public void setTitle(String title) {
        Title = title;
    }

    //암호를 주어진 값으로 변경한다.
    public void setPassword(String password) {
        this.password = password;
    }

    //이메일 주소를 주어진 값으로 변경한다.
    public void setEmail(String email) {
        this.email = email;
    }

    //내용을 주어진 값으로 변경한다.
    public void setArticle(String article) {
        this.article = article;
    }
}
