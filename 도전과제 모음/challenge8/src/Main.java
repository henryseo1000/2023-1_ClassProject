import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoardList l1 = new BoardList();
        int answer = 0;

        while(true){
            System.out.println("원하는 작업을 선택하세요.");
            System.out.println("1. 게시판 글쓰기");
            System.out.println("2. 글 목록 보기");
            System.out.println("3. 글 수정");
            System.out.println("4. 글 삭제");
            System.out.println("5. 종료");

            answer = sc.nextInt();

            if(answer == 1){
                System.out.println("게시판에 글을 작성하세요.");
                l1.addArticle();
            }
            else if(answer == 2){
                System.out.println("게시판 목록\n");
                l1.printAll();
            }
            else if(answer == 3){
                System.out.println("게시판 글을 수정하세요.");
                l1.modify();
            }
            else if(answer == 4){
                System.out.println("게시판 글을 삭제하세요.");
                l1.delete_article();
            }
            else if(answer == 5){
                break;
            }
            else{
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }
    }
}