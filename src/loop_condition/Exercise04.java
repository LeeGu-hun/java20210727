package loop_condition;

public class Exercise04 {
  public static void main(String[] args) {
    int total = 0;
    int i = 1;
    while (true) {
      total += (i%2==0?-i:i);
      i++;
      if(total>=100) break;
    }
    System.out.println(i);
  }
}
