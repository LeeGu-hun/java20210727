package operator;

public class Exercise01 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;
        b = (byte) i; //큰 -> 작
        ch = (char) b; //-128~127 -> 0~65535
        short s = (short) ch; //0~65535 -> -32768~32767
        float f = (float) l; //생략가능 long보다 float가 표현범위 큼
        i = ch;
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A' 65 의 문자코드는
        System.out.println(1 + x << 2);
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y = y*(10 - x++));
        System.out.println(x+=2); //x = 5
        System.out.println( !('A' <= c && c <='Z') );
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

    }
}
