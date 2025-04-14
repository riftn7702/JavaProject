package Chapter04;

public class DataTypeTest {
    public static void main(String[] args) {
        // 숫자가 아닌 자료형: boolean, char

        boolean boo1 = false;
        boolean boo2 = (100 > 200); //false
        boolean boo3 = !boo1;//true

        char ch1 = 'A';
        char ch2 = 97;

        System.out.println("ch1: " + ch1);
        System.out.println("ch2: " + ch2);
        System.out.println("ch2: " + (char)(ch1 + 3));

        // 숫자 자료형: 정수형, 실수형
        // 정수형
        for (byte byte1 = -3; byte1 <= 3; byte1++) {
            for (int i = 7; i >= 0; i--){
                System.out.print((byte1 >> i) & 1);
            }
            System.out.println("");
        }

        byte byte2 = 127;
        byte byte4 = byte2;

        System.out.println("byte2: " + byte2);
        System.out.println("byte4: " + byte4);

        short short1 = 128;
        short short2 = byte2;

        int int1 = byte2;
        int int2 = short1;
        int int3 = 100000000;

        long long1 = byte2;
        long long2 = short1;
        long long3 = int1;
        long long4 = (long)Math.pow(10, 10);

        float float1 = 123.456f;
        float float2 = (float)200.123;

        // 참조형: 클래스, 인터페이스
        String str1 = new String("hello");
        str1 = "hello";
        String str2 = new String("hello");

        boolean bool4 = str1 == str2;
        System.out.println("str1 == str2 : " + bool4);
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
    }
}
