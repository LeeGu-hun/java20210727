package thread;

public class RunnableEx {
  public static void main(String[] args) {
    NuclearBomb nuclear = new NuclearBomb();
    nuclear.start();

    Bombs bomb = new Bombs();
    Thread t = new Thread(bomb);
    t.start();
  }
}

class NuclearBomb extends Thread { }
class Explosion { }
class Bombs extends Explosion implements Runnable{
  @Override
  public void run() {

  }
}