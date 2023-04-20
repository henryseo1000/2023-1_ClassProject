public class Television {
    String name = ""; // 브랜드 이름
    int channel = 1; // 채널 번호
    int volume = 0; // 볼륨(음량)
    boolean isOn = false; // 전원 (꺼지면 false, 켜지면 true)

    public String getName() {
        return name;
    } // 브랜드 이름을 반환
    public int getChannel() {
        return channel;
    } // 채널 번호를 반환
    public int getVolume() {
        return volume;
    } // 음량 크기를 반환
    public boolean getOn() {
        return isOn;
    } // 전원 켜짐 여부를 반환
    public void setName(String name) {
        this.name = name;
    } // 브랜드 이름을 지정

    // 채널 번호를 지정
    public void setChannel(int channel) {
        // 새 채널 번호가 1 ~ 99이고, 전원이 켜져 있으면 바꾼다.
        if(1 <= channel && channel <= 99 && isOn){
            this.channel = channel;
        }
        // 그 외는 오류 메시지 출력
        else {
            System.out.println("오류 : 새 채널 번호는 유효한 범위 안에 있어야 한다");
        }
    }

    // 볼륨을 지정
    public void setVolume(int volume) {
        // 새 볼륨이 0 ~ 12이고, 전원이 켜져 있으면 바꾸기
        if(0 <= volume && volume <= 12 && isOn){
            this.volume = volume;
        }
        // 그 외는 오류 메시지 출력
        else {
            System.out.println("오류 : 새 음량은 유효한 범위 안에 있어야 한다");
        }
    }

    // 전원 켜짐 여부 반환
    public void setOn(boolean on) {
        isOn = on;
    }

    // 현재 객체의 각 속성을 출력
    public void printAll(){
        System.out.println("브랜드 이름 : " + name + ", " + "전원 : " + isOn + ", " + "채널 번호 : " + channel + ", " + "볼륨 : " + volume);
    }

    // 채널 번호를 1 증가
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

    // 채널 번호를 1 감소
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

    // 볼륨을 1 증가
    public void incVolume(){
        if(volume != 12) {
            volume++;
        }
    }

    // 볼륨을 1 감소
    public void decVolume(){
        if(volume != 0) {
            volume--;
        }
    }
}
