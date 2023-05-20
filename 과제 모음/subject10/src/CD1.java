public class CD1 extends CD{  // 단리 정기예금

    CD1(String n, int num, int p, double i, int init){
        super(n, num, p, i, init);
    }

    public int Calculate() {
        return (int)(initial + initial * (interest_rate / 12) * period);
    }
}
