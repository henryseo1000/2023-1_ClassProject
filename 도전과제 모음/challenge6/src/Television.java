public class Television {
    String name = ""; // 브랜드 이름
    int channel = 1; // 채널 번호
    int volume = 0; // 볼륨(음량)
    boolean isOn = false; // 전원 (꺼지면 false, 켜지면 true)

    public String getName() {
        return name;
    }
    public int getChannel() {
        return channel;
    }
    public int getVolume() {
        return volume;
    }
    public boolean isOn() {
        return isOn;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setChannel(int channel) {
        if(1 <= channel && channel <= 99 && isOn){
            this.channel = channel;
        }
        else {
            System.out.println("오류 : 새 채널 번호는 유효한 범위 안에 있어야 한다");
        }
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setOn(boolean on) {
        isOn = on;
    }

    public void printAll(){
        System.out.println("브랜드 이름 : " + name + ", " + "전원 : " + isOn + ", " + "채널 번호 : " + channel + ", " + "볼륨 : " + volume + ", ");
    }

    public void incChannel(){
        if(1 <= channel && channel <= 99){
            if(channel == 99){
                channel = 1;
            }
            else{
                channel++;
            }
        }
        else {
            System.out.println("오류 : 새 채널 번호는 유효한 범위 안에 있어야 한다");
        }
    }

    public void decChannel(){
        if(1 <= channel && channel <= 99){
            if(channel == 1){
                channel = 99;
            }
            else {
                channel--;
            }
        }
        else {
            System.out.println("오류 : 새 채널 번호는 유효한 범위 안에 있어야 한다");
        }
    }

    public void incVolume(){
        if(volume != 12) {
            volume++;
        }
    }

    public void decVolume(){
        if(volume != 0) {
            volume--;
        }
    }
}
