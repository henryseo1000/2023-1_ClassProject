public class BoardArticle {
    String writer; // 작성자
    String Title; // 제목
    String password; // 암호
    String email; // 이메일 주소
    String article; // 내용

    BoardArticle(String w, String t, String p, String e, String a){
        writer = w;
        Title = t;
        password = p;
        email = e;
        article = a;
    }
    public String except_password(){
        return "작성자: " + writer + ", 이메일: " + email + ", 제목: " + Title + ", 글 내용: " + article;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
