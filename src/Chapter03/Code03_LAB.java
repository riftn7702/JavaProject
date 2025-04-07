package Chapter03;

public class Code03_LAB {
    public static void main(String[] args) {
        int[] purchasePrice = {500, 900, 800, 3500, 700, 1000}; // 캔 커피, 삼각 김밥, 바나나맛 우유, 도시락, 콜라, 새우깡
        int[] sellPrice = {1800, 1400, 1800, 4000, 1500, 2000};

        int total = 0;

        total -= purchasePrice[1] * 10;
        total += sellPrice[2] * 2;
        total -= purchasePrice[3] * 5;
        total += sellPrice[3] * 4;
        total += sellPrice[4] * 1;
        total += sellPrice[5] * 4;
        total += sellPrice[0] * 5;

        System.out.println(total);
    }
}
