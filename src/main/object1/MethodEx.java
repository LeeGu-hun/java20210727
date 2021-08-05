package object1;

public class MethodEx {
  public static void main(String[] args) {
    MyMath mm = new MyMath();
    System.out.println(mm.add(10, 20));;
  }
}

class MyMath {
  //return type void, 기본형 8가지, 참조형 총 10가지
  void add() {
    System.out.println();
    return;
  }
  //오버로딩 규칙 이: 이름이 같다, 매: 매개변수 다르다, 리: 리턴타입 상관없다.
  boolean add(boolean arg) {
    boolean result = false;
    return result;
  }
  boolean add(char arg) {return true;}
  short add(byte arg) {return 0;}
  short add(short arg) {return 0;}
  int add(int arg) {return 0;}
  long add(long arg) {return (long)0;}
  float add(float arg) {return 0.0f;}
  double add(double arg) {return 0.0;}
  int[] add(int[] arg){return new int[]{0};}
  String add(String arg){return "";}
  Car add(Car arg) {return new Car();}
  Car[] add(Car[] arg) {return new Car[]{new Car()};}
//  void subtract(){}
  int subtract(){return 0;}

  public long add(int i, int i1) {
    long result;
    result =  (long)i + i1;
    return result;
  }

  //리턴타입 메서드명(){    }
}

class Car {}
