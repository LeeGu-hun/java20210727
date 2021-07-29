package operator;
import static java.lang.Math.*;

public class Exercise03 {
    public static void main(String[] args) {
        int num = 456;
        System.out.println((int)(floor(num/pow(10,2))*pow(10,2)));
        System.out.println(num % 100 > 0 ? num / 100 * 100 : num);
        System.out.println(num/100*100);
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
//        int numOfBucket = numOfApples/sizeOfBucket
//                + (numOfApples%sizeOfBucket > 0 ? 1 : 0) ;
        int numOfBucket = (int)ceil(numOfApples/(float)sizeOfBucket) ;
        System.out.println(" :"+numOfBucket);
        System.out.println(num>0?"양수":num==0?"0":"음수");

        int fahrenheit = 100;
        float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
