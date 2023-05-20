
public class CD2 extends CD{  //복리 정기예금

    CD2(String n, int num, int p, double i, int init){
        super(n, num, p, i, init);
    }
    @Override
    public int Calculate() {
        return (int)(initial * Math.pow(1 + interest_rate / 12, period));
    }
}
