package object2;

public class InheritanceAndInterfaceEx {
  public static void main(String[] args) {

  }
}

class SiegeTank extends Terran{

}
class BattleCruiser extends Terran implements Flyable, Groudable{
  @Override
  public void fly() {

  }
}
interface Flyable {
  static int ENGINE = 4; //public final static int ENGINE = 4;
  void fly(); // public abstract void fly();
}
interface Groudable {

}