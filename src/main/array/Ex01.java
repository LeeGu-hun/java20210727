package array;

public class Ex01 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3,};
    int arr2[][] = new int[3][];
    int arr3[] = new int[]{};
    System.out.println(arr3.length);
    String str = "";
    System.out.println(str.length());
    char[] chars = new char[]{};
    int[][] arr4 = {
            { 5, 5, 5, 5, 5},
            { 10, 10, 10},
            { 20, 20, 20, 20},
            { 30, 30}
    };
    ArrayUtil.pr2Arr(arr4);
  }
}
