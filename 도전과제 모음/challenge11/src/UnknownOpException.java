public class UnknownOpException extends Exception{// 허용되지 않는 연산자로 인해 발생하는 예외

    //(1)	Exception 클래스의 생성자 메소드에 ‘허용되지 않는 연산자로 인한 예외’라는 메시지를 넘겨주는 기본 생성자 메소드
    UnknownOpException(){
        super("허용되지 않는 연산자로 인한 예외");
    }

    // (2)	허용되지 않는 연산자를 문자형 매개변수 op로 갖고 Exception 클래스의 생성자 메소드에
    // ‘op는 허용되지 않는 연산자이다.’라는 메시지를 넘겨주는 생성자 메소드
    UnknownOpException(String op){
        super(op + "는 허용되지 않는 연산자이다.");
    }
}
