public class Player {
    int total_score = 0;
    int add_score = 0;
    int goal_score = 0;
    int limit = 0;

    Player(int goal){
        total_score = 0;
        add_score = 0;
        goal_score = goal;
    }

    public boolean play(PairOfDice p1, int limit){
        p1.rollTwo();

        if(p1.getNum1() == 1 && p1.getNum2() == 1){
            total_score = 0;
            return false;
        }
        else if(p1.getNum1() == 1 || p1.getNum2() == 1){
            return false;
        }
        else{
            add_score += p1.getNum1() + p1.getNum2();
            total_score += p1.getNum1() + p1.getNum2();
            if(limit <= add_score){
                add_score = 0;
                return false;
            }
            else {
                return true;
            }
        }
    }

    public int getTotal_score() {
        return total_score;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
}
