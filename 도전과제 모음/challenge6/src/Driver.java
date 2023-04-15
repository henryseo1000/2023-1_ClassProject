// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Driver {
    public static void main(String[] args) {
        Television t1 = new Television();
        t1.setName("삼성");
        t1.setOn(true);
        t1.setChannel(1);
        t1.setVolume(6);
        t1.printAll();
        t1.decChannel();
        t1.incVolume();
        t1.printAll();

        Television t2 = new Television();
        t2.setName("엘지");
        t2.setOn(true);
        t2.setChannel(98);
        t2.setVolume(12);
        t2.printAll();
        t2.incChannel();
        t2.incVolume();
        t2.printAll();
    }
}