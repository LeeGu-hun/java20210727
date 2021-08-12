package lambda;

import java.util.function.*;

public class Ex14_3PredicateFunctionMulti {
	public static void main(String[] args) {
		//1. Function Ÿ���� ���ٽ� 2���� �ռ��ؼ� ���ο� ���ٽ��� ����� ����

		Function<String, Integer>	f  = (s) -> Integer.parseInt(s, 16);
		//���ٽ��� �ϳ��� �޼��常 ȣ���ϴ� ���, �޼��� ������ ���� ���ٽ��� ������ �� �� �ִ�.
		//Ŭ������::�޼���� �Ǵ� ��������::�޼����
		Function<Integer, String>	g  = Integer::toBinaryString;
		System.out.println(Integer.toBinaryString(10));  // "10"�� ����

		Function<String, String>    h  = f.andThen(g);
		Function<Integer, Integer>  h2 = f.compose(g);

		System.out.println(h.apply("FF")); // "FF" �� 255 �� "11111111"
		System.out.println(h2.apply(2));   // 2 �� "10" �� 16

		Function<String, String> f2 = x -> x; // �׵� �Լ�(identity function)
		System.out.println(f2.apply("AAA"));  // AAA�� �״�� ��µ�

		//2. Predicate Ÿ���� ���ٽ� 2�� �̻� �ռ��ؼ� ���ο� ���ٽ��� ����� ����
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate(); // i >= 100

		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150)); //true (150>=100)&&(150<200 || (150%2==0))

		// str1�� str2�� ������ ���� ����� ��ȯ
		String str1 = "abc";
		String str2 = "abc";
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);   
		System.out.println(result);
	}
}