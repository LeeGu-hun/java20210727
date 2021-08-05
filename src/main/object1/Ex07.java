package object1;

public class Ex07 {
  public static void main(String[] args) {
    Marine marine = new Marine();
    System.out.println(marine.weapon);
    Marine marine2 = new Marine();
    System.out.println(marine2.weapon);

    marine.weaponUp();

    System.out.println(marine.weapon);
    System.out.println(marine2.weapon);
  }
}

class Marine {
  int x,y; // Marine (x,y) 의 위치좌표
  int hp = 60; // 현재 체력
  static int weapon = 6; // 공격력
  static int armor = 0; // 방어력

  void weaponUp() {
    //클래스 멤버(static 붙어 있는 메서드)에는 this 사용 안됨!
    this.weapon++;
  }
  static void armorUp() {
    // this.armor++; //static 메서드에서는 this 사용 안됨
    armor++;
  }
  void move(int x, int y) {
    this.x = x; // this.x , x 는 인스턴스 변수 는 지역변수
    this.y = y; // this.y , y 는 인스턴스 변수 는 지역변수
  }

}