package Chapter03;

import java.util.Scanner;

public class Code03_10 {
    public static void main(String[] args) {
        Scanner score_input = new Scanner(System.in);

        System.out.println("\n ======== 운전자 합격 조회 프로그램 ======== \n");
        System.out.print("* 운전자 점수 입력 : ");

        int score = score_input.nextInt();
        String result = "";

        if (score >= 70) {
            result = "합격";
        }
        else {
            result = "불합격";
        }
        System.out.printf("현재 성적을 입력한 운전자는 %s입니다.", result);
    }
}
