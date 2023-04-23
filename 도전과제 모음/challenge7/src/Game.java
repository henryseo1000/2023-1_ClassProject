import java.util.Scanner;

public class Game {
    int goal_score; // 목표 점수
    PairOfDice dice; // 주사위 객체
    Player person; // 사용자
    Player com; // 컴퓨터
    Player turn; // 차례를 나타내는 객체

    // 객체를
    Game(int goal){
        goal_score = goal; // 목표 점수를 설정한다.
        dice = new PairOfDice();
        person = new Player(goal_score);
        com = new Player(goal_score);

        // 사용자를 -1로 설정해도 게임이 잘 진행되기는 하지만 사용자에게 계속 던질 것인지 물을 수가 없습니다.
        // 제가 짠 알고리즘은 한도점수 이상이면 게임이 끝나는 것인데, -1이 한도 점수일 경우 주사위를 한 번 던지고 끝납니다.
        person.setLimit(20);
        com.setLimit(20); // 컴퓨터는 한도점수가 20이다.
    }

    // 게임을 실행한다.
    public void start(){
        turn = com;
        while(true){
            System.out.println("****************************************");

            rollDice();

            if(turn.getTotal_score() >= goal_score){
                break;
            }

            if(turn == com){
                turn = person;
            }
            else {
                turn = com;
            }
        }
        printFinal();
    }

    // 주사위를 던지고 누구의 차례인지 알려준다.
    public void rollDice(){
        Scanner sc = new Scanner(System.in);
        String answer = "";

        if(turn == com){
            System.out.println("컴퓨터 차례...");
        }
        else {
            System.out.println("사용자 차례...");
        }

        while(true) {
            System.out.println("\n현 점수:");
            System.out.println("\t컴퓨터: " + com.getTotal_score());
            System.out.println("\t사용자: " + person.getTotal_score());

            if(turn.play(dice, turn.limit)){
                System.out.println("현 회차 점수: " + turn.getAdd_score());
                System.out.println("총점: " + turn.getTotal_score());
                if(turn.getTotal_score() >= goal_score){
                    break;
                }
                if(turn == person){
                    System.out.print("\n계속 던지시겠습니까 (y/n)? ");
                    answer = sc.next();
                    if(answer.equals("n")){
                        break;
                    }
                }
            }
            else {
                turn.setAdd_score(0);
                break;
            }
        }
    }

    // 최종 결과를 출력한다.
    public void printFinal(){
        if(turn == com){
            System.out.println("\n컴퓨터가 이겼습니다.");
        }
        else {
            System.out.println("\n축하합니다. 사용자가 이겼습니다.");
        }
        System.out.println("최종 결과:");
        System.out.println("컴퓨터 점수:" + com.getTotal_score());
        System.out.println("사용자 점수:" + person.getTotal_score());

    }
}
