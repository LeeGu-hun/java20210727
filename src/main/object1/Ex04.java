package object1;

public class Ex04 {
  public static void main(String[] args) {
    System.out.println(MyPoint.getDistance(1,1,2,2));
    MyPoint p = new MyPoint(1,1);
    System.out.println(p.getDistance(2,2));
  }
}

class MyPoint {
  int x, y;
  public MyPoint(int x, int y) {this.x = x;this.y = y;}
  //6-4문제
  static double getDistance(int x, int y, int x1, int y1) {
    return Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
  }
  //6-6문제
  double getDistance(int x, int y) {
    return Math.sqrt(Math.pow((this.x-x),2) + Math.pow((this.y-y),2));
  }
}