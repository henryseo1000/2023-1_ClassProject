import java.util.Scanner;

public class Game {
    int goal_score;
    PairOfDice dice;
    Player person;
    Player com;
    Player turn;

    Game(int goal){
        goal_score = goal;
        dice = new PairOfDice();
        person = new Player(goal_score);
        com = new Player(goal_score);
        person.setLimit(20);
        com.setLimit(20);
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        String answer = "";
        turn = com;
        while(true){
            System.out.println("****************************************");
            if(turn == com){
                System.out.println("컴퓨터 차례...");
            }
            else {
                System.out.println("사용자 차례...");
            }

            System.out.println("현 점수:");
            System.out.println("\t컴퓨터: " + com.getTotal_score());
            System.out.println("\t사용자: " + person.getTotal_score());

            while(true) {
                if(turn.play(dice, turn.limit)){
                    System.out.println("dice:" + dice.getNum1() + " + " + dice.getNum2() + " = " + (dice.getNum1() + dice.getNum2()));
                    System.out.println("현 회차 점수: " + (dice.getNum1() + dice.getNum2()));
                    System.out.println("총점: " + turn.add_score);
                    if(turn.getTotal_score() >= goal_score){
                        break;
                    }
                    if(turn == person){
                        System.out.print("계속 던지시겠습니까 (y/n)? ");
                        answer = sc.next();
                        if(answer.equals("n")){
                            break;
                        }
                    }
                }
                else {
                    System.out.println("꽝입니다!!!");
                    break;
                }
            }

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
        if(turn == com){
            System.out.println("컴퓨터가 이겼습니다.");
        }
        else {
            System.out.println("축하합니다. 사용자가 이겼습니다.");
        }
    }
}
