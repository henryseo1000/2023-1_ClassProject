public class Player {
    int total_score = 0; // 총 점수
    int add_score = 0; // 회차 점수
    int goal_score = 0; // 목표 점수
    int limit = 0; // 한도 점수

    // 총점과 회차 점수 초기화, 목표 점수를 세팅하며 객체 생성
    Player(int goal){
        total_score = 0;
        add_score = 0;
        goal_score = goal;
    }

    // 주사위를 잡고 던지며, 한도 점수가 있다면 한도 점수를 고려해 게임합니다.
    public boolean play(PairOfDice p1, int limit){
        p1.rollTwo();

        System.out.println("\nDice: " + p1.getNum1() + " + " + p1.getNum2() + " = " + (p1.getNum1() + p1.getNum2()));

        if(p1.getNum1() == 1 && p1.getNum2() == 1){
            System.out.println("\n꽝입니다!!!");
            total_score = 0;
            return false;
        }
        else if(p1.getNum1() == 1 || p1.getNum2() == 1){
            System.out.println("\n꽝입니다!!!");
            return false;
        }
        else{
            add_score += p1.getNum1() + p1.getNum2();
            total_score += p1.getNum1() + p1.getNum2();
            if(limit <= add_score){
                System.out.println("현 회차 점수: " + getAdd_score());
                System.out.println("총점: " + getTotal_score());
                add_score = 0;
                return false;
            }
            else {
                return true;
            }
        }
    }

    // 총점을 반환한다.
    public int getTotal_score() {
        return total_score;
    }

    // 한도 점수를 설정한다.
    public void setLimit(int limit) {
        this.limit = limit;
    }

    // 한도 점수를 반환한다.
    public int getLimit() {
        return limit;
    }

    // 회차 점수를 반환한다.
    public int getAdd_score() {
        return add_score;
    }

    // 회차 점수를 세팅한다.
    public void setAdd_score(int add_score) {
        this.add_score = add_score;
    }
}
