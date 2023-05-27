public class DivideByZeroException extends Exception{// 나눗셈에서 0으로 나누려고 시도하여 발생하는 예외

    //(1)	Exception 클래스의 생성자 메소드에 ‘0으로 나누려고 시도!’라는 메시지를 넘겨주는 기본 생성자 메소드
    DivideByZeroException(){
        super("0으로 나누려고 시도!");
    }

    //(2)	예외가 발생한 이유를 매개변수로 갖는 생성자 메소드.
    DivideByZeroException(String message){
        super(message);
    }
}
