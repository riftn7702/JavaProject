package Chapter02;

public class Code02_09 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        double result;

        result = num1 + num2;
        System.out.printf("%d + %d = %.2f\n", num1, num2, result);

        result = num1 - num2;
        System.out.printf("%d - %d = %.2f\n", num1, num2, result);

        result = num1 * num2;
        System.out.printf("%d * %d = %.2f\n", num1, num2, result);

        result = num1 / num2;
        System.out.printf("%d / %d = %.2f\n", num1, num2, result);

        //정수와 정수를 연산하면 정수가 나오므로 위의 결과값은 0.00이 나온다.

        result = num1 / (double)num2;
        System.out.printf("%d / %d = %.2f\n", num1, num2, result);

        //만약 실수형으로 하고 싶다면 형변환을 통해 둘 중 하나를 실수형으로 바꾼 뒤 연산한다. 따라서 위의 결과값은 0.50이다.
    }
}
