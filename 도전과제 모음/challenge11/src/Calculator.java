import java.util.Scanner;

public class Calculator {
    double result = 0;
    boolean validation = true;

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

    public void input() throws Exception{
        Scanner sc = new Scanner(System.in);
        String op = "";
        double answer = 0;
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

    public void Start() throws Exception{
        Scanner sc = new Scanner(System.in);
        String op = "";
        double d2;
        double answer = 0;
        Calculator c1 = new Calculator();

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

    public void Zero_Err(){
        System.out.println("0 혹은 0에 아주 가까운 값으로 나누려고 시도하여\n프로그램이 중단되었습니다.");
    }

    public void Op_Err() throws Exception{
        System.out.println("처음부터 다시 시작하세요.");
        System.out.println("연산식을 나타내는 각 라인  (line)의  포맷 : 연산자 숫자\n예: + 3\n끝내려면 e(혹은 E)를 입력하세요.");
        result = 0;
        input();
    }
}
