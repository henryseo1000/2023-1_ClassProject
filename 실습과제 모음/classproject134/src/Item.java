public class Item {
    String name = "";
    int price;
    int left;
    public Item(String n, int p, int l){
        name = n;
        price = p;
        left = l;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getLeft() {
        return left;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void incLeft(int num){
        left += num;
    }

    public void decLeft(int num){
        left -= num;
    }

    public String printAll(){
        return name + "\t" + price + "\t" + left;
    }
}
