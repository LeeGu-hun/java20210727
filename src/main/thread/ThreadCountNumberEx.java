package thread;

import javax.swing.*;

public class ThreadCountNumberEx {
  public static void main(String[] args) {
    Bomb b = new Bomb();
    b.start();
    String pickLine = JOptionPane.showInputDialog("빨간선(0), 파란선(1) 중 선택하시오");
    b.pickLine(Integer.parseInt(pickLine));
  }
}

class Bomb extends Thread {
  boolean stopped = false;
  int realLine = (int)(Math.random()*2);
  @Override
  public void run() {
    for (int i = 10; i > 0 ; i--) {
      if(stopped) break;
      System.out.println(i);
      try {Thread.sleep(1000);} catch (InterruptedException e) { }
    }
//    int i = 10;
//    while (i != 0 && !isInterrupted()) {
//      System.out.println(i--);
//      for(long x=0;x<2500000000L;x++);
//    }
    System.out.println("Counter is stopped");
  }
  void pickLine(int pickLine) {
    if(realLine==pickLine){
      System.out.println("휴살았다.");
    } else {
      System.out.println("꽝~!");
    }
//    interrupt();
    stopped = true;
  }
}