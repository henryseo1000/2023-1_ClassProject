import java.util.Scanner;

public class Calculator {
    double result = 0;
    boolean validation = true;

    Calculator(){

    }

    public void Start(){
        Scanner sc = new Scanner(System.in);
        String op = "";
        double d2;
        double answer = 0;
        System.out.println("계산기 시작합니다.");
        while(true) {
            System.out.println("연산식을 나타내는 각 라인(line)의  포맷 : 연산자 숫자\n예: + 3\n끝내려면 e(혹은 E)를 입력하세요.\n");
            System.out.println("result = " + result);
            try {
                while(true) {
                    op = sc.next();
                    if (op.equals("e") || op.equals("E")) {
                        break;
                    }

                    d2 = sc.nextDouble();
                    if(d2 == 0){
                        throw new ArithmeticException();
                    }
                    answer = Calculate(d2, op);
                    if (validation) {
                        System.out.println("갱신된 result = " + answer);
                    }
                    else {
                        throw new OperatorException(op + "는 허용되지 않는 연산자이다.\n처음부터 다시 시작하세요.");
                    }
                }
                System.out.println("최종 result = " + result);
                System.out.println("계산기 프로그램이 종료합니다.");
                break;
            }
            catch (OperatorException e) {
                System.out.println(e.getMessage());
            }
            catch (ArithmeticException e) {
                System.out.println("0 혹은 0에 아주 가까운 값으로 나누려고 시도하여\n프로그램이 중단되었습니다.");
                break;
            }
        }
    }

    public double Calculate(double d1, String operator){
        double answer = 0;
        validation = true;

        if (operator.equals("+")) {
            answer = result + d1;
            System.out.println("result + " + d1 + " = " + answer);
        }
        else if (operator.equals("-")) {
            answer = result - d1;
            System.out.println("result - " + d1 + " = " + answer);
        }
        else if (operator.equals("*")) {
            answer = result * d1;
            System.out.println("result * " + d1 + " = " + answer);
        }
        else if (operator.equals("/")) {
            answer = result / d1;
            System.out.println("result / " + d1 + " = " + answer);
        }
        else {
            validation = false;
        }
        result = answer;

        return answer;
    }
}
