package thread;

public class DaemonThreadEx implements Runnable{
  static boolean autoSave = false;
  public static void main(String[] args) {
    Thread t = new Thread(new DaemonThreadEx());
    t.setDaemon(true); //해당프로세스가 종료되기전까지 죽지않음
    t.start();
    for (int i = 0; i <= 10; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) { }
      System.out.println(i);
      if(i==5) autoSave = true;
    }
    System.out.println("시스템 종료");
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(1000*3);
      } catch (InterruptedException e) { }
      if(autoSave) autoSave();
    }
  }
  public void autoSave() {
    System.out.println("작업이 저장되었습니다.");
  }
}
