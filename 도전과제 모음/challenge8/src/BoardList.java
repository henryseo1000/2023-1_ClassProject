import java.util.Scanner;

public class BoardList {
    int num_list;
    int size;
    BoardArticle[] alist;

    BoardList(){
        size = 10;
        alist = new BoardArticle[size];
        num_list = 0;
    }
    public void addArticle(){
        Scanner sc = new Scanner(System.in);
        String name;
        String email;
        String password;
        String title;
        String article;

        System.out.print("작성자: ");
        name = sc.next();
        System.out.print("이메일: ");
        email = sc.next();
        System.out.print("비밀번호: ");
        password = sc.next();
        System.out.print("제목: ");
        title = sc.next();
        System.out.print("글 내용: ");
        article = sc.next();

        if(num_list == size){
            System.out.println("게시판의 크기 부족으로 추가할 수 없습니다.");
        }
        else{
            num_list++;
            alist[num_list - 1] = new BoardArticle(name, email, password, title, article);
        }
    }
    public void printAll(){
        for(int i = 0; i < alist.length; i++){
            if(alist[i] != null){
                System.out.println(alist[i].except_password());
            }
        }
        System.out.println();
    }

    public void modify(){
        Scanner sc = new Scanner(System.in);
        String name;
        String email;
        String password;
        String title;
        String article;
        boolean found = false;

        System.out.print("작성자: ");
        name = sc.next();
        System.out.print("이메일: ");
        email = sc.next();
        System.out.print("비밀번호: ");
        password = sc.next();
        System.out.print("제목: ");
        title = sc.next();
        System.out.print("글 내용: ");
        article = sc.next();

        if(num_list == 0){
            System.out.println("작성된 글이 존재하지 않습니다.");
        }
        else{
            for(int i = 0; i < alist.length; i++){
                if(alist[i] != null){
                    if(alist[i].writer.equals(name) && alist[i].password.equals(password)){
                        alist[i].setTitle(title);
                        alist[i].setEmail(email);
                        alist[i].setArticle(article);
                        found = true;
                    }
                }
            }
        }
        if(!found){
            System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
        }
    }
    public void delete_article(){
        Scanner sc = new Scanner(System.in);
        String name;
        String password;
        int index = 0;
        boolean found = false;

        System.out.print("작성자: ");
        name = sc.next();
        System.out.print("비밀번호: ");
        password = sc.next();

        if(num_list == 0){
            System.out.println("작성된 글이 존재하지 않습니다.");
        }
        else{
            for(int i = 0; i < alist.length; i++){
                if(alist[i] != null){
                    if(alist[i].writer.equals(name) && alist[i].password.equals(password)){
                        index = i;
                        found = true;
                        break;
                    }
                }
            }
        }

        if(found){
            for(int i = index; i < alist.length - 1; i++){
                alist[i] = alist[i + 1];
            }
            alist[alist.length - 1] = null;
        }
        else{
            System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
        }
    }
}
