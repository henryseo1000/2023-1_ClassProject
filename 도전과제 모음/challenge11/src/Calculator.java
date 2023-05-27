import java.util.Scanner;

public class Calculator {
    double result = 0;

    //result를 0으로 초기화하면서 Calculator 객체를 생성한다.
    Calculator(){
        result = 0;
    }

    //result를 반환한다.
    public double getResult() {
        return result;
    }

    //result의 값을 넘겨 받은 값으로 변경한다
    public void setResult(double result) {
        this.result = result;
    }

    //(4)	사용자로부터 ‘연산자 숫자’의 형태로 연산식을 입력 받거나 ‘e’(혹은 ‘E’)를 입력 받는다. 연산자가 입력되면 숫자를 피연산자로 하여 대응하는
    // 연산을 수행하고 갱신된 결과를 출력하고 사용자로부터 계속 입력을 받는다. ‘e’(혹은 ‘E’)가 입력되면 메소드 수행을 종료한다.
    public void input() throws Exception{
        Scanner sc = new Scanner(System.in);
        String op = "";
        double d1;

        System.out.println("\nresult = " + result);


        while (true) {
            op = sc.next();
            if (op.equals("e") || op.equals("E")) {
                break;
            }

            d1 = sc.nextDouble();

            result = Calculate(op, result, d1);

            System.out.println("갱신된 result = " + result + "\n");
        }
        System.out.println("최종 result = " + result);
        System.out.println("계산기 프로그램이 종료합니다.");
    }

    //(8)	Calculator 객체를 생성한다. 그리고 나서 다음을 순서대로 출력한다.
    //	계산기 시작합니다.
    //	연산식을 나타내는 각 라인(line)의 포맷:
    //	연산자 숫자
    //	예: + 3
    //	끝내려면 e(혹은 E)를 입력하세요.
    //다음으로 (4)번을 수행하는 메소드를 호출한다.
    // 만약 호출된 메소드에서 UnknownOpException이나 DivideByZeroException이라는
    // 예외가 발생하면 각각 (6) 번이나 (7) 번을 수행하는 메소드를 호출하여 예외를 처리해야 한다.
    // 예외가 발생하지 않으면 최종 결과값(result의 값)과 ‘계산기 프로그램이 종료합니다.’를 출력하고 프로그램을 종료해야 한다.
    public void Start() throws Exception{
        System.out.println("계산기 시작합니다.");
        System.out.println("연산식을 나타내는 각 라인(line)의  포맷 : 연산자 숫자\n예: + 3\n끝내려면 e(혹은 E)를 입력하세요.");
        try {
            input();
        }
        catch (UnknownOpException e) {
            System.out.println(e.getMessage());
            Op_Err();
        }
        catch (DivideByZeroException e) {
            Zero_Err();
        }
    }

    // (5)	연산자를 나타내는 문자 op, 첫 번째 피연산자 oprd1과 두 번째 피연산자 oprd2를 넘겨 받아 연산 ‘oprd1 op oprd’를 수행하고 결과를 반환한다.
    // 허용되는 연산자는 '+', '-', '*', 혹은 '/'이다.
    // 만약 op가 허용되지 않는 연산자라면 op를 매개변수로 갖는 UnknownOpException이라는 예외를 발생시켜야 한다.
    // 만약 op가 /이고 oprd2가 0 이거나 0.0001보다 작고 -0.0001보다 크다면 DivideByZeroException이라는 예외를 발생시켜야 한다.
    public double Calculate(String op, double oprd1, double oprd2) throws Exception{
        double answer = 0;

            if (op.equals("+")) {
                answer = oprd1 + oprd2;
                System.out.println("result + " + oprd2 + " = " + answer);
            }
            else if (op.equals("-")) {
                answer = oprd1 - oprd2;
                System.out.println("result - " + oprd2 + " = " + answer);
            }
            else if (op.equals("*")) {
                answer = oprd1 * oprd2;
                System.out.println("result * " + oprd2 + " = " + answer);
            }
            else if (op.equals("/")) {
                if(oprd2 == 0 || (oprd2 < 0.0001 && oprd2 > -0.0001)){
                    throw new DivideByZeroException("0 혹은 0에 아주 가까운 값으로 나누려고 시도하여\n프로그램이 중단되었습니다.");
                }
                answer = oprd1 / oprd2;
                System.out.println("result / " + oprd2 + " = " + answer);
            }
            else {
                throw new UnknownOpException(op);
            }

        return answer;
    }

    // (6)	DivideByZeroException이라는 예외를 처리하기 위해 ‘0 혹은 0에 아주 가까운 값으로 나누려고 시도하여 프로그램이 중단되었습니다.’를 출력하고 프로그램을 종료시킨다.
    public void Zero_Err(){
        System.out.println("0 혹은 0에 아주 가까운 값으로 나누려고 시도하여\n프로그램이 중단되었습니다.");
    }

    //(7)	UnknownOpException이라는 예외를 처리하기 위해 다음을 순서대로 출력한다.
    //	처음부터 다시 시작하세요.
    //	연산식을 나타내는 각 라인(line)의 포맷:
    //	연산자 숫자
    //	예: + 3
    //	끝내려면 e(혹은 E)를 입력하세요.
    //다음으로 (4)번을 수행하는 메소드를 호출한다.
    public void Op_Err() throws Exception{
        System.out.println("처음부터 다시 시작하세요.");
        System.out.println("연산식을 나타내는 각 라인  (line)의  포맷 : 연산자 숫자\n예: + 3\n끝내려면 e(혹은 E)를 입력하세요.");
        result = 0;
        input();
    }
}
